package com.jsp.controller;

import java.util.List;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;

public class TestEmployee {
	
    public static void main(String[] args) {
	
	EmployeeDao employeeDao= new  EmployeeDao();
	
   /*	employeeDao.creatTableEmployee();*/
	
	Employee e=new Employee();
	
	e.setId(5);
	e.setName("Shillamma");
	e.setPhone(9741084836L);
	e.setSal(12000);
	e.setEmail("shilamma@gmail.com");
	e.setPassword("Shila@7488");
	
	//employeeDao.updateEmployee(e);
	//employeeDao.saveEmployee(e);
	//employeeDao.login(e);
	//employeeDao.deleteEmployee(4);
	
	
	/*List<Employee> list=employeeDao.getAllEmployee();
	for(Employee employee:list) {
		System.out.println("employee id:"+employee.getId());
		System.out.println("employee name:"+employee.getName());
		System.out.println("employee phone:"+employee.getPhone());
		System.out.println("employee sal:"+employee.getSal());
		System.out.println("employee email:"+employee.getEmail());
		System.out.println("employee password:"+employee.getPassword());
		System.out.println("-------------------------------------------");
	}*/
	
	
	Employee emp=employeeDao.getEmployeeById(3);
	
	if(emp!=null) {
		System.out.println("employeeid:"+emp.getId());
	}
	System.out.println("data saved");

}
}
