package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Newvalidate.ConnectionUtilTest;
import Newvalidate.DBException;
import Newvalidate.Id;
import Newvalidate.NameValidate;

public class ServiceEstimationDAO {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Connection connection = null;
		PreparedStatement pst = null;
		try {
			connection = ConnectionUtilTest.getConnection();

			String Services = "Wash";
			int Actual_price = 250;
			int estimated_price = 200;
			int discounts = 10;
			String Actual_time_duration = "1 day";
			String estimated_time = "half a day";

			boolean checkName = NameValidate.checkName(Services);
			boolean checkPrice = Id.checkPrice(Actual_price);
			boolean checkPrice2 = Id.checkPrice(estimated_price);
			boolean checkPrice3 = Id.checkPrice(discounts);
			boolean checkName2 = NameValidate.checkName(Actual_time_duration);
			boolean checkName3 = NameValidate.checkName(estimated_time);
			if (checkName && checkPrice && checkPrice2 && checkPrice3 && checkName2 && checkName3) {

				String sql = "insert into service_estimation ( Services,Actual_price, estimated_price,discounts,Actual_time_duration,estimated_time)values (?,?,?,?,?,?)";

				pst = connection.prepareStatement(sql);
				pst.setString(1, Services);
				pst.setInt(2, Actual_price);
				pst.setInt(3, estimated_price);
				pst.setInt(4, discounts);
				pst.setString(5, Actual_time_duration);
				pst.setString(6, estimated_time);

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
