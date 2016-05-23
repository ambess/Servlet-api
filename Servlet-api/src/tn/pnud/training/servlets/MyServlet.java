package tn.pnud.training.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebListener;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

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
