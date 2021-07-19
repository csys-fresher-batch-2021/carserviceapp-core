package Newvalidate;


	 
	 
		import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.PreparedStatement;
		import java.sql.SQLException;

	import Newvalidate.NameValidate;
		
	public class RatingCarserviceValidator {
		 

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
						  
						String Services ="general"; 
						String  customer_name= "ftwyu"; 
						String  incharge_name= "hdas";
						String  rating= "8"; 
						String  review= "good"; 
					
						 
						boolean checkName = NameValidate.checkName( Services);
						boolean checkName1 = NameValidate.checkName( customer_name);
						boolean checkName2 = NameValidate.checkName( incharge_name);
						boolean checkName3 = NameValidate.checkName( rating);
						boolean checkName4 = NameValidate.checkName( review);
					
						
						
					if(checkName && checkName1 && checkName2 && checkName3 && checkName4 ) { 
				 
						//String sql = "insert into test_students(name) values ('" + name + "')";
						String sql = "insert into rating_car_service   (Services,customer_name,incharge_name,rating,review)"
								+ "values (?,?,?,?,?)";
						//String sql = "delete from test_students where name = ?";
						System.out.println(sql);
						
						
						PreparedStatement pst = connection.prepareStatement(sql);
						pst.setString(1, Services);
						pst.setString(2,customer_name);
						pst.setString(3, incharge_name);
						pst.setString(4, rating);
						pst.setString(5, review);
						int rows = pst.executeUpdate();
					 
						
						
						//connection.commit();
						
						//connection.rollback();
						
						pst.close();
						
						connection.close();
						
						
						System.out.println("No of rows inserted :" + rows);
						

					}

			}

				

		
	}
