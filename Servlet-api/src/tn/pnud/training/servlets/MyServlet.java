package tn.pnud.training.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(description = "My first annotated servlet", initParams={@WebInitParam(name="prenom", value="Adel"), @WebInitParam(name="nom", value="CHAMAKH")}, name = "myServlet", urlPatterns = "/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MyServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("This is a ServletConfig initParam : "+ getServletConfig().getInitParameter("nom"));
		System.out.println("This is a ServletContext initParam : "+ getServletContext().getInitParameter("jdbcConnectionString"));
		
		
		getServletContext().setAttribute("nom", request.getParameter("nom") == null
				? getServletContext().getAttribute("nom") : request.getParameter("nom"));
		
		getServletContext().setAttribute("prenom", request.getParameter("prenom") == null
				? getServletContext().getAttribute("prenom") : request.getParameter("prenom"));
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
