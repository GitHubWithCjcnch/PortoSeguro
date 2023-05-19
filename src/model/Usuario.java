package model;

public class Usuario {
	private String username;
	private String senha;
	private boolean isLogado = false;
	
	public void login() {
		
	}
	public void register() {
		
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public boolean isLogado() {
		return isLogado;
	}
	public void setLogado(boolean isLogado) {
		this.isLogado = isLogado;
	}
}
