package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Newvalidate.ConnectionUtilTest;
import Newvalidate.DBException;
import Newvalidate.NameValidate;

public class RegistrationDAO {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Connection connection = null;
		PreparedStatement pst = null;
		try {
			connection = ConnectionUtilTest.getConnection();
			String FirstName = "muthu";
			String LastName = "parthi";
			String email = "abcd@gmail.com";
			String pswd = "good";
			boolean checkName = NameValidate.checkName(LastName);
			boolean checkName2 = NameValidate.checkName(LastName);
			boolean checkName3 = NameValidate.checkName(email);
			boolean checkName4 = NameValidate.checkName(pswd);

			if (checkName && checkName2 && checkName3 && checkName4) {
				String sql = "insert into  registeration (FirstName,LastName,email  , pswd)" + "values (?,?,?,?)";

				pst = connection.prepareStatement(sql);
				pst.setString(1, FirstName);
				pst.setString(2, LastName);
				pst.setString(3, email);
				pst.setString(4, pswd);
				int rows = pst.executeUpdate();

				System.out.println("No of rows inserted :" + rows);

			} else {
				System.out.println("Invalid Data");
			}
		} catch (DBException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtilTest.close(pst, connection);
		}
	}
}
