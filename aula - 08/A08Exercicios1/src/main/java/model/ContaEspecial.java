package model;

import javax.naming.directory.InvalidAttributeValueException;

public class ContaEspecial extends ContaBancaria {

	private float limite;
	
	public ContaEspecial() {
		super();
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	@Override
	public void sacar(float valor)throws InvalidAttributeValueException {
		if( valor > getSaldo() + limite) {
			throw new InvalidAttributeValueException("O valor de saque não pode ser inferior ao saldo + limite");
		}
		setSaldo(getSaldo() - valor);

	}
}
