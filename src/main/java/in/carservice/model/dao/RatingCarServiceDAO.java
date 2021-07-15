package in.carservice.model.dao;



    import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;
	public class RatingCarServiceDAO {

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
					 
					String Services = "WaterServices"; 
					String Customer_Name = "muthu"; 
					String  Incharge_Name= "parthi"; 
					int  Rating = 8; 
					String  Review = "good"; 
					
					
					//String sql = "insert into test_students(name) values ('" + name + "')";
					String sql = "insert into RatingCarService (Services,Customer_Name, Incharge_Name, Rating,Review)"
							+ "values (?,?,?,?,?)";
					//String sql = "delete from test_students where name = ?";
					System.out.println(sql);
					
					
					PreparedStatement pst = connection.prepareStatement(sql);
					pst.setString(1, Services);
					pst.setString(2,Customer_Name);
					pst.setString(3,  Incharge_Name);
					pst.setInt(4, Rating);
					pst.setString(5, Review);
					int rows = pst.executeUpdate();
					
					//connection.commit();
					
					//connection.rollback();
					
					pst.close();
					
					connection.close();
					
					
					System.out.println("No of rows inserted :" + rows);
					

				}

			

			

	}



