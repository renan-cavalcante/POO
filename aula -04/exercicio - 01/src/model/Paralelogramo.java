package model;

public  class Paralelogramo extends Quadrilatero {
	
	
	public Paralelogramo() {
	}

	@Override
	public float calcArea() {
		return getBase() * getAltura();
	}

}
