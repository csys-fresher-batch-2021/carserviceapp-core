package com.jga.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import in.carservice.model.Login;

public class LoginDAO {
	private static final String URL = "jdbc:oracle:thin:@192.168.0.20:1521:DBEBS12";
	private static final String USERNAME = "apps";
	private static final String Password = "apps";
	private static final String FIND_ALL_LOGINDETAILS = "SELECT * FROM Login";
	private static LoginDAO instance;
	private Connection connection = null;
	private PreparedStatement statement = null;
	private ResultSet results = null;

	private LoginDAO() {
	}

	public static LoginDAO getInstance() {
		if (instance == null) {
			instance = new LoginDAO();
		}
		return instance;
	}

	public List<Login> findLoginDetails() {
		List<Login> LoginDetails = new ArrayList<Login>();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(URL, USERNAME, Password);
			statement = connection.prepareStatement(FIND_ALL_LOGINDETAILS);
			results = statement.executeQuery();
			while (results.next()) {
				String username = results.getString("username");
				String pswd = results.getString("pswd");
				Login login = new Login(username, pswd);
				LoginDetails.add(login);

			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			connection = DriverManager.getConnection(URL, USERNAME, Password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return LoginDetails;
	}
	
	public static void main(String[] args) {
		LoginDAO loginDAO = new LoginDAO();
		loginDAO.findLoginDetails();
	}
}