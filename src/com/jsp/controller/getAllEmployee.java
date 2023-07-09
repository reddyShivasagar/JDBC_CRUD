package com.jsp.controller;

import java.util.List;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;

public class getAllEmployee {
	public static void main(String[] args) {
		
		EmployeeDao employeeDao=new EmployeeDao();
		
		List<Employee> list=employeeDao.getAllEmployee();
		for(Employee employee:list) {
			System.out.println("employee id:"+employee.getId());
			System.out.println("employee name:"+employee.getName());
			System.out.println("employee phone:"+employee.getPhone());
			System.out.println("employee sal:"+employee.getSal());
			System.out.println("employee email:"+employee.getEmail());
			System.out.println("employee password:"+employee.getPassword());
			System.out.println("-------------------------------------------");
		}
		
		
		
		
	}
}
