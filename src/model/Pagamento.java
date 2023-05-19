package model;

public class Pagamento {
	private float valor;
	private String metodoPagamento;
	private String status;
	
	public String visualizarDetalhesPagamento() {
		return 	  "______________________________________"
				+ "Valor: " + this.getValor() + System.lineSeparator()
				+ "Método de pagamento: " + this.getMetodoPagamento() + System.lineSeparator() 
				+ "Status: " + this.getStatus() + System.lineSeparator()
				+ "______________________________________";
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getMetodoPagamento() {
		return metodoPagamento;
	}

	public void setMetodoPagamento(String metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
