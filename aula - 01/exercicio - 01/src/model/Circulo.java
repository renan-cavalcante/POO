package model;

public class Circulo {

	private double raio;

	public Circulo(double raio) throws IllegalArgumentException {
		setRaio(raio);
	}
	
	public double getArea() {
		return Math.PI * Math.pow(raio, 2);
	}
	
	public double getPerimetro() {
		return 2 * Math.PI * raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) throws IllegalArgumentException {
		if (raio <= 0)
			throw new IllegalArgumentException("O raio não pode ser 0 ou negativo");

		this.raio = raio;
	}

	
}
