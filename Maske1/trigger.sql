 CREATE OR REPLACE FUNCTION VokabelIncFuncion()
 RETURNS "trigger" AS
 $BODY$
 BEGIN
   IF (New.id is null) THEN
     New.id:=nextval('hibernate_sequence');   
   END IF;
   Return NEW;
 END;
 $BODY$
 LANGUAGE 'plpgsql' VOLATILE;

DROP TRIGGER VokabrlTrigger1

 CREATE TRIGGER VokabrlTrigger1
 BEFORE INSERT
 ON vokabel 
 FOR EACH ROW
 EXECUTE PROCEDURE VokabelIncFuncion();

 insert into vokabel (seite1, version) values ('hallo44', 1);