<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 화면</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
<h3>은행프로그램 로그인</h3>
	<form id="login" action="<%=request.getContextPath()%>/customers.do">
		<input type="hidden" name="action" value="login"/>
		<input type="hidden" name="page" value="mypage"/>
		아이디<input type="text" name="id"/><br />
		비밀번호<input type="password" name="pw"/><br />
		<input type="submit" value="전송"/>
		${page}
	</form>
<script>
$('login').submit(function(){
	alret('설정경로완료');
});
</script>
</body>
</html>