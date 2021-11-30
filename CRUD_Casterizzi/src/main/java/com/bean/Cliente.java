package com.cadastrocliente.bean;
public class Cliente {
	private int id;
	private String nome,senha,email,telefone_principal;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}
	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the telefone_principal
	 */
	public String getTelefone_principal() {
		return telefone_principal;
	}
	/**
	 * @param telefone_principal the telefone_principal to set
	 */
	public void setTelefone_principal(String telefone_principal) {
		this.telefone_principal = telefone_principal;
	}
	}
