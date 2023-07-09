package com.jsp.controller;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;

public class GetEmployeeById {
public static void main(String[] args) {
	
	EmployeeDao employeeDao=new EmployeeDao();
	
    Employee e=new Employee();
	
	e.setId(5);
	e.setName("Shillamma");
	e.setPhone(9741084836L);
	e.setSal(12000);
	e.setEmail("shilamma@gmail.com");
	e.setPassword("Shila@7488");
	
	
	Employee emp=employeeDao.getEmployeeById(4);
	
	if(emp!=null) {
		System.out.println("employee id:"+emp.getId());
	}
	else {
		System.out.println(" Plz chek data");
	}
}
}
