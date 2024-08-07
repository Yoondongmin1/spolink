<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	<form:form action="user/join" modelAttribute="JoinBean" method="post">
		이름: <form:input path="user_name"/>
		아이디: <form:input path="user_id"/>
		이메일 <form:input path="user_email"/>
		비밀번호: <form:password path="user_pass1"/>
		비밀번호 확인: <form:password path="user_pass2"/>
		<button type="submit">회원가입</button>
		<button type="button">돌아가기</button>
	</form:form>
</body>
</html>