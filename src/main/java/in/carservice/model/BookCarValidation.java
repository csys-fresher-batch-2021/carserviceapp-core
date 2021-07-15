package in.carservice.model;

  class BookCarValidation2 {
	public static void validate(String estimated_price,  String  estimated_time) throws Exception {
  		if  ( estimated_price == null || estimated_price.trim().equals("")) {
  			throw new Exception("Given estimated_price  is invalid");
  			}
  		else if(estimated_time == null || estimated_time.trim().equals("")) {
  				throw new Exception("Given estimated_time is are invalid");
  			}
  	}
  }

  public class BookCarValidation{

  	
  	public static void main(String[] args) {

  		String estimated_price ="muthu";
  		String estimated_time= " ";

  		try {
  			BookCarValidation2.validate(estimated_price,estimated_time);			
  			//If all numbers are valid
  			System.out.println("Given  estimated_time are valid");
  		
  		}
  		//handling the exception 
  		catch (Exception e) {
  			System.out.println("failed:" + e.getMessage());
  		}	
  	}
  
  }

