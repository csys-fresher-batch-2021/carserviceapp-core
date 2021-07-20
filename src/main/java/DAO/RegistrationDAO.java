package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Newvalidate.NameValidate;

public class RegistrationDAO {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub

		String driverClassName = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.0.20:1521:DBEBS12";
		String username = "apps";
		String password = "apps";

		// Step 1: Load the driver
		Class.forName(driverClassName);

		// Step 2: Connection

		Connection connection = DriverManager.getConnection(url, username, password);
		// connection.setAutoCommit(false);//default true

		// String name = ;

		String FirstName = "  muthu ";
		String LastName = "parthi";
		String email = "abcd@gmail.com";
		String pswd = "good";
		boolean checkName = NameValidate.checkName(FirstName);
		boolean checkName1 = NameValidate.checkName(LastName);
		boolean checkName2 = NameValidate.checkName(email);
		boolean checkName3 = NameValidate.checkName(pswd);

		if (checkName && checkName1 && checkName2 && checkName3) {

			// String sql = "insert into test_students(name) values ('" + name + "')";
			String sql = "insert into  registeration (FirstName,LastName,email  , pswd)" + "values (?,?,?,?)";
			// String sql = "delete from test_students where name = ?";
			System.out.println(sql);

			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setString(1, FirstName);
			pst.setString(2, LastName);
			pst.setString(3, email);
			pst.setString(4, pswd);
			int rows = pst.executeUpdate();

			// connection.commit();

			// connection.rollback();

			pst.close();

			connection.close();

			System.out.println("No of rows inserted :" + rows);

		}

	}

}
