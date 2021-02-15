<%@page import = "java.util.List,br.com.estudoservlet.gerenciador.models.*" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<head>
	<title>Lista de Empresas</title>
	<c:url value="/controlador?acao=DeletaEmpresa" var="deletaEmpresa"></c:url>
	<c:url value="/controlador?acao=MostraEmpresa" var="editaEmpresa"></c:url>
	<c:url value="/controlador?acao=HomePage" var="homePage"></c:url>
	<c:url value="/controlador?acao=FormNovaEmpresa" var="linkCriaEmpresa" />
	<c:url value="/controlador?acao=Logout" var="Logout" />
</head>
<body>
	<h3>Você esta logado como: ${usuarioLogado.login} <a href="${homePage}"> home</a> <a href="${Logout }">Sair</a></h3>
	
	<br>
	
	<c:if test="${not empty novaEmpresa }">
			Empresa ${empresa} cadastrada com sucesso!
	</c:if>


	<h1><a href="${linkCriaEmpresa }">+</a> Lista de Empresas:</h1>
	<hr>

<ul>

	

	<c:forEach items="${lista}" var="empresa" >  
			<li>
				<h2> Nome: ${empresa.nomeEmpresa} 
					<a href="${deletaEmpresa}&id=${empresa.getId()}" >deletar</a> 
					<a href="${editaEmpresa}&id=${empresa.getId()}" >editar</a>	 
				</h2>
			</li>
			<li>
				<h4>Cnpj: ${empresa.cnpj} </h4>
			</li>
			<li>
				<h4>Id: ${empresa.getId()} </h4>
			</li>
			<li>
				<h4>Data de criação: <fmt:formatDate value="${empresa.dataCriacao}" pattern="dd/MM/yyyy"/> </h4>
			</li>
			<hr>
	
	</c:forEach>
			
</ul>

</body>
</html>