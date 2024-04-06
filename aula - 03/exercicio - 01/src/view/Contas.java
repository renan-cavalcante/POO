package view;

import model.ContaEspecial;
import model.ContaPopanca;

public class Contas {

	public static void main(String[] args) {
		ContaPopanca cp = new ContaPopanca();
		ContaEspecial ce = new ContaEspecial();
		
		cp.setCliente("cliente poupa");
		cp.setDiaRendimento(3);
		cp.depositar(1500);
		
		ce.setCliente("cliente especial");
		ce.setLimite(200);
		ce.depositar(500);
		
		System.out.println("\n---- sacando ---");
		cp.sacar(1000);
		ce.sacar(400);
		
		System.out.println("\n---Saque superior ao saldo----");  
		cp.sacar(600);
		ce.sacar(200);
		
		System.out.println("\n--- saque acima do limite ---");
		ce.sacar(200);
		
		
		System.out.println("\n --- depositar ----");
		cp.depositar(500);
		ce.depositar(500);
		
		System.out.println("\n--- taxa redimento ----");
		cp.calcularNovoSaldo(100f);
		
		System.out.println("\n---- dados ----");
		System.out.println(ce.toString());
		System.out.println();
		System.out.println(cp.toString());
		

	}

}
