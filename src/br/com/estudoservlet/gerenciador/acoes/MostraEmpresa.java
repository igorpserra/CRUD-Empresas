package br.com.estudoservlet.gerenciador.acoes;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.estudoservlet.gerenciador.models.Banco;
import br.com.estudoservlet.gerenciador.models.Empresa;

public class MostraEmpresa implements Acao{
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		Banco banco = new Banco();
		
		Empresa empresa = banco.buscaEmpresa(id);
		
		System.out.println(empresa.getNomeEmpresa());
		
		request.setAttribute("empresa", empresa);
		
		return "dispatcher:editaEmpresa.jsp";
	}
	
}
