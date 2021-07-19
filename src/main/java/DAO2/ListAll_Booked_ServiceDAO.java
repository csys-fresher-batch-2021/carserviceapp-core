package DAO2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

	public class ListAll_Booked_ServiceDAO {

	public static void main(String[] args)throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		
				String driverClassName = "oracle.jdbc.driver.OracleDriver";		
				String url = "jdbc:oracle:thin:@192.168.0.20:1521:DBEBS12";		
				String username = "apps";		
				String password = "apps";
				
				//Step 1: Load the driver
				Class.forName(driverClassName);
				
				//Step 2: Connection
				
				Connection connection = DriverManager.getConnection(url, username,password);
				//connection.setAutoCommit(false);//default true 
				
				System.out.println(connection);
				
				//String name = ;
				String Services ="genral";
				String Estimated_price ="1000"; 
				int dicounts  = 10; 
				String Estimated_time = "one day";	
				
				//String sql = "insert into test_students(name) values ('" + name + "')";
				String sql = "insert into  listall_booked_service( Services,Estimated_price,discounts,Estimated_time )"
						+ "values (?,?,?,?)";
				//String sql = "delete from test_students where name = ?";
				System.out.println(sql);
				
				
				PreparedStatement pst = connection.prepareStatement(sql);
				pst.setString(1,Services );
				pst.setString(2,Estimated_price);
				pst.setInt(3,dicounts);
				pst.setString(4,Estimated_time);
				int rows = pst.executeUpdate();
				
				//connection.commit();
				
				//connection.rollback();
				
				pst.close();
				
				connection.close();
				
				
				System.out.println("No of rows inserted :" + rows);
				

			}

		

		


}


