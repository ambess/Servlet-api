package tn.pnud.training.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "My first annotated servlet", initParams = { @WebInitParam(name = "prenom", value = "Adel"),
		@WebInitParam(name = "nom", value = "CHAMAKH") }, name = "myServlet", urlPatterns = "/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private String nom;
	private String prenom;

	public MyServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		nom = request.getParameter("nom") == null ? nom : request.getParameter("nom");
		prenom = request.getParameter("prenom") == null ? prenom : request.getParameter("prenom");

		/*
		 * Créer un attribut de requête. Lui affecter le contenu du parametre de
		 * requête nom via la variable Si le nom est vide laisser le contenu de
		 * l'attribute comme tel (même si null)
		 * 
		 */
		System.out.println(nom);
		System.out.println(prenom);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
