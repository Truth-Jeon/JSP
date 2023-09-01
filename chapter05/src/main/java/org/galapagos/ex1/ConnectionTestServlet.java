package org.galapagos.ex1;

import java.io.IOException;
import java.sql.Connection;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("/test")
public class ConnectionTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	//@Resource는 Servlet 클래스의 어노테이션이다. : 그래서..?
	@Resource(name="jdbc/mysql")
	DataSource dataFactory; //이게 핵심
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//아래처럼 사용하려면 DAO에서 작업 시 conn을 매개변수로 넘겨줘야 하는 단점이 있다.
		//dao.getPage(conn, ...) <= 이렇게...
		//Connection conn = dataFactory.getConnection() <= 데이터 소스를 반납한다는 의미
		try(Connection conn = dataFactory.getConnection()) {
			System.out.println("연결 획득 성공");
		} catch(Exception e) {
			e.printStackTrace();
		};
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
