package br.com.projeto;

import br.com.classes.*;

public class app {

	public static void main(String[] args) {
		
		Diarista diarista = new Diarista();
		
		diarista.setNome("João da Silva");
		diarista.setTelefone("11987577859");
		diarista.setEndereco("Av Cajamar, N 111");
		diarista.setChavePix("123");
		diarista.setSaldo(100.0);
		
		System.out.println("Nome Diarista: " + diarista.getNome());
		System.out.println("Telefone Diarista: " + diarista.getTelefone());
		System.out.println("Endereço Diarista: " + diarista.getEndereco());
		diarista.atender(" Daniel");
		
		 //valor na conta da Diarista
		System.out.println("Saldo Diarista: " + diarista.getSaldo());
		diarista.depositar(30);
		System.out.println("Novo Saldo: " + diarista.getSaldo());
		diarista.sacar(10);
		
		System.out.println("=======================================");
		
		Cliente cliente = new Cliente();
		
		cliente.setNome("Daniel");
		cliente.setTelefone("(11) 91246-4563");
		cliente.setEndereco("Rua das Americas");
		cliente.setSaldo(100.0);
		
		
		System.out.println("Nome Cliente: " + cliente.getNome());
		System.out.println("Telefone Cliente: " + cliente.getTelefone());
		System.out.println("Endereço Cliente: " + cliente.getEndereco());
		//valor na conta cliente
		System.out.println("Saldo Cliente: " + cliente.getSaldo());
		cliente.depositar(30);
		System.out.println("Novo Saldo: " + cliente.getSaldo());
		
		System.out.println("=======================================");
		
		atendimento atendimento = new atendimento(); 
		
		atendimento.setHoras(11);
		System.out.println(atendimento.getHoras());

		

	}

}
