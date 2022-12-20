package com.nt.service;

import java.util.List;

import com.nt.model.Employee;
import com.nt.repo.IEmployeeRepo;

public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService{

	private IEmployeeRepo empRepo;
	
	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}

	@Override
	public String registerEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
		int idVal=empRepo.save(emp).getEmpno();
		return "Employee Is saved With IdValue:"+idVal;
	}

}
