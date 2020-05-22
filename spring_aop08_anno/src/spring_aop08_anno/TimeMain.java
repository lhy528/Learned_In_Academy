package spring_aop08_anno;

import org.springframework.context.support.GenericXmlApplicationContext;

public class TimeMain {
	public static void main(String[] args) {
		CustomerService cs = new GenericXmlApplicationContext("app.xml").getBean("cs", CustomerService.class);
		cs.printName();
		cs.printEmail();
		
	}
}
