package in.carservice.model;

import in.carservice.model.Delete;

public class DeleteTest {
	public DeleteTest(String string, int integer1, int integer2, String string4, String string5) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Delete delete_service1 = new Delete("wheelAllignment", 500, 5, "half a day", "muthu");

		System.out.println(delete_service1.toString());
		Delete delete_service2 = new Delete("genral_srevice", 700, 10, "full day", "parthi");

		System.out.println(delete_service2.toString());

	}

}
