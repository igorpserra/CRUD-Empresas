package br.com.estudoservlet.gerenciador.controler;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.estudoservlet.gerenciador.acoes.Acao;


//@WebServlet("/controlador")
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
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
		
		
	/*	if(paramAcao.equals("ListaEmpresa")) {
			
			ListaEmpresa le = new ListaEmpresa();
			path = le.executa(request, response);
			
		} else if(paramAcao.equals("NovaEmpresa")) {
			
			NovaEmpresa ne = new NovaEmpresa();
			path = ne.executa(request, response);
			
		}else if(paramAcao.equals("DeletaEmpresa")) {
			
			DeletaEmpresa de = new DeletaEmpresa();
			path = de.executa(request, response);
			
		}else if(paramAcao.equals("MostraEmpresa")) {
			
			MostraEmpresa busca = new MostraEmpresa();
			path = busca.executa(request, response);
			
		}else if(paramAcao.equals("EditaEmpresa")) {
			
			EditaEmpresa edit = new EditaEmpresa();
			path = edit.executa(request, response);
			
		}else if(paramAcao.equals("FormNovaEmpresa")) {
			
			FormNovaEmpresa form = new FormNovaEmpresa();
			path = form.executa(request, response);
			
		}  */
		
		
	}

}
