package tn.pnud.training.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter({ "/MyServlet"})
public class SiAdelFilter implements Filter {

	FilterConfig config;
	ServletContext context;

	public SiAdelFilter() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;

		if ((req.getParameter("nom").equals("Adel"))) {
			req.setAttribute("nom", request.getParameter("nom"));
			req.setAttribute("prenom", request.getParameter("prenom"));
			chain.doFilter(req, res);
		} 
		else {
			res.sendRedirect("welcome.html");
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
		this.config = fConfig;
		this.context = fConfig.getServletContext();
	}

}
