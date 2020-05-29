package com.exam.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoggerUse {
	private static final Logger LOGGER = 
			LoggerFactory.getLogger(LoggerUse.class);
	
	@RequestMapping("processStep1")
	public void processStep1() {
		LOGGER.info("프로세스스텝1 호출..");
	}
	@RequestMapping("processStep2")
	public void processStep2() {
		LOGGER.info("프로세스스텝2 호출..");
	}
}
