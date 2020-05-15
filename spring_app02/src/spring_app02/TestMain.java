package spring_app02;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestMain {
	public static void main(String[] args) {
		// 1) 반장님이 커피를 홀짝홀짝 마셔요 => 출력
//		BevImple bi = new BevImple("커피");
//		bi.drink("반장");
		
		// 스프링으로 다시 구현!
		BeanFactory factory =
				new XmlBeanFactory(new FileSystemResource("src/app.xml"));
		
		BevImple bi = new BevImple("커피");
		BevImple bi2 = new BevImple("커피");
		System.out.println(bi);
		System.out.println(bi2);
		System.out.println("=======================================");
		
		Beverage bvrg3 = (Beverage)factory.getBean("b");
		Beverage bvrg4 = (Beverage)factory.getBean("b");
		System.out.println(bvrg3);
		System.out.println(bvrg4); // 싱글톤 패턴으로 생성되는 것을 알 수 있다(주소가 같음)
		System.out.println("=======================================");
		
		// DI(Dependency Injection) : 의존성 주입, 여기선 생성자 parameter 입력하려고 함
		//  : 의존관계에 있어서 XML에 있는 정보를 스프링 프레임워크가 Runtime시 호출해서 동작하는 형태
		Beverage bvrg = (Beverage)factory.getBean("b");
		bvrg.drink("반장");
		
		// 2) 반장님이 다른 음료를 마실수 있게 구현
		Beverage bvrg2 = (Beverage)factory.getBean("t");
		bvrg2.drink("반장");
		
		
		
	}
}
