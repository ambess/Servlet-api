package tn.pnud.training.filters.wrappers;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class ResponseWrapper extends HttpServletResponseWrapper {

	HttpServletResponse response;
	
	public ResponseWrapper(HttpServletResponse response) {
		super(response);
		this.response = response;
		
	}
	
	@Override
	public void addCookie(Cookie cookie) {
		response.addCookie(cookie);
	}
	
	@Override
	public void addHeader(String name, String value) {
		super.addHeader(name, value);
	}

}
