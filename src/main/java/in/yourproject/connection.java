package in.yourproject;
	
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

	public class connection {

		public static void main(String[] args) throws SQLException, ClassNotFoundException {
			
			
			String driverClassName = "oracle.jdbc.driver.OracleDriver";		
			String url = "jdbc:oracle:thin:@yourIpaddress:1521:DBEBS12";		
			String username = "apps";		
			String password = "apps";
			
			//Step 1: Load the driver
			Class.forName(driverClassName);
			
			//Step 2: Connection
			
			Connection connection = DriverManager.getConnection(url, username,password);
			//connection.setAutoCommit(false);//default true 
			
			System.out.println(connection);
			
			String name = "abcd";
			//String sql = "insert into test_students(name) values ('" + name + "')";
			//String sql = "insert into test_students(student_id,name) values (XX_SEQ.nextval,?)";
			String sql = "delete from test_students where name = ?";
			System.out.println(sql);
			
			
			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setString(1, name);
			int rows = pst.executeUpdate();
			
			//connection.commit();
			
			//connection.rollback();
			
			pst.close();
			
			connection.close();
			
			
			System.out.println("No of rows inserted :" + rows);
			

		}

	}


