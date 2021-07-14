package in.yourproject;

public class ListAllBookedService {

public String Services;
public int Estimated_price;
public int discounts;
public String Estimated_time;
public ListAllBookedService(String services, int estimated_price, int discounts, String estimated_time) {
	super();
	Services = services;
	Estimated_price = estimated_price;
	this.discounts = discounts;
	Estimated_time = estimated_time;
}
@Override
public String toString() {
	return "ListAllBookedService [Services=" + Services + ", Estimated_price=" + Estimated_price + ", discounts="
			+ discounts + ", Estimated_time=" + Estimated_time + "]";
}

}