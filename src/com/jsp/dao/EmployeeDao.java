package com.jsp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jsp.dto.Employee;

public class EmployeeDao {
	
	private String password;
	private String email;

	public void createTableEmployee() {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud", "root", "root");
			Statement statement=connection.createStatement();
			statement.execute("create table employee1(id int primary key,name varchar(40),phone bigint(10),sal double,email varchar(45),password varchar(45))");
			connection.close();
			System.out.println("table created");
			
			} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}
	

	public int saveEmployee(Employee e) {
	try {
		
	Class.forName("com.mysql.cj.jdbc.Driver");
		
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud", "root", "root");
	
	PreparedStatement p=connection.prepareStatement("insert into employee1 values(?,?,?,?,?,?)");
	
	p.setInt(1, e.getId());
	p.setString(2, e.getName());
	p.setLong(3,e.getPhone());
	p.setDouble(4, e.getSal());
	p.setString(5, e.getEmail());
	p.setString(6,e.getPassword());
	
	int res=p.executeUpdate();
	
	connection.close();
	
	return res;
	} catch (ClassNotFoundException | SQLException e1) {
		
		e1.printStackTrace();
	}
	return 0;
}


	public int updateEmployee(Employee e) {
	
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud", "root", "root");
		
		PreparedStatement p=connection.prepareStatement("update employee1 set Name=?, Phone=?,Sal=?, Email=?, Password=? where Id=?");
		
		
		p.setString(2, e.getName());
		p.setLong(3,e.getPhone());
		p.setDouble(4, e.getSal());
		p.setString(5, e.getEmail());
		p.setString(6,e.getPassword());
		p.setInt(1, e.getId());
		
		int res=p.executeUpdate();
		
		connection.close();
		
		return res;
		
		} catch (SQLException e1) {
		
			e1.printStackTrace();
		
	} catch (ClassNotFoundException e1) {
	
		e1.printStackTrace();
	}
	
	return 0;
	
}


	public int deleteEmployee(int id) {
	
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud", "root", "root");
		
		PreparedStatement p=connection.prepareStatement("delete from employee1 where id=?");
		
		p.setInt(1,id);
		
		int res=p.executeUpdate();
		
		connection.close();
		
		
		return res;
		} catch (SQLException e1) {
		
			e1.printStackTrace();
		
	} catch (ClassNotFoundException e1) {
	
		e1.printStackTrace();
	}
	
	return 0;
	
}


	public List<Employee> getAllEmployee(){
	List<Employee> list=new ArrayList<Employee>();
	
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud", "root", "root");
		Statement statement=connection.createStatement();
		
		
	    ResultSet resultSet=statement.executeQuery("select * from employee1");
	
	while(resultSet.next()) {
		
		int id= resultSet.getInt(1);
		String name= resultSet.getString(2);
		long phone= resultSet.getLong(3);
		double sal= resultSet.getDouble(4);
		String email=resultSet.getString(5);
		String password=resultSet.getString(6);
		
		
		Employee employee=new Employee();
		
		employee.setId(id);
		employee.setName(name);
		employee.setPhone(phone);
		employee.setSal(sal);
		employee.setEmail(email);
		employee.setPassword(password);
		
		list.add(employee);
		
	}
	connection.close();
		
	} catch (ClassNotFoundException | SQLException e) {
		
		e.printStackTrace();
	}
	return list;
}


	public Employee getEmployeeById(int id) {
	
	Employee employee=new Employee();
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql:localhost:3306/jdbc_crud", "root", "root");
		
		PreparedStatement preparedStatement=connection.prepareStatement("select * from employee1 where id=?");
		preparedStatement.setInt(1, id);
		ResultSet resultSet=preparedStatement.executeQuery();
	
	while(resultSet.next()) {
		int id1= resultSet.getInt(1);
		String name= resultSet.getString(2);
		long phone= resultSet.getLong(3);
		double sal= resultSet.getDouble(4);
		String email=resultSet.getString(5);
		String password=resultSet.getString(6);
		
		
		employee.setId(id1);
		employee.setName(name);
		employee.setPhone(phone);
		employee.setSal(sal);
		employee.setEmail(email);
		employee.setPassword(password);
		
		
		
	}
	connection.close();
		
	} catch (ClassNotFoundException | SQLException e) {
		
		e.printStackTrace();
	}
	
	return employee;
	
}


	public Employee login(Employee e) {
	
	Employee employee=new Employee();
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud", "root", "root");
		PreparedStatement statement=connection.prepareStatement("select * from employee1 where Email=? and Password=?");
		statement.setString(1, email);
		statement.setString(2, password);
		
		ResultSet resultSet=statement.executeQuery();
		while(resultSet.next()) {
			
		}
		connection.close();
		
		
	} catch (ClassNotFoundException | SQLException e1) {

		e1.printStackTrace();
	}
	
	
	return null;
	
}

}
