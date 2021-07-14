package in.yourproject;

public class UpdateStatus {
	public String Services;
	 public String Initiated ;
	 public String In_progress;
	 public String completed;
	public UpdateStatus(String services, String initiated, String in_progress, String completed) {
		super();
		Services = services;
		Initiated = initiated;
		In_progress = in_progress;
		this.completed = completed;
	}
	@Override
	public String toString() {
		return "UpdateStatus [Services=" + Services + ", Initiated=" + Initiated + ", In_progress=" + In_progress
				+ ", completed=" + completed + "]";
	}

}
