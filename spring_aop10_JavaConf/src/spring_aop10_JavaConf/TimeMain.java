package spring_aop10_JavaConf;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TimeMain {
	public static void main(String[] args) {
		CustomerService cs = new AnnotationConfigApplicationContext(JavaConf.class).getBean("cs", CustomerService.class);
		cs.printName();
		cs.printEmail();
		
	}
}
