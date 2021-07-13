package com.NCIT.CCE.Dao;

import java.util.List;

import com.NCIT.CCE.Dto.UserDto;

public interface UserDao {

	public void saveStudentInfo(UserDto userDto);

	public List<UserDto> getAllStudentInfo();

	public void deleteStudentInfo(int id);
	public int checkUser(String username, String password);
	public void updateStudentInfo(UserDto userDto);
	public void updateUserPassword(String pass,String user);
	public UserDto GetUserDetailsByUsername(String username);

}
