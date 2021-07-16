package Newvalidate;

	import java.beans.Statement;
	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;

	import in.carservice.DAO.ConnectionUtilTest;

	public class LoginValidate { 
		public static void main(String[] args) throws Exception {
			String databaseUsername = "deepa";
			String databasePassword = "dee1";

			Connection con = null;

			try {
				con = ConnectionUtilTest.getConnection();

				String sql = "select * from login where username=? and pswd=?";
				PreparedStatement ps = con.prepareStatement(sql);

				ps.setString(1, databaseUsername);
				ps.setString(2, databasePassword);
				ResultSet rs = ps.executeQuery();
				if (rs.next()) {
					System.out.println("Login Sucessfull...");
				} else {
					System.out.println("Invalid");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}