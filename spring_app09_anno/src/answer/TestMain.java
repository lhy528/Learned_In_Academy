package answer;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class TestMain {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("app2.xml");
		
		Character ch1 = context.getBean("p", Police.class);
		ch1.attack("인질범");
		
	}
}
