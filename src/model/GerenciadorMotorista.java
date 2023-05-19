package model;

import java.util.ArrayList;

public class GerenciadorMotorista {
	private ArrayList<Motorista> motoristas = new ArrayList<Motorista>();
	
	public void adicionarMotorista(Motorista motorista) {
		motoristas.add(motorista);
	}
	public void removerMotorista(Motorista motorista) {
		motoristas.remove(motorista);
	}
	public void listarMotoristasDisponiveis() {        
		System.out.println("Motoristas disponíveis: ");
        for (Motorista motoristas : motoristas) {
            if (motoristas.isDisponibilidade()) {
            	System.out.println("Nome: " + motoristas.getNome() + " Contato: " + motoristas.getTelefone());
            }
        }
	}
}
