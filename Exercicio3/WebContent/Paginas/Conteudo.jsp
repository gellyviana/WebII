<%@ page import="br.ufrn.imd.dominio.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Página Principal</title>
</head>
<body>
	<p>
		Usuário <b> <%= ((Usuario)session.getAttribute("usuario")).getNome() %> </b>
	</p>
	<button>Sair</button>
</body>
</html>