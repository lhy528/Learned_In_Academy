package kr.co.goott.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.goott.dao.DAO;
import kr.co.goott.model.EmpDTO;
@Controller
public class EmpController {

		@Inject
		DAO empDao;
		
		public void setDao(DAO dao) {
			this.empDao = dao;
		}
		@RequestMapping(value = "/list", method = RequestMethod.GET)
		public String list(Model model) {
			List<EmpDTO> list = empDao.getAllData();
			
			
			model.addAttribute("list", list);
			
			return "list";
		}
		
	}

