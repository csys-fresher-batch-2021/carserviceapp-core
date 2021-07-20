package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Newvalidate.ConnectionUtilTest;
import Newvalidate.DBException;
import Newvalidate.Id;
import Newvalidate.NameValidate;

public class ListAllBookedDAO {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Connection connection = null;
		PreparedStatement pst = null;
		try {
			connection = ConnectionUtilTest.getConnection();
			String Services = "WaterWash";
			int estimated_price = 3000;
			int discounts  = 20;
			String estimated_time = "hald a day";
			
			 boolean checkName = NameValidate.checkName(Services);
			 boolean checkId = Id.checkId(estimated_price);
			 boolean checkId2 = Id.checkId(discounts);
			 boolean checkName2 = NameValidate.checkName(estimated_time);
			 
			if(checkName && checkId && checkId2 && checkName2 ) {
			
			String sql = "insert into   listall_booked_service (Services,estimated_price,discounts,estimated_time)"
					+ "values (?,?,?,?)";

			pst = connection.prepareStatement(sql);
			pst.setString(1, Services);
			pst.setInt(2, estimated_price);
			pst.setInt(3, discounts);
			pst.setString(4, estimated_time);
			 
			int rows = pst.executeUpdate();
			System.out.println("No of rows inserted :" + rows);
			}
			else {
					System.out.println("Invalid Data");
			}
			
		} catch (DBException e) {
			e.printStackTrace();
		}finally {
			ConnectionUtilTest.close(pst, connection);
		}
	}

}


