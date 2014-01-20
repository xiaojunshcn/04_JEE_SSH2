<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>员工列表</title>
</head>
<body>
	ognl:
	<s:iterator value="#request.employees">
		<s:property value="name"/> , <s:property value="password"/>, <s:property value="gender"/> <br/>
	</s:iterator>
	
	<br/>
	jstl:
	
	<c:forEach items="${employees}" var="employee">
		${employee.name}, ${employee.password}, ${employee.gender}<br/>
	</c:forEach>
</body>
</html>