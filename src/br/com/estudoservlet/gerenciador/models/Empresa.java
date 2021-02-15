package br.com.estudoservlet.gerenciador.models;

import java.util.Date;

public class Empresa {
	
	static private int Id;
	private int empresaid;
	private String nomeEmpresa;
	private String cnpj; 
	private Date dataCriacao = new Date();
	
	public Empresa(){
		Empresa.Id += 1;
		this.empresaid = Id;
	}
	
	
	
	public int getId() {
		return empresaid;
	}
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public Date getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(Date dataCriacao) {
	this.dataCriacao = dataCriacao;
	}
}
