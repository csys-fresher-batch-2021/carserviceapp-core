package Newvalidate;




	import java.util.regex.Matcher;
	import java.util.regex.Pattern;

	public class PassWordDao {

		private PassWordDao() {

		}

		public static boolean checkPassword(String password) {
			boolean isValid = false;
			if (password == null || password.trim().equals("")) {
				return isValid;
			}
			String regex = "^(?=.[0-9])" + "(?=.[a-z])(?=.[A-Z])" + "(?=.[@#$%^&+=])" + "(?=\\S+$).{8,12}$";
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(password);
			isValid = m.matches();
			return isValid;
		}

	}

