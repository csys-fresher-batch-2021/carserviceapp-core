package in.carservice.model;

  class ListAllBookValidation2 {
 
	  public static void validate(String Service,  String  InchargeName) throws Exception {
	  		if  ( Service == null || Service.trim().equals("")) {
	  			throw new Exception("Given Service  is invalid");
	  			}
	  		else if(InchargeName == null || InchargeName.trim().equals("")) {
	  				throw new Exception("Given InchargeName is are invalid");
	  			}
	  	}
	  }

	  public class ListAllBookValidation{

	  	
	  	public static void main(String[] args) {

	  		String Service ="muthu";
	  		String InchargeName= " ";

	  		try {
	  			ListAllBookValidation2.validate(Service,InchargeName);			
	  			//If all numbers are valid
	  			System.out.println("Given  InchargeName are valid");
	  		
	  		}
	  		//handling the exception 
	  		catch (Exception e) {
	  			System.out.println("failed:" + e.getMessage());
	  		}	
	  	}
	  
	  }
