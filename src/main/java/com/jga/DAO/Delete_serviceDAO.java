package com.jga.DAO;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Delete_serviceDAO {

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
				 
				String Services = "Wheel alignment"; 
				String price = "2000"; 
				String discounts="10";
				String time_duration = "halfaday"; 
				String incharge_name ="Muthu";
				String incharge_phno = "9840847443";
				
				
				//String sql = "insert into test_students(name) values ('" + name + "')";
				String sql = " insert into delete_service (Services,price,discounts,time_duration,incharge_name,incharge_phno)values (?,?,?,?)";
				//String sql = "delete from test_students where name = ?";
				System.out.println(sql);
				
				
				PreparedStatement pst = connection.prepareStatement(sql);
				pst.setString(1, Services);
				pst.setString(2, price);
				pst.setString(3, discounts);
				pst.setString(4, time_duration);
				pst.setString(5, incharge_name);
				pst.setString(6, incharge_phno);
				int rows = pst.executeUpdate();
				
				//connection.commit();
				
				//connection.rollback();
				
				pst.close();
				
				connection.close();
				
				
				System.out.println("No of rows inserted :" + rows);
				

			}
}