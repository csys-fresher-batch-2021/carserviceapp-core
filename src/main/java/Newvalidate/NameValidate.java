package Newvalidate;

public class NameValidate {
	
	public static boolean checkName(String name) {

		if (name == null || name.trim().equals("") || name.length() <= 1) {
			return false;
		} else {
			return true;
		}
	}

}
