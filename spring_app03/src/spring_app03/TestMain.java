package spring_app03;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestMain {	
	public static void main(String[] args) {
		BeanFactory factory = 
				new XmlBeanFactory(new FileSystemResource("src/app.xml"));
		
//		Printer prt = (Printer)factory.getBean("d");
//		prt.print("도트프린터입니다 아 전먹고싶다");
//		System.out.println("========================");
//		
//		Printer prt2 = (Printer)factory.getBean("l");
//		prt2.print("레이저프린터입니다 아 배고파 막걸리떙겨");
		
		
		// 형변환을 한번에
		Printer p = factory.getBean("d", Printer.class);
		p.print("wow ~!");
	}
}
