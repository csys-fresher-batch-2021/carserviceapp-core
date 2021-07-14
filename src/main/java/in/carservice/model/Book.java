package in.carservice.model;

public class Book {
	
			public String Service;
			 public int Estimated_price;
			 public int discounts;
			 public String Estimated_time;
			public Book(String service, int estimated_price, int discounts, String estimated_time) {
				super();
				Service = service;
				Estimated_price = estimated_price;
				this.discounts = discounts;
				Estimated_time = estimated_time;
			}
			@Override
			public String toString() {
				return "Book [Service=" + Service + ", Estimated_price=" + Estimated_price + ", discounts=" + discounts
						+ ", Estimated_time=" + Estimated_time + "]";
			}
		
			 
			// TODO Auto-generated method stub

		}


