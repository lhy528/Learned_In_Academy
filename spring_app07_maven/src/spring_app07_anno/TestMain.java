package spring_app07_anno;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class TestMain {
	public static void main(String[] args) {
		// app.xml을 통해서 출력해보세요
		// 현재 시각 : ~~시 ~~분
		// msg : 스프링 재밌다
		
//		BeanFactory factory =
//				new XmlBeanFactory(new FileSystemResource("src/app.xml"));
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("app.xml");
		
		GreetingImple gti = context.getBean("gti", GreetingImple.class);
//		gti.setNt(factory.getBean("nt", NowTime.class)); // app.xml에서 넣을 수 있음
		
		gti.printMsg(); 
		
		/*
		 * 의존 자동 설정
		 * @Autowired 	: 스프링 프레임워크 전용 - 타입을 맞춰서 연결
		 * @Injection 	: 자바에서 지원 - 타입을 맞춰서 연결
		 * @Resource 	: 자바에서 지원 - 이름으로 연결
		 *  
		 */
		
		
		
	}
}
