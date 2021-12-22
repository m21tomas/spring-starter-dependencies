package pvz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartBean {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("another-context.xml");
		
		MyBean myBean = (MyBean) context.getBean("MyFirstBean");
		
		System.out.println(myBean.getMessage());
		
		((ConfigurableApplicationContext) context).close();

	}

}
