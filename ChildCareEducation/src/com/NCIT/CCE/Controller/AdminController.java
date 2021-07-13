package com.NCIT.CCE.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.NCIT.CCE.Dao.UserDao;
import com.NCIT.CCE.Dao.UserDaoImpl;
import com.NCIT.CCE.Dto.UserDto;

@WebServlet("/AdminController")
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserDao userDao=new UserDaoImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		
		if(username.equals("admin")&& password.equals("admin")) 
		{
			
			RequestDispatcher rs=request.getRequestDispatcher("UserInfo.jsp");
			rs.forward(request, response);
			
		}
		else {
			
			RequestDispatcher rs=request.getRequestDispatcher("Adminerror.jsp");
			rs.forward(request, response);
			
		}
		
		}
		
	}


