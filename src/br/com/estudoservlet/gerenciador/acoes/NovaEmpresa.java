package br.com.estudoservlet.gerenciador.acoes;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.estudoservlet.gerenciador.models.Banco;
import br.com.estudoservlet.gerenciador.models.Empresa;

public class NovaEmpresa implements Acao {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String name = request.getParameter("name");
		String cnpj = request.getParameter("cnpj");
		
		
		
		Empresa empresa = new Empresa();
		empresa.setNomeEmpresa(name);
		empresa.setCnpj(cnpj);
		
		Banco EmpresaBanco = new Banco();
		EmpresaBanco.adiciona(empresa);
		
		
		System.out.println("O nome da empresa cadastrada é: "+ name +" com CNPJ:" + cnpj + " e o id " + empresa.getId() );
		System.out.println(empresa.getNomeEmpresa() + " " + empresa.getCnpj());
		
		return "redirect:controlador?acao=ListaEmpresa";
		
	}
}
