package tn.pnud.training.listners;

import java.util.Enumeration;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class CustomHttpSessionListner
 *
 */
public class CustomHttpSessionListner implements HttpSessionListener {

	/**
	 * Default constructor.
	 */
	public CustomHttpSessionListner() {
		// TODO Auto-generated constructor stub
	}

	// L'appellation du services n'est pas comme les ServletContextListner et
	// ServletRequestListner qui sont respectivement contextInitialized et
	// requestInitialized
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println(" ");
		System.out.println("Une nouvelle session a été créée  "+se.getSession());
		Enumeration<String> enumeration = se.getSession().getAttributeNames();
		System.out.println("La session défini ces attributs :");
		while (enumeration.hasMoreElements()) {
			String headerName = enumeration.nextElement();
			System.out.println("Attribute name est  : " + headerName + " sa valeur est : "
					+ se.getSession().getAttribute(headerName));
			System.out.println(" ");
		}
		
	}

	/**
	 * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
	 */
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println(" ");
		System.out.println("La session est détruite  "+se.getSession());
		
		Enumeration<String> enumeration = se.getSession().getAttributeNames();
		while (enumeration.hasMoreElements()) {
			String headerName = enumeration.nextElement();
			System.out.println("Attribute name est  : " + headerName + " sa valeur est : "
					+ se.getSession().getAttribute(headerName));
			System.out.println(" ");
		}
	}

}
