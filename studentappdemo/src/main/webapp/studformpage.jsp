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
	<s:form action="register">
		<s:textfield name="student.name" label="Name"></s:textfield>
		<s:password name="student.password" label="Password"></s:password>
		<s:textfield name="student.city" label="City"></s:textfield>
		<s:textfield name="student.age" label="Age"></s:textfield>
		<s:textfield name="student.mobile" label="Mobile"></s:textfield>
		<s:textfield name="student.allowance" label="Allowance"></s:textfield>
		<s:select name="student.course" list="{'java','spring','sql'}" label="Course"></s:select>	
		<s:radio name="student.gender" label="Gender" list="{'male','female'}"></s:radio>
		<s:textfield name="student.email" label="Email"></s:textfield>

		<s:checkboxlist list="hobbies" name="student.hobby" label="Hpbbies"></s:checkboxlist>


		<s:submit value="Show Student"></s:submit>

	</s:form> 
	
	<%-- <body>
	<s:form action="register">
		<s:textfield key="student.name" ></s:textfield>
		<s:password key="student.password" ></s:password>

		<s:textfield key="student.city" ></s:textfield>
		<s:textfield key="student.age" ></s:textfield>
		<s:textfield key="student.mobile"></s:textfield>
		<s:textfield key="student.allowance" ></s:textfield>
		<s:select key="student.course" list="{'java','spring','sql'}" ></s:select>	
		<s:radio key="student.gender" list="{'male','female'}"></s:radio>
		<s:textfield key="student.email" ></s:textfield>

		<s:checkboxlist list="hobbies" key="student.hobby"></s:checkboxlist>


		<s:submit value="Show Student"></s:submit>

	</s:form> --%>
	
</body>
</html>