package model;

public class ContaBancaria {

	private static int seqConta = 0;
	private String cliente;
	private int numConta;
	protected float saldo;	
	
	public ContaBancaria() {
		saldo = 0.0f;
		numConta = seqConta;
		seqConta++;
	}
	
	public void sacar(float valor) {
		if(valor > saldo) {
			System.out.println(cliente +" Você não pode sacar R$"+valor+", o seu saldo é de R$"+saldo);
			return;
		}
		saldo -= valor;
		System.out.println(cliente +" Você sacou R$"+valor+" O seu saldo atual é de R$"+saldo);
		
	}
	
	public void depositar(float valor) {
		saldo += valor;
		System.out.println(cliente +" Deposito de R$" +valor);
	}

	public String getCliente() {
		return cliente;
	}
	
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public int getNumConta() {
		return numConta;
	}

	public float getSaldo() {
		return saldo;
	}


	@Override
	public String toString() {
		
		return "Conta:" +numConta +
				"\nSaldo: R$"+saldo+
				"\nCliente :"+cliente;
	}
	

}
