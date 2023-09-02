package org.galapagos.ex1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.galapagos.vo.Member;

@WebServlet("/vo")
public class VoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Member admin = new Member("admin", "관리자");
		request.setAttribute("user", admin);
		
		RequestDispatcher dis= request.getRequestDispatcher("el03.jsp");
		dis.forward(request, response);
	}

}
