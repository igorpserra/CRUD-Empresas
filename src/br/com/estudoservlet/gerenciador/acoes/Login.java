package br.com.estudoservlet.gerenciador.acoes;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.estudoservlet.gerenciador.models.Banco;
import br.com.estudoservlet.gerenciador.models.Usuario;

public class Login implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		Banco banco = new Banco();
		
		
		Usuario user = banco.autentica(login, senha);
		
		if(user != null) {
			HttpSession sessao = request.getSession();
			sessao.setAttribute("usuarioLogado", user);
			return "redirect:controlador?acao=HomePage";
		}else {
			return "redirect:controlador?acao=FormLogin";
		}					
	}	
}
