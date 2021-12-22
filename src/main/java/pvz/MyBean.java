package pvz;
public class MyBean {
    private String text;
	
	public String getMessage() { return text + " is created"; }
	
	public void setMessage(String text2) {
		this.text = text2;
	}
		
	public void init() { 
		System.out.println(this.text + " initialising..");
	}
	
	public void destruct() {
		System.out.println(this.text + " is destroyed");
	}
}
