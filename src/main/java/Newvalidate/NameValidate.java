package Newvalidate;

public class NameValidate {
	
	public static boolean checkName(String name) {

		if (name == null || name.trim().equals("")) {
			return false;
		} else {
			return true;
		}
	}

}
