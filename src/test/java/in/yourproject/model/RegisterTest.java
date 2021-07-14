package in.yourproject.model;

import in.carservice.model.Register;

public class RegisterTest {
	public static void main(String[] args) {

		Register register1 = new Register("abcd","efgh","abcd","a@gmail.com","1234");
			
			System.out.println(register1.toString());
           Register register2 = new Register("ijkl","mnop","ijkl","b@gmail.com","5678");
			
			System.out.println(register2.toString());

			
					}

	}

