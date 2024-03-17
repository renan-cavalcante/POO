package model;

public class ContaBancaria {
	
	private int numeroConta;
	private String nome;
	private double saldo;

	public ContaBancaria() {
	}
	
	public void realizaDeposito(Double valor) throws Exception{
		if(valor <= 0) throw new Exception("O valor do deposito deve ser possitivo");
		
		saldo += valor;
	}

	public void realizaSaque(Double valor) throws Exception{
		if(valor <= 0) throw new Exception("O valor do saque deve ser possitivo");
		
		saldo -= valor;
	}
	
	public String getNumeroConta() {
		return String.format("%04d", numeroConta); 
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
