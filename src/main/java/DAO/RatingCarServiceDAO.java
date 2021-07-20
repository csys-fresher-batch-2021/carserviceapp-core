package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Newvalidate.ConnectionUtilTest;
import Newvalidate.DBException;
import Newvalidate.Id;
import Newvalidate.NameValidate;

public class RatingCarServiceDAO {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Connection connection = null;
		PreparedStatement pst = null;
		try {
			connection = ConnectionUtilTest.getConnection();
			String Services = "WaterWash";
			String Customer_Name = "muthu";
			String Incharge_Name = "parthi";
			String Rating = "8";
			String Review = "good";
			
			boolean checkName = NameValidate.checkName(Services);
			boolean checkName1 = NameValidate.checkName(Customer_Name);
			boolean checkName2 = NameValidate.checkName(Incharge_Name);
			boolean checkName3 = NameValidate.checkName(Review);
			boolean checkId = Id.checkId(Integer.parseInt(Rating));
			
			if(checkName && checkName1 && checkName2 && checkName3 && checkId) {
			
			String sql = "insert into RatingCarService (Services,Customer_Name, Incharge_Name, Rating,Review)"
					+ "values (?,?,?,?,?)";

			pst = connection.prepareStatement(sql);
			pst.setString(1, Services);
			pst.setString(2, Customer_Name);
			pst.setString(3, Incharge_Name);
			pst.setString(4, Rating);
			pst.setString(5, Review);
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
