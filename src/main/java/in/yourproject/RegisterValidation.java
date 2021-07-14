package in.yourproject;

public class RegisterValidation {
	
		public static void main(String[] args) {
			

					//input
					String Firstname ="abcd";
					String Lastname = "abcd";

					
				
						
						// Start - Validation
						if (Firstname == null ||  Firstname.trim().equals("")) {
							if (Lastname == null || Lastname.trim().equals("")) 
							{
								
							if (Firstname==Lastname)
							System.out.println("FirstName and last name are same and ivalid");
							System.out.println("fail");// Jump to catch block
							}
						}
						else {
							System.out.println("first and last name are valid");
						System.out.println("sucess to login");
					} }
}