package lt.itmokymai.spring;

import java.util.List;

public class ServiceC extends ServiceA {
	
	private List<Product> lists;
	
	@Override
	public String getResult() {
		return "ServiceC result: "+getMessage();
	}

	public List<Product> getLists() {
		return lists;
	}

	public void setLists(List<Product> lists) {
		this.lists = lists;
	}
	
//	public List<Product> getProductList(){
//		return lists;
//	}
}
