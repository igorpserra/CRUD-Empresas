package br.com.estudoservlet.gerenciador.acoes;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.estudoservlet.gerenciador.models.Banco;

public class DeletaEmpresa implements Acao{
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		int id = Integer.parseInt(request.getParameter("id")); 
		
		Banco banco = new Banco();
		
		banco.remove(id);
		
		return "redirect:controlador?acao=ListaEmpresa";
		
	}

}
