import in.carservice.model.RatingCarService;

public class RatingCarServiceTest {
	public static void main(String[] args) {

		RatingCarService ratingcarservice1 = new RatingCarService("general","ftwyu","hdas","8","good");
			
			System.out.println(ratingcarservice1.toString());
           RatingCarService ratingcarservice2 = new RatingCarService("'water_wash","utr","jeyu9","8","good");
			
			System.out.println(ratingcarservice2.toString());


}
}
