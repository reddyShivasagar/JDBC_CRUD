package com.jsp.controller;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;

public class LoginEmployee {
public static void main(String[] args) {
	
	EmployeeDao employeeDao=new EmployeeDao();
	Employee e=new Employee();
	employeeDao.login(e);
}
}
