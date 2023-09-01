package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
//@WebServlet("/hello") //WebServlet 주석처리하면 재기동됨 -> 톰캣이 이 정보에 대해서 아무것도 모른다는 뜻.
@WebServlet(
		urlPatterns = {"/hello", "/world"},
		initParams = {
				@WebInitParam(name="dirPath", value="/Users/jeonhayoon/temp"),
				@WebInitParam(name="userId", value="glory")
		}
)
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String dirPath = getInitParameter("dirPath");
		String userId = getInitParameter("userId");
		System.out.println("TestServlet 실행");//코드 진행 확인용
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Hello</h1>");
		out.println(dirPath + "<br>");
		out.println(userId + "<br>");
		out.println("</body>");
		out.println("</html>");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		System.out.println("HelloServlet destroy 호출");
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		System.out.println("HelloServlet init 호출");
	}

}
