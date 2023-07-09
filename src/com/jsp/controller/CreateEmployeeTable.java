package com.jsp.controller;

import com.jsp.dao.EmployeeDao;

public class CreateEmployeeTable {

	public static void main(String[] args) {
		EmployeeDao employeeDao=new EmployeeDao();
		employeeDao.createTableEmployee();
		System.out.println(" Table created");
	}
}
