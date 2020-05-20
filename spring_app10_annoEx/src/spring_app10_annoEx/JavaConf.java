package spring_app10_annoEx;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConf {
	
	@Bean		// Bean이라고 알려줌?
	public PhoneOS phoneOS() {
		PhoneOS po = new PhoneOS();
		po.setName("아이폰SE");
		po.setVersion("iOS 13");
		return po;
	}
	
	@Bean(name="p")		// 얘도 빈이다ㅣ 알려줘야 함. name은 권장사항.
	public SmartPhone smartPhone() {
		SmartPhone sp = new SmartPhone();
		sp.setOs(phoneOS());		// 위에 Bean? phoneOS 호출 
		return sp;
	}
	
}
