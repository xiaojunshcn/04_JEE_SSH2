package com.joe.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.joe.bean.Employee;
import com.joe.service.IEmployeeService;

@Service
@Transactional
public class EmployeeServiceBean implements IEmployeeService {
	@Resource SessionFactory factory;
	
	@Override
	public void save(Employee employee) {
		//same as save()
		factory.getCurrentSession().persist(employee);
	}
	@Override
	public void update(Employee employee) {
		//same as saveOrUpdate()
		factory.getCurrentSession().merge(employee);
	}
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public Employee find(String name) {
		return (Employee)factory.getCurrentSession().get(Employee.class, name);
	}
	@Override
	public void delete(String... names) {
		for (String name:names) {
			factory.getCurrentSession().delete(factory.getCurrentSession().load(Employee.class, name));
		}
	}
	@SuppressWarnings("unchecked")
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public List<Employee> list() {
		return factory.getCurrentSession().createQuery("from Employee").list();
	}
}
