<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<form action="logar" method="post"> 
		<h1>Bem vindo</h1>
		<fieldset> 
			<p> <input type="text" name="login" placeholder="usuario"/>  </p>
			<p> <input type="password" name="senha" placeholder="senha"/>  </p>
			<input type="submit" value="Entrar"/>
		</fieldset>
	</form>
</body>
</html>