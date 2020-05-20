package spring_app10_annoEx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		/*
		Phone phone = new SmartPhone();
		phone.call("01011112222");
		phone.sendMsg("하이하이");
		*/
		
		/*
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("app.xml"));
		
		PhoneOS phone = factory.getBean("sp", Phone.class);		// phone이 아니라 phoneOs로 해야 함.
		System.out.println(phone.name);		
		*/
		
		 ApplicationContext context = new ClassPathXmlApplicationContext("app.xml"); // xml로 하던 컨테이너 관리를
//		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConf.class); // java클래스로 할 수 있음
		
		 SmartPhone phone = context.getBean("sp", SmartPhone.class);
//		SmartPhone phone = context.getBean("p", SmartPhone.class);
		phone.call("01022223333");
		phone.showInfo();
		
	}
}
