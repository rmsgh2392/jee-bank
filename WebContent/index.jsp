<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비트은행</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
<h1>회원가입페이지</h1>
<table border='3'>
	<tr>
		<td>로그인</td>
		<td><input id="btn" type="button" value="로그인"/></td>
	</tr>
	<tr>
		<td>회원가입</td>
		<td><a id="a_join" href="#">SIGN IN</a></td>
	</tr>
</table>
<script>
$('#btn').click(function(){
	alert('클릭클릭');
	location.assign('<%=request.getContextPath()%>/customers.do?page=login');
});	
$('#a_join').click(function(){
	alert('조인조인');
	location.assign('<%=request.getContextPath()%>/customers.do?page=join');
});	

</script>
</body>
</html>