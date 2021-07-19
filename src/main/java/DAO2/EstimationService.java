package DAO2;


	
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

import Newvalidate.NameValidate;
	
public class EstimationService {

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
					
					
					//String name = ;
					  
					String Services ="  waterwash"; 
					String   Actual_price= "1000"; 
					String estimated_price = "400";
					String  discounts = "10"; 
					String  Actual_time_duration = "1day";
					String  estimated_time = "halfday";
					boolean checkName = NameValidate.checkName( Services);
					boolean checkName1 = NameValidate.checkName(Actual_price);
					boolean checkName2 = NameValidate.checkName( estimated_price);
					boolean checkName3 = NameValidate.checkName(  discounts);
					boolean checkName4 = NameValidate.checkName(  Actual_time_duration);
					boolean checkName5 = NameValidate.checkName(  estimated_time);
					
					
					if(checkName && checkName1 && checkName2 && checkName3 &&checkName4 &&checkName5  ) { 
			 
					//String sql = "insert into service_estimation(name) values ('" + name + "')";
					String sql = "insert into  service_estimation (Services,Actual_price, estimated_price,discounts,Actual_time_duration,estimated_time)"
							+ "values (?,?,?,?,?,?)";
					//String sql = "delete from test_students where name = ?";
					System.out.println(sql);
					
					
					PreparedStatement pst = connection.prepareStatement(sql);
					pst.setString(1, Services);
					pst.setString(2,Actual_price);
					pst.setString(3,  estimated_price);
					pst.setString(4, discounts);
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

			

	
}



