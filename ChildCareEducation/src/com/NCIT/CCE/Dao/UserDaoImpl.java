package com.NCIT.CCE.Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.NCIT.CCE.Dto.UserDto;
import com.NCIT.CCE.Util.DbuUtil;

public class UserDaoImpl implements UserDao {
	PreparedStatement ps = null;

	public void saveStudentInfo(UserDto userDto) {
		String sql = "insert into user(uname,password,email) values(?,?,?)";
		try {
			ps = DbuUtil.getConnection().prepareStatement(sql);
			ps.setString(1, userDto.getUname());
			ps.setString(2, userDto.getPassword());
			ps.setString(3, userDto.getEmail());
			ps.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

	}

	public List<UserDto> getAllStudentInfo() {

		String sql = "select * from user";
		List<UserDto> studentlist = new ArrayList<>();
		try {
			ps = DbuUtil.getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				UserDto studentDto = new UserDto();
				studentDto.setId(rs.getInt("id"));
				studentDto.setUname(rs.getString("uname"));
				studentDto.setPassword(rs.getString("password"));
				studentDto.setEmail(rs.getString("email"));

				studentlist.add(studentDto);
			}
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

		return studentlist;

	}

	public void deleteStudentInfo(int id) {

		String sql = "delete from user where id=?";
		try {
			ps = DbuUtil.getConnection().prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

	}

	public int checkUser(String username, String password) {

		String sql = " select * from user where uname=? and password=?";
		try {
			ps = DbuUtil.getConnection().prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				return 1;

			}

		} catch (ClassNotFoundException | SQLException e) {
			return 0;
		}

		return 0;
	}

	public void updateStudentInfo(UserDto userDto) {
		String sql = "update  user set uname=?,password=?,email=?";
		try {
			ps = DbuUtil.getConnection().prepareStatement(sql);
			ps.setString(1, userDto.getUname());
			ps.setString(2, userDto.getPassword());
			ps.setString(3, userDto.getEmail());
			ps.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

	}

	public void updateUserPassword(String pass, String user) {

	}

	public UserDto GetUserDetailsByUsername(String username) {

		UserDto udto = new UserDto();
		String sql = "select * from user where user_name=?";
		try {
			ps = DbuUtil.getConnection().prepareStatement(sql);
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {

				udto.setUname("username");
				udto.setPassword(rs.getString("password"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return udto;
	}

}
