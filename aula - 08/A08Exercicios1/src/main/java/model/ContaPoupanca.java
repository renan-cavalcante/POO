package model;

public final class ContaPoupanca extends ContaBancaria{

	private int diaRendimento;
	
	public ContaPoupanca() {
		super();
	}

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		if(diaRendimento > 31 || diaRendimento < 1) {
			throw new IllegalArgumentException();
		}
		
		this.diaRendimento = diaRendimento;
	}
	
	public void CalcularNovoSaldo(float taxa) {
		depositar(getSaldo() * (taxa/100));  
	}
	
	
}
