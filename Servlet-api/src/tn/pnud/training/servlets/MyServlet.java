package tn.pnud.training.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebListener;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import org.apache.taglibs.standard.tag.rt.core.UrlTag;

import tn.pnud.training.model.Administrator;

@WebServlet(description = "My first annotated servlet", initParams = { @WebInitParam(name = "prenom", value = "Adel"),
		@WebInitParam(name = "nom", value = "CHAMAKH") }, name = "myServlet", urlPatterns = "/MyServlet")
@WebListener
public class MyServlet extends HttpServlet implements HttpSessionAttributeListener {
	private static final long serialVersionUID = 1L;

	public MyServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		// Par convention 1 equivaut à Custom tag
		// Par convention 2 equivaut à Standard tag
		// Par convention 3 equivaut à EL
		request.setAttribute("whichIsTested", request.getParameter("type"));
		
		
		Administrator administrator2 = new Administrator("01234566", "Haykel", "Chouchen");		
		request.setAttribute("Admin", administrator2);
		
		Administrator administrator = new Administrator("01234566", "Adel", "Chamakh");		
		session.setAttribute("Admin", administrator);
		
		String[] names = {"Adel","Haykel","Boujemaa","Amine"};
		session.setAttribute("Admin", administrator);
		session.setAttribute("siAdelJaa", null);
		session.setAttribute("nbPresent", 4);
		session.setAttribute("names", names);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

	@Override
	public void attributeAdded(HttpSessionBindingEvent se) {
		// System.out.println("DATA RETRIEVED WITH getValue() - " + "A:" +
		// se.getName() + "->" + se.getValue());
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent se) {
		// System.out.println("DATA RETRIEVED WITH getValue() - " + "A:" +
		// se.getName() + "->" + se.getValue());
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent se) {
		// System.out.println("DATA RETRIEVED WITH getValue() - " + "A:" +
		// se.getName() + "->" + se.getValue());
	}

}
