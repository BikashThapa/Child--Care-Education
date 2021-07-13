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

@WebServlet("/UserInformtion")
public class UserInformtion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	UserDao userDao = new UserDaoImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("actions");
		String forward = "";

		if (action.equals("student_delete")) {
			int id = Integer.parseInt(request.getParameter("studentId"));
			userDao.deleteStudentInfo(id);
			request.setAttribute("stu", userDao.getAllStudentInfo());
			forward = "UserInfo.jsp";
		}else if(action.equals("student_list")) {
			request.setAttribute("stu", userDao.getAllStudentInfo());
			forward = "UserInfo.jsp";
		}

		RequestDispatcher rd = request.getRequestDispatcher(forward);
		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		UserDto userDto = new UserDto();
		userDto.setUname(request.getParameter(""));// for student Name
		userDto.setPassword(request.getParameter(""));// for password
		userDto.setEmail(request.getParameter(""));// for email

		String studentId = request.getParameter("id");

		if (studentId == null || studentId.isEmpty()) {
			userDao.saveStudentInfo(userDto);
		} else {

			userDto.setId(Integer.parseInt(studentId));
			userDao.updateStudentInfo(userDto);

		}
		
		RequestDispatcher rd=request.getRequestDispatcher("");
		request.setAttribute("stu", userDao.getAllStudentInfo());
		rd.forward(request, response);

	}

}
