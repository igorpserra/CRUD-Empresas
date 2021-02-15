package br.com.estudoservlet.gerenciador.acoes;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomePage implements Acao {

	public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
	
		return "dispatcher:bemVindo.jsp";
		
		
	}
}

