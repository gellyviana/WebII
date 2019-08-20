<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro</title>
</head>
<body>

	<form action="cadastrar" method="post"> 
		<h1>Cadastro</h1>
		<fieldset> 
			<p> <input type="text" name="nome" placeholder="nome"/>  </p>
			<p> <input type="text" name="login" placeholder="usuario"/>  </p>
			<p> <input type="password" name="senha" placeholder="senha"/>  </p>
			<input type="submit" value="Cadastrar"/>
		</fieldset>
	</form>

</body>
</html>