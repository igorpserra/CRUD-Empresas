package br.com.estudoservlet.gerenciador.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


//@WebFilter("/controlador")
public class gerenciadorFilter implements Filter {

    
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("Filtro Gerenciador");
		
		long antes = System.currentTimeMillis();
		
		chain.doFilter(request, response);
		
		String acao = request.getParameter("acao");
		
		System.out.println("Executando ação: " + acao);
		
		long depois = System.currentTimeMillis();
		System.out.println("Tempo utilizado: " + (depois - antes));
		
		
	}

}
