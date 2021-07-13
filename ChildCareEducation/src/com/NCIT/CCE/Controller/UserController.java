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

@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserDao userDao=new UserDaoImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UserDto userDto=new UserDto();
		userDto.setUname(request.getParameter("username"));
		userDto.setPassword(request.getParameter("password"));
		userDto.setEmail(request.getParameter("email"));
		userDao.saveStudentInfo(userDto);
		RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);
		}
}
