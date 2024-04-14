package model;

public final class Passeio extends Veiculo {
	
	private int qtdPassageiros;
	
	public Passeio() {
		super();
		setQtdPassageiros(5);
		setQtdRodas(4);
	}
	

	@Override
	public float calcVel() {
		return getVelocMax()*1000;
	}


	public int getQtdPassageiros() {
		return qtdPassageiros;
	}


	public final void setQtdPassageiros(int qtdPassageiros) {
		this.qtdPassageiros = qtdPassageiros;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("[qtdPassageiros=");
		builder.append(qtdPassageiros);
		builder.append("]");
		return builder.toString();
	}
	
	

}
