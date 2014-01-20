package com.joe.service;

import java.util.List;

import com.joe.bean.Employee;

public interface IEmployeeService {
	public void save(Employee employee);
	public void update(Employee employee);
	public Employee find(String name);
	public void delete(String... name);
	public List<Employee> list();
}
