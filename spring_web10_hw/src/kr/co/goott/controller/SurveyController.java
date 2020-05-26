package kr.co.goott.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SurveyController {
	@RequestMapping(value = "survey/survey.choose")
	public String chooseOne() {
		
		return "surveyForm";
	}
	
	@RequestMapping(value = "survey/survey.ok")
	public String showChoose(@RequestParam(value = "picked")String picked, Model model) {
		model.addAttribute("picked", picked);
		return "surveySubmitted"; 
	}
	
}
