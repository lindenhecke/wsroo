package de.proiectus.job.gui;

import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.data.util.sqlcontainer.SQLContainer;
import com.vaadin.data.util.sqlcontainer.connection.JDBCConnectionPool;
import com.vaadin.data.util.sqlcontainer.connection.SimpleJDBCConnectionPool;
import com.vaadin.data.util.sqlcontainer.query.TableQuery;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.Table;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
@Theme("maske1")
public class Maske1UI extends UI {

	@WebServlet(value = "/*", asyncSupported = true)
	@VaadinServletConfiguration(productionMode = false, ui = Maske1UI.class)
	public static class Servlet extends VaadinServlet {
	}

	@Override
	protected void init(VaadinRequest request) {
		SQLContainer container = null;
		try {
			JDBCConnectionPool pool = new SimpleJDBCConnectionPool(
					"org.postgresql.Driver",
					"jdbc:postgresql://localhost:5432/postgres", "postgres",
					"aabb11", 2, 5);
			TableQuery tq = new TableQuery("vokabel", pool);
			container = new SQLContainer(tq);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Table table = new Table("Table Vokabeln");
		table.setContainerDataSource(container);
		table.setEditable(true);

		
		final VerticalLayout layout = new VerticalLayout();
		layout.setMargin(true);
		setContent(layout);

		Button button = new Button("Click Me!");
		button.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				setContent(new maske2());
				layout.addComponent(new maske2());
				layout.addComponent(new Label("Thank you for clicking"));
			}
		});
		layout.addComponent(table);
		layout.addComponent(button);
	}

}














