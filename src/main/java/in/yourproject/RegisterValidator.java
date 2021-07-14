package in.yourproject;

public class RegisterValidator {
	
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		

				//input
				String Username = "abcd";
				String Email = "a@gmail.com";
				

				try {
					
					// Start - Validation
					if (Username == null) {
						throw new Exception("Invalid Username"); // Jump to catch block
					}
					else if(Email !=null) {
						throw new Exception("valid Email");
					}

					// End Validation
					
					// StudentDAO.save(name); 

					System.out.println("Success");
				} catch (Exception e) {
					System.out.println("Catch");
					String errorMessage = e.getMessage();
					System.out.println("errorMessage:" + errorMessage);
					e.printStackTrace();
				}
			}

		

		
	}
	
		

				
