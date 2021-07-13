package com.NCIT.CCE.Controller;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.NCIT.CCE.Dao.UserDao;
import com.NCIT.CCE.Dao.UserDaoImpl;
import com.NCIT.CCE.Dto.UserDto;
import com.NCIT.CCE.Util.DbuUtil;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 UserDao dao=new UserDaoImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	 String username=request.getParameter("username");
	 String pass=request.getParameter("password");
	 
	 
	 int isuser=dao.checkUser(username, pass);
	 
	 if(isuser==1) {
		 
		 HttpSession Session=request.getSession();
		 Session.setAttribute("uname",username );
		 
		 RequestDispatcher rd=request.getRequestDispatcher("Home.jsp");
		  rd.forward(request, response);
			 
	 }
	 else {
		 
		 RequestDispatcher rd=request.getRequestDispatcher("Error.jsp");
		  rd.forward(request, response);
		 
	 }
	}

}
