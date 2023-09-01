package org.galapagos.ex3;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContextParamServlet
 */
@WebServlet(
		urlPatterns = { "/contextparam" }, 
		initParams = { 
				@WebInitParam(name = "pathDir", value = "/Users/jeonhayoon/temp", description = "파일업로드 경로"), 
				@WebInitParam(name = "userid", value = "jeon")
		})
public class ContextParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext sc = getServletContext();
		
		String driver = sc.getInitParameter("driver");
		String dburl = sc.getInitParameter("dburl");
		String username = sc.getInitParameter("username");
		String password = sc.getInitParameter("password");
		
		System.out.println(driver);
		System.out.println(dburl);
		System.out.println(username);
		System.out.println(password);
	}

}
