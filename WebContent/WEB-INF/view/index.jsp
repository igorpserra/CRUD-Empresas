<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Empresa</title>
<c:url value="/controlador" var="linknovaempresa" />
</head>

<body>
	<h1>Bem vindo ao cadastro de empresas!</h1>
	<div>
		<form action="${linknovaempresa}" method="post">
		
			<div>
				Nome da empresa: <input type="text"	name="name"/>
			</div>
			
			<div>
				Cnpj: <input type="text" name="cnpj" />
			</div>
			<div>
				<input type="submit" value="Cadastrar"/>
			</div>
			<div>
				<input type="hidden" name="acao" value="NovaEmpresa"/>
			</div>
			
			
		</form>
		
	</div>	

</body>

</html>