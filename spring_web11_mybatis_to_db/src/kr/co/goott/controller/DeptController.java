package kr.co.goott.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.goott.dao.DAO;
import kr.co.goott.dto.DeptDTO;

@Controller
public class DeptController {
	@Autowired
	DAO dao;
	
	// DI 주입을 받을 수 있도록 setter 열기
	public void setDao(DAO dao) {
		this.dao = dao;
	}
	
	@RequestMapping(value = "deptList")
	public String list(Model model) {
		List<DeptDTO> list = dao.selectAll();
		model.addAttribute("list", list);
		return "list";
	}
	
	@RequestMapping(value = "/insert")
	public String processStep2() {
		return "insertForm";
	}
	
	// spring mvc 파라미터 값 가져오기
	// 1. 요청객체 : (HttpServletRequest req)
	// 2. annotation : (@RequestParam("deptno")int deptno, ...)
	// 3. annotation(객체로 받기) : (@ModelAttribute() DeptDTO, ..)
	
	@RequestMapping(value = "/insertOk")
	public String processStep3(@ModelAttribute DeptDTO deptDto) {
		
		dao.insertOne(deptDto);
		
		return "redirect:/deptList";
//		return "insertOk";
	}
}
