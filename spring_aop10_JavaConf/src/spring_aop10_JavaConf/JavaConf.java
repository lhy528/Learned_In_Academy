package spring_aop10_JavaConf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

// 스프링 컨테이너에 bean 등록을 xml 대신 자바 객체가 수행

@Configuration
@EnableAspectJAutoProxy // app.xml에서 autoproxy랑 똑같음(빼야 수행됨..?)
public class JavaConf {
	
	@Bean(name = "cs")
	public CustomerServiceImple cs() {
		CustomerServiceImple csi = new CustomerServiceImple();
		csi.setName("갑순이");
		csi.setEmail("gab@soo.ni");
		
		return csi;
	}
	
	@Bean
	public CheckTime ct() {
		CheckTime ckt = new CheckTime();
		ckt.publicPointcut();
		return ckt;
	}
}
