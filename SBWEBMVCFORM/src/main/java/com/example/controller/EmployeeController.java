package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.entity.Employee;

@Controller
public class EmployeeController {

	@GetMapping("/show")
	public String showData() {
		
		return "empregister";
	}
	
	@PostMapping("/regist")
	public String getData(@ModelAttribute Employee employee,
			                  Model model) {
		System.out.println(employee);
		model.addAttribute("data", employee);
		return "empdata";
	}
}
