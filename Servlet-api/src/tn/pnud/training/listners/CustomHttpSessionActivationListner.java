package tn.pnud.training.listners;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;

/**
 * Application Lifecycle Listener implementation class CustomHttpSessionActivationListner
 *
 */
public class CustomHttpSessionActivationListner implements HttpSessionActivationListener {

    /**
     * Default constructor. 
     */
    public CustomHttpSessionActivationListner() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionActivationListener#sessionDidActivate(HttpSessionEvent)
     */
    public void sessionDidActivate(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see HttpSessionActivationListener#sessionWillPassivate(HttpSessionEvent)
     */
    public void sessionWillPassivate(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    }
	
}
