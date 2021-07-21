package DAO;

    import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

import Newvalidate.ConnectionUtilTest;
import Newvalidate.DBException;
import Newvalidate.NameValidate;
	public class BookDAO {

		public static void main(String[] args) throws SQLException, ClassNotFoundException {

			Connection connection = null;
			PreparedStatement pst = null;
			try {
				connection = ConnectionUtilTest.getConnection();
				String  service = "muthu";
				String estimated_price  = "parthi";
				String discounts  = "abcd@gmail.com";
				String  estimated_time = "good";
				 boolean checkName = NameValidate.checkName(service);
				 boolean checkName2 = NameValidate.checkName(estimated_price);
				 boolean checkName3 = NameValidate.checkName(discounts);
				 boolean checkName4 = NameValidate.checkName(estimated_time);
				 

				if (checkName && checkName2 && checkName3 && checkName4) {
					String sql = "insert into  bookcar_service (services,estimated_price,discounts  , estimated_time)" + "values (?,?,?,?)";

					pst = connection.prepareStatement(sql);
					pst.setString(1, service);
					pst.setString(2, estimated_price);
					pst.setString(3, discounts);
					pst.setString(4, estimated_time);
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
