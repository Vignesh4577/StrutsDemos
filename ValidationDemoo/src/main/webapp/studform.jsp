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
	<s:form action="okregister">
	<s:textfield name="student.name" label="Name"></s:textfield>
	<s:textfield name="student.password" label="Password"></s:textfield>
	<s:textfield name="student.age" label="Age"></s:textfield>

	<s:radio name="student.gender" label="genders" list="{'male','female'}"></s:radio>
	<s:select list="{'java','sql','spring','spring boot','javascript'} " name="student.course"></s:select>

	<s:textfield name="student.mobile" label="Mobile"></s:textfield>
	<s:textfield name="student.allowance" label="Allowance"></s:textfield>
	<s:textfield name="student.email" label="Email"></s:textfield><br>
	<s:submit value="Register"></s:submit>
	
	</s:form>

</body>
</html>