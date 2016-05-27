package tn.pnud.training.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tn.pnud.training.model.Administrator;

public class MyServlet extends HttpServlet {
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

		String[] names = { "Adel", "Haykel", "Boujemaa", "Amine" };
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

}
