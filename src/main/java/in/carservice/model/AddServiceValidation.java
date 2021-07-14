package in.carservice.model;

  class AddServiceValidation2 {
	public static void validate(String services, int Price) throws Exception {
		if  (services == null  || services.trim().equals("")) {
			throw new Exception("Given services  is Invalid");
			}
		else if(Price>=500 || Price != 0)
				 {
				throw new Exception("Given price is are valid");
			}
	}
}


public class AddServiceValidation{

	public static void main(String[] args) {

		String services="WheelAllignment";
		int Price= 500;

		try {
			AddServiceValidation2.validate(services,Price);			
			//If all numbers are valid
			System.out.println("Given services are valid");
		
		}
		//handling the exception 
		catch (Exception e) {
			System.out.println("failed:" + e.getMessage());
		}	
	}
}



 
