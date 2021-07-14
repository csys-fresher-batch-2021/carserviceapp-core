package in.carservice.model;

public class Delete {
	
			// TODO Auto-generated method stub
				public String services;
				 public int price;
				 public int discounts;
				 public String timeduration;
				public String incharge_name;
				public Delete(String services, int price, int discounts, String timeduration, String incharge_name) {
					super();
					this.services = services;
					this.price = price;
					this.discounts = discounts;
					this.timeduration = timeduration;
					this.incharge_name = incharge_name;
				}
				@Override
				public String toString() {
					return "Delete[services=" + services + ", price=" + price + ", discounts=" + discounts
							+ ", timeduration=" + timeduration + ", incharge_name=" + incharge_name + "]";
				}
			

	}


