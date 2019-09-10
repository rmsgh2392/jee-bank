<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My PAGE</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
<h4>환영합니다 ${customer.name}</h4>
<h4>아이디 ${customer.id}</h4>
<h4>비밀번호 ${customer.pw}</h4>
<h4>주민번호 ${customer.ssn}</h4>
<h4>신용도 ${customer.credit}</h4>
</body>
</html>