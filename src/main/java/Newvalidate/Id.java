package Newvalidate;

public class Id {



	private Id() {

	}

	public static boolean checkId(int id) {

		if (id > 0) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean checkPrice(int price) {

		if (price > 0) {
			return true;
		} else {
			return false;
		}
	}

}
