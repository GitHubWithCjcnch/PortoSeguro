package model;

public class Guincho {
	private String setor;
	private String unidade;
	private String tipo;
	private double peso;
	private boolean disponibilidade;
	
	public String pesoGuincho(double peso, int qtdEixos, double pesoEixo, boolean chassiAlongado, float capacidadeCarga) {
		// O peso ideal de um guincho é 1.5x a 2x o peso do veículo
		double result = peso * 2;
		// considerando que cada eixo 
		result += qtdEixos * pesoEixo;
		if (chassiAlongado) {
			// considerando que o peso médio entre os chassis é 1.5 tonelada;
			result += 1.5;
		}
		return "A tensão ideal do guincho deve ser é " + result;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public boolean isDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
}
