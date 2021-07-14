package in.carservice.model;

public class AddService {

	 public String Services;
	 public int price;
	 public int discounts;
	 public String time_duration;
	 public String incharge_name;
	 public Long incharge_phn;
	 public AddService() {
		 System.out.println("Constructor");
	 }
	public AddService(String services, int price, int discounts, String time_duration, String incharge_name,
			Long incharge_phn) {
		super();
		Services = services;
		this.price = price;
		this.discounts = discounts;
		this.time_duration = time_duration;
		this.incharge_name = incharge_name;
		this.incharge_phn = incharge_phn;
	}
	@Override
	public String toString() {
		return "AddService [Services=" + Services + ", price=" + price + ", discounts=" + discounts + ", time_duration="
				+ time_duration + ", incharge_name=" + incharge_name + ", incharge_phn=" + incharge_phn + "]";
	}
}