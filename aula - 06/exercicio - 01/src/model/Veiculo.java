package model;

public abstract class Veiculo {

	 private String placa ;
	 private String marca;
	 private String model;
	 private String cor;
	 private float velocMax;
	 private int qtdRodas;
	 private Motor motor ;
	 
	 public Veiculo() {
		// TODO Auto-generated constructor stub
	}

	public final void setPlaca(String placa) {
		this.placa = placa;
	}



	public final void setMarca(String marca) {
		this.marca = marca;
	}



	public final void setModel(String model) {
		this.model = model;
	}



	public final void setCor(String cor) {
		this.cor = cor;
	}



	public final void setVelocMax(float velocMax) {
		this.velocMax = velocMax;
	}



	public final void setQtdRodas(int qtdRodas) {
		this.qtdRodas = qtdRodas;
	}



	public final void setMotor(Motor motor) {
		this.motor = motor;
	}



	public String getPlaca() {
		return placa;
	}



	public String getMarca() {
		return marca;
	}



	public String getModel() {
		return model;
	}



	public String getCor() {
		return cor;
	}



	public float getVelocMax() {
		return velocMax;
	}



	public int getQtdRodas() {
		return qtdRodas;
	}



	public Motor getMotor() {
		return motor;
	}



	public abstract float calcVel();

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(getClass().getSimpleName());
		builder.append(" [placa=");
		builder.append(placa);
		builder.append(", marca=");
		builder.append(marca);
		builder.append(", model=");
		builder.append(model);
		builder.append(", cor=");
		builder.append(cor);
		builder.append(", velocMax=");
		builder.append(velocMax);
		builder.append("Km/h, qtdRodas=");
		builder.append(qtdRodas);
		builder.append(", ");
		builder.append(motor);
		builder.append("]");
		return builder.toString();
	}
	
	
}
