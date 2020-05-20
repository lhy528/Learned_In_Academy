package spring_app01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestMain {
	// 홍길동 님 안녕하세요
	public static void main(String[] args) {
//		HelloKr hk = new HelloKr();
//		String name = "홍길동";
//		hk.sayHello(name);
		
		// 위처럼 구동하도록 xml 파일 읽어들이기
		// : 스프링 컨테이너를 이용하여 읽어들이기
		
		BeanFactory factory = 
				new XmlBeanFactory(new FileSystemResource("src/app.xml"));
//		
//		HelloKr hk = (HelloKr)factory.getBean("h");
//		hk.sayHello("홍길동");
		
//		
//		HelloUS hu = new HelloUS();
//		hu.sayHello("hong");
		
		// 국적판별하기
		Hello hk = (Hello)factory.getBean("h");
		hk.sayHello("홍길동");
		
	}
	
}
