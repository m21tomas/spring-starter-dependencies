package lt.itmokymai.spring;

public class ServiceA {
	private String messa;
	
	public String getResult() { return getMessage(); }
	
	public String getMessage() { return messa; }
	
	public void setMessage(String messag) {
		this.messa = messag;
	}
}
