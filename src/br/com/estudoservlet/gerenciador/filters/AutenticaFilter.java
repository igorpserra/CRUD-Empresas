package br.com.estudoservlet.gerenciador.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


//@WebFilter("/controlador")
public class AutenticaFilter implements Filter {

    
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("Filtro de autenticação");
				
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		
		String paramAcao = request.getParameter("acao");
		
		
		HttpSession sessao = request.getSession();
		boolean UsuarioNaoLogado = (sessao.getAttribute("usuarioLogado") == null);
		boolean SiteLivre = paramAcao.equals("FormLogin") || paramAcao.equals("Login");
		
		if( !SiteLivre && UsuarioNaoLogado) {
			response.sendRedirect("controlador?acao=FormLogin");
			return;
		}
		
		
		chain.doFilter(request, response);
	}

	
	

}
