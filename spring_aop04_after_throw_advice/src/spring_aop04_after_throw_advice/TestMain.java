package spring_aop04_after_throw_advice;

import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		Message msg = new GenericXmlApplicationContext("app.xml").getBean("proxyBean", Message.class);
		msg.printMsg();
		
		try {
			msg.printThrowMessage();
		}catch (IllegalArgumentException e) {
			System.out.println(e);
			System.out.println("캐치됨");
		}
	}
}
