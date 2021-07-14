package in.carservice.model;

import in.yourproject.ListAllBookedService;

public class ListAllBookedServiceTest {
	public ListAllBookedServiceTest (String s,int i1,int i2,String s2) {
		
	}
	public static void main(String[] args) {
		ListAllBookedService service1=new ListAllBookedService("water",1000,5,"one_day");
		System.out.println(service1.toString());
		ListAllBookedService service2=new ListAllBookedService("wheel align",5000,10,"one_day");
		System.out.println(service2.toString());
		
	}
}
