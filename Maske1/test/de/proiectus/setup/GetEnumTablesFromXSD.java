package de.proiectus.setup;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;

public class GetEnumTablesFromXSD {

	public static void main(String [] args) {
		BufferedReader reader;
		try {
			String name="";
			String attributeString="";
			String rooScript="";
			String sqlInitScript="";
			int tempIDs = 1;
			ArrayList<String> fields=new ArrayList<String>();
			HashMap<String,String> enums=new HashMap<String,String>();

			//roo-script for generation in shell:"script -file fileName"
			rooScript += "// Spring Roo 1.3.1.RC1 [rev 4877cfb] log opened at 2015-02-23 09:09:06\n";
			rooScript += "project --topLevelPackage de.arbeitskraft --projectName JobListing --java 7 --packaging JAR\n";
			rooScript += "// Spring Roo 1.3.1.RC1 [rev 4877cfb] log closed at 2015-02-23 09:09:07\n";
			rooScript += "// Spring Roo 1.3.1.RC1 [rev 4877cfb] log opened at 2015-02-23 09:09:15\n";

			
			int mode=0;
			reader = Files.newBufferedReader(Paths.get("./XSDs/HRBAXML_JobPosting.xsd"), StandardCharsets.UTF_8);
			for (String line = reader.readLine(); line != null; line = reader.readLine()) {
				if(line.contains("<xs:element")) {
					name = line.replaceAll(".*element name=\"([^\"]*).*", "$1");
					if(name.equalsIgnoreCase("Data")) continue;
					fields.add(name);
					attributeString="";
					//System.out.println("Found:" + name);
				}
				//Attribute sammeln
				else if(mode==0 && line.contains("ATTRIBUTE:")) {
					mode=1;
					attributeString=line.trim().substring(line.trim().indexOf("ATTRIBUTE:")+"ATTRIBUTE:".length());
					//String name = line.replaceAll(".*element name=\"([^\"]*).*", "$1");
					//System.out.println(name);
					//System.out.println(line);
				}
				//Attribute verarbeiten
				else if(mode==1 && line.contains("/xs:documentation")) {
					mode=0;
					//String name = line.replaceAll(".*element name=\"([^\"]*).*", "$1");
					attributeString = attributeString.replaceAll(", ", ",").replaceAll(" ,", ",");
					enums.put(name,name);
					System.out.println("Enum:" + name);
					System.out.println("Attr:" + attributeString);
					String[] attributes = attributeString.split(",");
					String name2=name.replaceAll("([A-Z])", "_$1" );
					name2=name2.replaceAll("_(.*)", "$1");
					name2=name2.toLowerCase();
					for(String tempStr : attributes) {
						String id = tempStr.trim().replaceAll("(.*)"+Pattern.quote("(")+"([^"+Pattern.quote(")")+"]*).*","$2");
						String value = tempStr.trim().replaceAll("(.*)"+Pattern.quote("(")+"([^"+Pattern.quote(")")+"]*).*","$1");
						System.out.println(id+","+value);	
						int val=0;
						try{
							val=new Integer(id);
						}catch (NumberFormatException e){
							val=0;
						}
						sqlInitScript+="INSERT INTO " + name2 + " (id, bezeichnung, nummer,version) VALUES("+(tempIDs++) + ",'"+value+"'," +val+","+"1);\n"; 
					}
				}
				else if(mode==1) {
					attributeString = attributeString + " " + line.trim();
				}
			}
			
			//Setup entities with fields and ENUM-entities
			rooScript += "jpa setup --provider HIBERNATE --database HYPERSONIC_PERSISTENT\n";
			for(String tempStr : enums.keySet()) {
				rooScript += "entity jpa --class ~.data."+tempStr+" --testAutomatically\n";
				rooScript += "field string --fieldName bezeichnung\n";				
				rooScript += "field number --type long --fieldName nummer\n";				
			}
			rooScript += "entity jpa --class ~.data.JobPosting --testAutomatically\n";
			for(String tempStr : fields) {
				if(enums.containsKey(tempStr)) {
					rooScript += "field reference --fieldName "+tempStr+" --type ~.data."+tempStr+"\n";					
				} else {
					rooScript += "field string --fieldName "+tempStr+"\n";					
				}
			}

			//Setup graphical enviroment
			rooScript += "web jsf setup --implementation APACHE_MYFACES --theme EGGPLANT \n";
			rooScript += "web jsf all --package ~.jsf\n";
			System.out.println(rooScript);
			Files.write(Paths.get("./roo.log"),rooScript.getBytes());
			Files.write(Paths.get("./initDB.sql"),sqlInitScript.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}	