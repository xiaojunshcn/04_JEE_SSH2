package com.joe.action;

import javax.annotation.Resource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import com.joe.bean.Employee;
import com.joe.service.IEmployeeService;
import com.opensymphony.xwork2.ActionContext;

@Controller 
@Scope("prototype")
public class EmployeeManageAction {
	@Resource IEmployeeService employeeService;
	private Employee employee;
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String addUI() {
		return "add";
	}
	public String add() {
		employeeService.save(employee);
		ActionContext.getContext().put("message", "保存成功");
		return "message";
	}
}
