package tn.pnud.training.listners;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class CustomServletAttributeListner
 *
 */
public class CustomServletRequestAttributeListner implements ServletRequestAttributeListener {

    /**
     * Default constructor. 
     */
    public CustomServletRequestAttributeListner() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletRequestAttributeListener#attributeRemoved(ServletRequestAttributeEvent)
     */
    public void attributeRemoved(ServletRequestAttributeEvent srae)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletRequestAttributeListener#attributeAdded(ServletRequestAttributeEvent)
     */
    public void attributeAdded(ServletRequestAttributeEvent srae)  { 
    	System.out.println(" ");
    	System.out.println("An attribute has been added to the Servlet request :");
    	System.out.println("The attibute name is : "+srae.getName());
    	System.out.println("The attibute value is : "+srae.getValue());
    	System.out.println(" ");
    }

	/**
     * @see ServletRequestAttributeListener#attributeReplaced(ServletRequestAttributeEvent)
     */
    public void attributeReplaced(ServletRequestAttributeEvent srae)  { 
         // TODO Auto-generated method stub
    }
	
}
