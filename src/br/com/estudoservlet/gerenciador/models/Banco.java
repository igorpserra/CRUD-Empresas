package br.com.estudoservlet.gerenciador.models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco { 

    private static List<Empresa> lista = new ArrayList<>();
    
    private static List<Usuario> listaUsers = new ArrayList<>();
    
    static {
    	Empresa Alura = new Empresa();
    	Empresa Google = new Empresa();
    	
    	Alura.setNomeEmpresa("Alura");
    	Alura.setCnpj("121241");
    	
    	Google.setNomeEmpresa("Google");
    	Google.setCnpj("5432321");
    	
    	lista.add(Alura);
    	lista.add(Google);
    	
    	Usuario u1 = new Usuario();
    	
    	u1.setLogin("admin");
    	u1.setSenha("admin");
    	
    	listaUsers.add(u1);
    	}

    public void adiciona(Empresa empresa) { 
        lista.add(empresa);
    }
    
    public void remove(int id) {
    	
    	Iterator<Empresa> it = lista.iterator();
    	
    	while(it.hasNext()) {
    		Empresa emp = it.next();
    		
    		if(emp.getId() == id) {
    			it.remove();
    		}
    		
    	}
    }	
    	
    
    public List<Empresa> getEmpresas(){ 
        return Banco.lista;
    }

	public Empresa buscaEmpresa(int id) {
		
		for (Empresa empresa : lista) {
			if(empresa.getId() == id) {
				return empresa;
			}
		}
		
		return null;
	}

	public void alteraEmpresa(int id, String nome, String cnpj) {
		for (Empresa empresa : lista) {
			if(empresa.getId() == id) {
				empresa.setNomeEmpresa(nome);
				empresa.setCnpj(cnpj);
			}			
		}
		
	}

	public Usuario autentica(String login, String senha) {
		for (Usuario usuario : listaUsers) {
			if(usuario.ehIgual(login, senha)) {
				return usuario;
			}
		}
		return null;
	}

	
}
