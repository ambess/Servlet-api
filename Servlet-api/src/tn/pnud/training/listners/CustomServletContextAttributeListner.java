package tn.pnud.training.listners;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;


public class CustomServletContextAttributeListner implements ServletContextAttributeListener {


    public CustomServletContextAttributeListner() {
    }


    public void attributeAdded(ServletContextAttributeEvent scae)  { 
    	System.out.println(" ");
    	System.out.println("An attribute has been added to the Servlet Context :");
    	System.out.println("The attibute name is : "+scae.getName());
    	System.out.println("The attibute value is : "+scae.getValue());
    	System.out.println(" ");
    }


    public void attributeRemoved(ServletContextAttributeEvent scae)  { 
    }

	
    public void attributeReplaced(ServletContextAttributeEvent scae)  { 
    }
	
}
