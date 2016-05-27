package tn.pnud.training.listners;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRegistration;
import javax.servlet.annotation.WebListener;

import tn.pnud.training.servlets.MyServlet;

@WebListener
public class DynamicServletAddingListner implements ServletContextListener {

	public DynamicServletAddingListner() {
	}

	public void contextDestroyed(ServletContextEvent sce) {
	}

	public void contextInitialized(ServletContextEvent sce) {
		ServletContext context = sce.getServletContext();
		ServletRegistration.Dynamic dynamic = context.addServlet("MyServlet", MyServlet.class);
		dynamic.addMapping("/MyServlet");
		dynamic.setInitParameter("nom", "Chamakh");
		dynamic.setInitParameter("prenom", "Adel");


	}

}
