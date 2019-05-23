package br.com.globalweb.domain;

public class Usuario {

	private int id;
	private String nome;
	

	public Usuario() {
		super();
	}

	public Usuario(int i, String countryName, long population) {
		super();
		this.id = i;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setId(int id) {
		this.id = id;
	}


	public int getId() {
		return id;
	}



}