package model;

import javax.naming.directory.InvalidAttributeValueException;

public class ContaBancaria {
	private String cliente;
	private int numConta;
	private float saldo;
	
	private static int contNumConta = 0;
	public ContaBancaria() {
		numConta = contNumConta;
		contNumConta++;
		saldo = 0;
	}

	public final String getCliente() {
		return cliente;
	}

	public final void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public final int getNumConta() {
		return numConta;
	}


	public final float getSaldo() {
		return saldo;
	}
	
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public void sacar(float valor) throws InvalidAttributeValueException {
		if( valor > saldo) {
			throw new InvalidAttributeValueException("O valor de saque não pode ser inferior ao saldo");
		}
		saldo -= valor;
	}
	
	public void depositar(float valor) {
		saldo += valor;
	}

}
