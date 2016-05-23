package tn.pnud.training.listners;

import java.util.Enumeration;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;


public class CustomServletRequestListner implements ServletRequestListener {

    public CustomServletRequestListner() {
    }


    public void requestDestroyed(ServletRequestEvent sre)  { 
    	System.out.println("The Servlet request is now destroyed");
    }


    public void requestInitialized(ServletRequestEvent sre)  { 
    	System.out.println("The Servlet request is now initialized");
    	
    	HttpServletRequest request = (HttpServletRequest)sre.getServletRequest();    	
		Enumeration<String> enumeration = request.getHeaderNames();
		System.out.println("The request has several headers :");
		while (enumeration.hasMoreElements()) {
			String headerName = enumeration.nextElement();
			System.out.println("header name is : " + headerName + " it's value is : "
					+ request.getHeader(headerName));
			System.out.println(" ");
			request.setAttribute(headerName, request.getHeader(headerName));
		}
    }
	
}
