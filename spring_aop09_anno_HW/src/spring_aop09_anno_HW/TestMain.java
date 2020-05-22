package spring_aop09_anno_HW;

import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		Weapon wp = new GenericXmlApplicationContext("app.xml").getBean("wp", Weapon.class);
		
		
		wp.fire();
	}
	
}
