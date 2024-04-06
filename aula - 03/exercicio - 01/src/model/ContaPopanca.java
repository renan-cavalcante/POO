package model;

public class ContaPopanca extends ContaBancaria {

	private int diaRendimento;
	
	public ContaPopanca() {
		super();
	}
	
	public void calcularNovoSaldo(Float taxa) {
		float rendimento = saldo * (taxa/100);
		saldo += rendimento;
		System.out.println("Com taxa de "+taxa+"%, seu rendimento foi de R$"+rendimento+"\nSeu novo saldo é de R$"+saldo);
		
	}

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		if(diaRendimento > 0 && diaRendimento < 32) {
			this.diaRendimento = diaRendimento;
			return;
		}
		System.out.println("dia invalido");
	}
	
	@Override
	public String toString() {
		return super.toString() +
				"\ndia do Rendimento :" +diaRendimento;
	}

}
