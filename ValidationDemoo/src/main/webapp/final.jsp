<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:property value="employee"/><br><br>
Name  :  <s:property value="employee.name"/><br>
City  :  <s:property value="employee.city"/><br>
Salary  :  <s:property value="employee.salary"/><br>
Age  :  <s:property value="employee.age"/><br>
Email  :  <s:property value="employee.email"/><br>



</body>
</html>