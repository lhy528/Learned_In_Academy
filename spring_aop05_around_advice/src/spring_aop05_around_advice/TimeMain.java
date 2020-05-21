package spring_aop05_around_advice;

import org.springframework.context.support.GenericXmlApplicationContext;

public class TimeMain {
	public static void main(String[] args) {
		CustomerService cs = new GenericXmlApplicationContext("app.xml").getBean("proxyBean", CustomerService.class);
		cs.printName();
		cs.printEmail();
		
	}
}
