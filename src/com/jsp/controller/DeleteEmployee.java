package com.jsp.controller;

import com.jsp.dao.EmployeeDao;

public class DeleteEmployee {
	public static void main(String[] args) {
		
		EmployeeDao employeeDao=new EmployeeDao();
		employeeDao.deleteEmployee(6);
		
		System.out.println(" Data deleted");
	}
}
