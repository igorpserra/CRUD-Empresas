<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Empresa</title>
<c:url value="/controlador" var="linkLogin" />
</head>

<body>
	<h1>Bem vindo ao cadastro de empresas!</h1>
	
	<br>
	<hr>
	
	<h3> Por favor, faça login: </h3>
	<br>
	
	<div>
		<form action="${linkLogin}" method="post">
		
				Login: <input type="text" name="login"/>
			
				Senha: <input type="password" name="senha" />
				
				<input type="submit" value="Entrar"/>
				<input type="hidden" name="acao" value="Login"/>
			
			
		</form>
		
	</div>	

</body>

</html>