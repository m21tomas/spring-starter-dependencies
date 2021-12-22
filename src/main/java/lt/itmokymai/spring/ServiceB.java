package lt.itmokymai.spring;

public class ServiceB {
	
	private ServiceC some_service;
	
	public ServiceB(ServiceC some_service) {
		super();
		this.some_service = some_service;
	}

	public ServiceC getSome_service() {
		return some_service;
	}

	public void setSome_service(ServiceC some_service) {
		this.some_service = some_service;
	}

	public String getResult () {
		return "ServiceB result: " + some_service.getResult() ;
	}
}
