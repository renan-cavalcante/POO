package controller;

import java.util.HashMap;
import java.util.Map;

import model.ContaBancaria;
import model.ContaEspecial;
import model.ContaPoupanca;

public class ContaSalva {
	private static Map<Integer,ContaBancaria> contas = new HashMap<>();
	
	
	private static void geraContas() {
		ContaPoupanca conta = new ContaPoupanca();
		conta.setCliente("Cliente poupança 1");
		conta.setDiaRendimento(3);
		conta.setSaldo(102f);
		contas.put(conta.getNumConta(), conta);
		
		conta = new ContaPoupanca();
		conta.setCliente("Cliente poupança 2");
		conta.setDiaRendimento(15);
		conta.setSaldo(552f);
		contas.put(conta.getNumConta(), conta);
		
		ContaEspecial conta2 = new ContaEspecial();
		conta2.setCliente("Cliente Especial 1");
		conta2.setLimite(200);
		conta2.setSaldo(1000f);
		contas.put(conta2.getNumConta(), conta2);
		
		conta2 = new ContaEspecial();
		conta2.setCliente("Cliente Especial 2");
		conta2.setLimite(500);
		conta2.setSaldo(552f);
		contas.put(conta2.getNumConta(), conta2);
	}
	
	public static Map<Integer,ContaBancaria> getContas(){
		if(contas.isEmpty()) {
			geraContas();
		}
		return contas;
	}
	
	public static ContaBancaria getConta(int id) {
		return contas.get(id);
	}	

}
