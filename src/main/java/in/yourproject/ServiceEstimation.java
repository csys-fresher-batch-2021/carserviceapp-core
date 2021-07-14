package in.yourproject;

public class ServiceEstimation {
	public String services;
	public int actualprice;
	public int estimatedprice;
	public String actualtime;
	public String estimatedtime;
	public ServiceEstimation(String services, int actualprice, int estimatedprice, String actualtime,
			String estimatedtime) {
		super();
		this.services = services;
		this.actualprice = actualprice;
		this.estimatedprice = estimatedprice;
		this.actualtime = actualtime;
		this.estimatedtime = estimatedtime;
	}
	@Override
	public String toString() {
		return "ServiceEstimation [services=" + services + ", actualprice=" + actualprice + ", estimatedprice="
				+ estimatedprice + ", actualtime=" + actualtime + ", estimatedtime=" + estimatedtime + "]";
	}

}
