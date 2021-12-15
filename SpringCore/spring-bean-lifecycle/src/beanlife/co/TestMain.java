package beanlife.co;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Samosa samosa=context.getBean("s1",Samosa.class);
		samosa.getPrice();
System.out.println("Price"+samosa);
//registering shut down hook
context.registerShutdownHook();
	}

}
