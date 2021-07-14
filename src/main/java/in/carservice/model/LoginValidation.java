package in.carservice.model;

  class LoginValidation2 {

	  public static void validate(String login_id,  String  username) throws Exception {
	  		if  ( login_id == null || login_id.trim().equals("")) {
	  			throw new Exception("Given login_id  is invalid");
	  			}
	  		else if(username == null || username.trim().equals("")) {
	  				throw new Exception("Given username is are invalid");
	  			}
	  	}
	  }

	  public class LoginValidation{

	  	
	  	public static void main(String[] args) {

	  		String login_id ="muthu";
	  		String username= " ";

	  		try {
	  			LoginValidation2.validate(login_id,username);			
	  			//If all numbers are valid
	  			System.out.println("Given  username are valid");
	  		
	  		}
	  		//handling the exception 
	  		catch (Exception e) {
	  			System.out.println("failed:" + e.getMessage());
	  		}	
	  	}
	  
	  }

