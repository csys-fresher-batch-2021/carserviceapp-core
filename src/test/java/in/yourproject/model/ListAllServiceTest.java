package in.yourproject.model;

import in.carservice.model.ListAll;

public class ListAllServiceTest {
	

	
		public static void main(String[] args) {

			ListAll listall1 = new ListAll("waterwash",750,10,"half a day","deepa",8798435245L);
				
				System.out.println(listall1.toString());
	           ListAll listall2 = new ListAll("general",1000,20,"1day","nandhu",9874537436L);
				
				System.out.println(listall2.toString());
	ListAll listall3 = new ListAll("wheel allignment",500,5,"half a day","muthu",9849865285L);
				
				System.out.println(listall3.toString());
	ListAll listall4 = new ListAll("bumper fixing",1000,0,"1day","parthi",97259732634L);
				
				System.out.println(listall4.toString());
	             
	             

	}
	}



