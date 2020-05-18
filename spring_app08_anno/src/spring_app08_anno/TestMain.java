package spring_app08_anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("app.xml");
		
		Monitor mt = context.getBean("sm", Monitor.class);
		mt.showMonitor();
		
		
	}
		
}
