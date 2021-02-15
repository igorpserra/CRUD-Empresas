package br.com.estudoservlet.gerenciador.acoes;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.estudoservlet.gerenciador.models.Banco;
import br.com.estudoservlet.gerenciador.models.Empresa;

public class ListaEmpresa implements Acao{
		
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresas();
		
		
		request.setAttribute("lista", lista);
		
		return "dispatcher:listaempresa.jsp";
	}
}
