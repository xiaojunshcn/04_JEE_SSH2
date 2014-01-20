<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>员工添加</title>
</head>
<body>
	<s:form action="manage_add" namespace="/employee" method="post">
		用户名：<s:textfield name="employee.name"/> <br/>
		密码：<s:textfield name="employee.password"/> <br/>
		性别：<s:radio list="#{'MAN':'男','WOMAN':'女'}" listKey="key" 
		listValue="value" name="employee.gender"></s:radio> <br/>
		
		<input type="submit" value="save"/>
	</s:form>
</body>
</html>