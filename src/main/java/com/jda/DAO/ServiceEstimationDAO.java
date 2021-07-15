package com.jda.DAO;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

	public class ServiceEstimationDAO {

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
							String Services = "WaterWash"; 
							int Actual_price = 400; 
							int estimated_price = 200; 
							int discounts = 10; 
							String Actual_time_duration = "1 day";
							String estimated_time= "half a day";
							
							//String sql = "insert into test_students(name) values ('" + name + "')";
							String sql = "insert into service_estimation ( Services,Actual_price, estimated_price,discounts,Actual_time_duration,estimated_time)values (?,?,?,?,?,?)";
							//String sql = "delete from test_students where name = ?";
							System.out.println(sql);
							
							
							PreparedStatement pst = connection.prepareStatement(sql);
							pst.setString(1,Services );
							pst.setInt(2, Actual_price);
							pst.setInt(3, estimated_price );
							pst.setInt(4, discounts);
							pst.setString(5, Actual_time_duration);
							pst.setString(6, estimated_time);
							
							int rows = pst.executeUpdate();
							
							//connection.commit();
							
							//connection.rollback();
							
							pst.close();
							
							connection.close();
							
							
							System.out.println("No of rows inserted :" + rows);
							

						}
	}




