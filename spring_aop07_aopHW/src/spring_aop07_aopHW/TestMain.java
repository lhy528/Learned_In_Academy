package spring_aop07_aopHW;

import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
//		Weapon wp = new GenericXmlApplicationContext("app.xml").getBean("proxyBean", Weapon.class);
		// 위까지는 proxy를 이용하는 방법, 아래는 aspectj를 이용하는 방법
		
		Weapon wp = new GenericXmlApplicationContext("app2.xml").getBean("biz", Weapon.class);
		
		wp.fire();
	}
	
}
