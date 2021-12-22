package lt.itmokymai.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
    	
    	//ServiceA serviceA = (ServiceA) context.getBean("serviceABean");
    	
    	ServiceB serviceB = (ServiceB) context.getBean("serviceBBean");
    	
    	ServiceC serviceC = (ServiceC) context.getBean("serviceCBean");
    	
    	//ServiceC products = (ServiceC) context.getBean("Products");
    	
    	//System.out.println(serviceA.getResult());
    	
    	System.out.println(serviceB.getResult());
    	
    	System.out.println(serviceC.getResult());
    	
    	//System.out.println(products.getLists());
    	
    	((ConfigurableApplicationContext) context).close();	
    }
}
