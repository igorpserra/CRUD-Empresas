package br.com.estudoservlet.gerenciador.acoes;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.estudoservlet.gerenciador.models.Banco;

public class EditaEmpresa implements Acao{
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String nome = request.getParameter("name");
		String cnpj = request.getParameter("cnpj");
		int id = Integer.parseInt(request.getParameter("id"));
		
		
		Banco banco = new Banco();
		banco.alteraEmpresa(id,nome,cnpj);		
		
		System.out.println("Alterando dados da empresa. Nome:  "  + request.getParameter("nomeAntigo") + " --> " + nome + " Cnpj: " + request.getParameter("cnpjAntigo") + " --> " + cnpj);
		
		return "redirect:controlador?acao=ListaEmpresa";
		
	}
	
}
