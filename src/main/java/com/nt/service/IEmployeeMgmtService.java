package com.nt.service;

import java.util.List;

import com.nt.model.Employee;

public interface IEmployeeMgmtService {
	
	public List<Employee> getAllEmployee();
	public String registerEmployee(Employee emp);

}
