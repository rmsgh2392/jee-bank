<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
<h2>회원가입</h2>
	<form id="join" action="<%=request.getContextPath()%>/member.do">
		아이디<input type="text" name="id"/><br />
		비밀번호<input type="text" name="pw"/><br />
		이름<input type="text" name="name"/><br />
		주민번호<input type="text" name="ssn"/><br />
		신용도<input type="text" name="credit"/><br />
		<input type="submit" value="전송"/><br />
	</form>
<script>
$('join').submit(function(){
	alert('설정경로 완료');
});
</script>
</body>
</html>