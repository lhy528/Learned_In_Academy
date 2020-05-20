package spring_app05_maven;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
//		StunGun sg = new StunGun();
//		
//		Police p1 = new Police(sg, 150);
//		
//		p1.attack("도둑님");
//		System.out.println(p1.hp);
		
		// runtime시 xml에 있는 정보 불러와서 사용
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("app.xml");
		
		// 경찰 스나이퍼가 인질범을 총으로 공격하도록
		// 출력 : 인질범을 숨을 멈추고 탕 쏜다
		//	   : 스나이퍼 hp = 98
		System.out.println("--------------------------------------");
		Sniper sniper = context.getBean("sniper", Sniper.class);
		sniper.attack("인질범");
		System.out.println(sniper.hp);
		
		
	}
}
