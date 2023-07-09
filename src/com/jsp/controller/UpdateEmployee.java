package com.jsp.controller;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;

public class UpdateEmployee {
	public static void main(String[] args) {
		
		EmployeeDao employeeDao=new EmployeeDao();
		Employee e=new Employee();
		
		e.setId(5);
		e.setName("amma");
		e.setPhone(9741084836L);
		e.setSal(12000);
		e.setEmail("shilamma@gmail.com");
		e.setPassword("Shila@7488");
		
		employeeDao.updateEmployee(e);
		System.out.println(" Data updated");
	}
}
