package com.exam.web;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(
		locations = "file:src/main/webapp/WEB-INF/spring/**/*.xml") 
// 컨트롤러에 대한 test를 하려면 servlet-context.xml을 불러와야 함
@WebAppConfiguration
public class ControllerTest {
	
	private static final Logger LOGGER = 
			LoggerFactory.getLogger(ControllerTest.class);
	
	@Inject
	private WebApplicationContext webAppCtx; // view resolver 등등의 MVC 역할
	
	private MockMvc mockMvc; // WAS역할을 대신해줌(브라우저와 요청,응답을 하는 객체)
	
	@Before // 다른것보다 먼저 해라
	public void setUp() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webAppCtx).build();
		LOGGER.info("setUp() completed"); // info는 웹에 출력...?
	}
					
	@Test
	public void testController() {
		try {
			mockMvc.perform(MockMvcRequestBuilders.get("/controller")); // 이 주소가 들어오면 잘 작동 하는지 test
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
