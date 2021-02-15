<%@page import = "java.util.List,br.com.estudoservlet.gerenciador.models.*" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Empresa</title>
<c:url value="/controlador" var="linkattempresa" />

</head>

<body>
	<div>
		<form action="${linkattempresa }" method="post">
		
			<div>
				Nome da empresa: <input type="text" value="${empresa.nomeEmpresa}"	name="name"/>
			</div>
			
			<div>
				Cnpj: <input type="text" value="${empresa.cnpj}" name="cnpj" />
			</div>
			<div>
				<input type="hidden" value="${empresa.getId()}" name="id" />
			</div>
			<div>
				<input type="hidden" value="EditaEmpresa" name="acao" />
			</div>
			<div>
				<input type="hidden" value="${empresa.nomeEmpresa }" name="nomeAntigo" />
			</div>
			<div>
				<input type="hidden" value="${empresa.cnpj }" name="cnpjAntigo" />
			</div>
			<div>
				<input type="submit" value="Atualizar"/>
			</div>
			
			
		</form>
		
	</div>	

</body>

</html>