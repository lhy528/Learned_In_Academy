package com.example.demo;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import com.example.demo.controller.TestController;

@RunWith(SpringRunner.class)
@WebMvcTest(TestController.class)
public class ControllerTest {
	
	@Autowired
	MockMvc mock;
	
	@Test
	public void sayHello() throws Exception {
		mock.perform(get("/Hello")).andExpect((ResultMatcher)content().string("hello junit world"));
	}
}
