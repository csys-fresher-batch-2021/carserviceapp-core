package in.yourproject;

public class RatingCarService {
	 public String Services;
	 public String Customer_Name;
	 public String Incharge_Name;
	 public String Ratings;
	 public String Review;
	public RatingCarService(String services, String customer_Name, String incharge_Name, String ratings,
			String review) {
		super();
		Services = services;
		Customer_Name = customer_Name;
		Incharge_Name = incharge_Name;
		Ratings = ratings;
		Review = review;
	}
	@Override
	public String toString() {
		return "RatingCarService [Services=" + Services + ", Customer_Name=" + Customer_Name + ", Incharge_Name="
				+ Incharge_Name + ", Ratings=" + Ratings + ", Review=" + Review + "]";
	}
	

}
