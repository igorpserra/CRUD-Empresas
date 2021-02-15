<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bem Vindo</title>
</head>
<body>

<div>
	<h1>Bem Vindo ${usuarioLogado.login}! <a href="/gerenciador/controlador?acao=Logout">Sair</a></h1>
	<hr>
</div>
<div>
	<h2>Selecione uma opção:</h2>
	
	<ul>
		<li> 
			<a href="/gerenciador/controlador?acao=FormNovaEmpresa">Adicionar Nova Empresa</a>
		</li>
		<li>
			<a href="/gerenciador/controlador?acao=ListaEmpresa">Ver Empresas Cadastradas</a>
		</li>
	</ul>
	
</div>

</body>
</html>