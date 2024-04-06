package model;

public class ContaEspecial extends ContaBancaria {

	private float limite;

	public ContaEspecial() {
		super();
	}

	@Override
	public void sacar(float valor) {
		if (valor > saldo + limite) {
			System.out.println(getCliente()+" Você não pode sacar R$"+valor+", o seu saldo mais limte é de R$" + (saldo+limite));
			return;
		}
		saldo -= valor;
		System.out.println(getCliente()+" Você sacou R$" + valor + " O seu saldo atual é de R$" + saldo);
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+
				"\nLimite R$"+limite;
	}
}
