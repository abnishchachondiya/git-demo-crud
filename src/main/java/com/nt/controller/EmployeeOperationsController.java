package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.Employee;
import com.nt.service.IEmployeeMgmtService;

@Controller
public class EmployeeOperationsController {
	
	private IEmployeeMgmtService service;
	
	//return the HOme page controller
	@GetMapping("/")
	public String showHome() {
		return "home";
		
	}
	@GetMapping("/addOne")
	public String showAddEmployeeForm(@ModelAttribute("emp") Employee emp) {
		
		emp.setJob("Clerk");
		return "employee_register";
	}
	
	//return the report page controller
	@GetMapping("/report")
	public String showEmployeeReport(Map<String,Object> map) {
		
		List<Employee> list=service.getAllEmployee();
		map.put("empsData",list);
		return "employee_report";
		
	}
	
	//return the registration page with clerk default value controller
	@GetMapping("/add")
	public String showAddEmployeeForm(@ModelAttribute("emp") Employee emp) {
		
		emp.setJob("Clerk");
		return "employee_register";
	}
	
	////storing the emp detail in db  and returning the report detail page 
	@PostMapping("/add")
	public String addEmployee(Map<String,Object> map,@ModelAttribute("emp") Employee emp) {
		
		String result=service.registerEmployee(emp);
		List<Employee> list=service.getAllEmployee();
		map.put("resultMsg", result);
		map.put("empsData", list);
		return "employee_report";
	}


	@PostMapping("/addOne")
	public String addEmployee(Map<String,Object> map,@ModelAttribute("emp") Employee emp) {
		
		String result=service.registerEmployee(emp);
		List<Employee> list=service.getAllEmployee();
		map.put("resultMsg", result);
		map.put("empsData", list);
		return "employee_report";
	}

}
