package in.yourproject;

public class Register {
	

			 public String FirstName;
			 public String LastName;
			 public String UserName;
			 public String Email;
			public String password;
		public Register(String FirstName,String LastName,String UserName,String Email, String Password)
		{
			this.FirstName= FirstName;
			this.LastName = LastName;
			this.UserName = UserName;
			this.Email = Email;
			this.password = Password;
			System.out.println("Register Successfully");
			
		}
		
		public static void display (String Firstname,String Lastname,String Username,String Email, String Password)
		{
			System.out.println("Firstname : "+Firstname);
			System.out.println("Lastname : "+Lastname);
			System.out.println("Username : "+Username);
			System.out.println("Email : "+Email);
			System.out.println("Password : "+Password);
		}
		public static void main(String[] args) {
			Register register1 = new Register("abcd","efgh","abcd","a@gmail.com","1234");
		
		
		
		}
}

	
