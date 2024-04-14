package model;

public class Motor {
     private int qtdPist;
     private int potencia;
     
     public Motor() {
		// TODO Auto-generated constructor stub
	}

	public int getQtdPist() {
		return qtdPist;
	}

	public final void setQtdPist(int qtdPist) {
		this.qtdPist = qtdPist;
	}

	public int getPotencia() {
		return potencia;
	}

	public final void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Motor [qtdPist=");
		builder.append(qtdPist);
		builder.append(", potencia=");
		builder.append(potencia);
		builder.append("CV]");
		return builder.toString();
	}
	
	
     
     
}
