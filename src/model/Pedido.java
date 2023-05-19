package model;

public class Pedido {
	private String identificador;
	private String enderecoLocal;
	private String enderecoOrigem;
	private String condicoes;
	private String referencia;
	private String status;
	private String rota;
	
	
	public String pedidoFormatado() {
		return 	  "______________________________________"
				+ "IDENTIFICADOR DO PEDIDO: " + this.getIdentificador() + System.lineSeparator()
				+ "Endereço de saída: " + this.getEnderecoOrigem() + System.lineSeparator()
				+ "Endereço de entrega: " + this.getEnderecoLocal() + System.lineSeparator() 
				+ "Condições do cliente: " + this.getCondicoes() + System.lineSeparator() 
				+ "Referência do local: " + this.getReferencia() + System.lineSeparator() 
				+ "Status: " + this.getStatus() + System.lineSeparator()
				+ "______________________________________";
		
	}
	public void calcularMelhorRota() {
		// método a ser implementado utilizando alguma API de gps;
	}
	public void atualizarRotaAtual(String rota) {
		this.rota = rota;
	}
	
	public String getEnderecoLocal() {
		return enderecoLocal;
	}
	public void setEnderecoLocal(String enderecoLocal) {
		this.enderecoLocal = enderecoLocal;
	}
	public String getEnderecoOrigem() {
		return enderecoOrigem;
	}
	public void setEnderecoOrigem(String enderecoOrigem) {
		this.enderecoOrigem = enderecoOrigem;
	}
	public String getCondicoes() {
		return condicoes;
	}
	public void setCondicoes(String condicoes) {
		this.condicoes = condicoes;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
	
}
