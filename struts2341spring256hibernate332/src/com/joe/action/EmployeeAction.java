package com.joe.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.joe.service.IEmployeeService;
import com.opensymphony.xwork2.ActionContext;

@Controller
public class EmployeeAction {
	@Resource IEmployeeService employeeService;
	
	public String execute() {
		ActionContext.getContext().put("employees", employeeService.list());
		return "list";
	}
}
