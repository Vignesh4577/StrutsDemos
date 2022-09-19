<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>Get Data from ValueStack</h3>
<s:property value="student"/><br>
<s:property value="message"/>
<s:property value="fruits"/>
<s:property value="hobbies"/>

<h3>Get Data from Session</h3>
<s:property value="#session.message"/>
<s:property value="#session.fruits"/>


</body>
</html>