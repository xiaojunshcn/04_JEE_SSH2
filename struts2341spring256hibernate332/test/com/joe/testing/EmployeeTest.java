package com.joe.testing;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.joe.bean.Employee;
import com.joe.service.IEmployeeService;

public class EmployeeTest {
	private static IEmployeeService employeeService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		try {
			ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
			employeeService = (IEmployeeService) ac.getBean("employeeServiceBean");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void save1() {
		Employee employee = new Employee("lz","3456");
		employee.setGender("woman");
		employeeService.save(employee);
	}

	@Test
	public void update() {
		Employee employee = employeeService.find("joe");
		employee.setPassword("789011");
		employeeService.update(employee);
	}
	@Test
	public void delete() {
		employeeService.delete("joe");
	}
	@Test
	public void find() {
		Employee employee = employeeService.find("joe");
		System.out.println(employee.getPassword());
	}
	
	@Test
	public void list() {
		List<Employee> employees = employeeService.list();
		for (Employee em: employees)
			System.out.println(em.getPassword());
	}
}
