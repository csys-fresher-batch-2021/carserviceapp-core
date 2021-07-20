package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Newvalidate.ConnectionUtilTest;
import Newvalidate.DBException;
import Newvalidate.Id;
import Newvalidate.NameValidate;
public class loginDAO {
	private static int id;

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Connection connection = null;
		PreparedStatement pst = null;
		try {
			connection = ConnectionUtilTest.getConnection();
			 int  login_Id = 221;
			String  UserName = " abcd";
			String  pswd = " Aa1 ";
			
			 	boolean checkId = Id.checkId(login_Id);
			 	boolean checkName = NameValidate.checkName(UserName);
			 	boolean checkName2 = NameValidate.checkName(pswd);
			 	
			 
			if(checkId && checkName && checkName2  ) {
			
			String sql = "insert into  login( login_Id,UserName,pswd)"
					+ "values (?,?,?)";

			pst = connection.prepareStatement(sql);
			pst.setInt(1, login_Id);
			pst.setString(2, UserName);
			pst.setString(3, pswd);
			 
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

