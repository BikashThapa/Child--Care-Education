package com.NCIT.CCE.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbuUtil {
	
	
	private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/cce";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "root";
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {

		Class.forName(DRIVER_NAME);
		return DriverManager.getConnection(URL, USER_NAME, PASSWORD);
	}

	

}
