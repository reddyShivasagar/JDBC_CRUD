package com.jsp.controller;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;

public class SaveEmployee {
  public static void main(String[] args) {
	  
	  
		EmployeeDao employeeDao=new EmployeeDao();
		
		employeeDao.createTableEmployee();
		
		Employee e=new Employee();
		
		e.setId(1);
		e.setName("Shillamma");
		e.setPhone(9741084836L);
		e.setSal(12000);
		e.setEmail("shilamma@gmail.com");
		e.setPassword("Shila@7488");
		
		employeeDao.saveEmployee(e);
		
		System.out.println(" data saved");
	}
}
