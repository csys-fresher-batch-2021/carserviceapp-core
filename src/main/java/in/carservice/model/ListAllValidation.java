package in.carservice.model;

  class ListAllValidation2{
	   
	  	
	  	public static void validate(String Time,  String  discount) throws Exception {
	  		if  ( Time == null || Time.trim().equals("")) {
	  			throw new Exception("Given Time  is invalid");
	  			}
	  		else if(discount == null || discount.trim().equals("")) {
	  				throw new Exception("Given Discount is are invalid");
	  			}
	  	}
	  }

	  public class ListAllValidation {

	  	
	  	public static void main(String[] args) {

	  		String Time ="muthu";
	  		String Discount= " ";

	  		try {
	  			ListAllValidation2.validate(Time,Discount);			
	  			//If all numbers are valid
	  			System.out.println("Given  Discount are valid");
	  		
	  		}
	  		//handling the exception 
	  		catch (Exception e) {
	  			System.out.println("failed:" + e.getMessage());
	  		}	
	  	}
	  
	  }


 
