package in.yourproject;

public class Login {
	

			 public String Username;
			public String password;
		public Login(String Username, String Password)
		{
			this.Username = Username;
			this.password = Password;
			System.out.println("Login Successfully");
			
		}
		
		public static void display (String Username, String Password)
		{
			System.out.println("Username : "+Username);
			System.out.println("Password : "+Password);
		}
		
		public static void main(String[] args) {
			Login login1 = new Login("abcd","1234");
		
		}

	}



