package lt.itmokymai.spring;

public class ServiceA {
	private String text;
	
	public String getResult() { return getMessage(); }
	
	public String getMessage() { return text; }
	
	public void setMessage(String text) {
		this.text = text;
	}
}
