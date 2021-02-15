package br.com.estudoservlet.gerenciador.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.estudoservlet.gerenciador.acoes.Acao;


//@WebFilter("/controlador")
public class ControladorFilter implements Filter {

    
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("Filtro Controlador");
				
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		
		String paramAcao = request.getParameter("acao");
		String NomeClasse = "br.com.estudoservlet.gerenciador.acoes." + paramAcao;
		
		
		String path;
		
		try {
			Class classe = Class.forName(NomeClasse);
			Acao acao = (Acao) classe.newInstance();
			path = acao.executa(request, response);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | ServletException
				| IOException e) {
			throw new ServletException(e);
		}
		
		String[] splitPath = path.split(":");
		
		if(splitPath[0].equals("dispatcher")) {
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/" + splitPath[1]);
			rd.forward(request, response);
		}else {
			response.sendRedirect(splitPath[1]);
		}
		
		

	
	
	}
}
