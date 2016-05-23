package tn.pnud.training.listners;

import java.util.Enumeration;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

public class CustomContextListner implements ServletContextListener {

	public CustomContextListner() {
	}

	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("The Servlet context is destroyed");
	}

	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("The Servlet context is now initialized");
		Enumeration<String> enumeration = sce.getServletContext().getInitParameterNames();
		System.out.println("The Servlet context has initialized several parameters :");
		while (enumeration.hasMoreElements()) {
			String initParamName = enumeration.nextElement();
			System.out.println("initParam name is : " + initParamName + " it's value is : "
					+ sce.getServletContext().getInitParameter(initParamName));
			
			sce.getServletContext().setAttribute(initParamName,
					sce.getServletContext().getInitParameter(initParamName));
		}
	}

}
