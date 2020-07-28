<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
</head>
<body>
	<div>
		<h1>회원 가입 폼</h1>
		<div>
			<form method="post" action="join">
				<div>
					<label>name</label>
					<input type="text" name="name">
				</div>
				<div>
					<label>E-mail</label>
					<input type="text" name="email">
				</div>
				<div>
					<label>password</label>
					<input type="password" name="password">
				</div>
				<div>
					<label></label>
					<input type="submit" value="회원가입">
				</div>
			</form>
		</div>
	</div>

</body>
</html>