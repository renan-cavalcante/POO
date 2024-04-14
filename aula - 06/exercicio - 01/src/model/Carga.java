package model;

public final class Carga extends Veiculo {
	
	private int cargaMax;
	private int tara;

	@Override
	public float calcVel() {
		
		return getVelocMax()*100000;
	}

	public int getCargaMax() {
		return cargaMax;
	}

	public int getTara() {
		return tara;
	}

	public final void setCargaMax(int cargaMax) {
		this.cargaMax = cargaMax;
	}

	public final void setTara(int tara) {
		this.tara = tara;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("[cargaMax=");
		builder.append(cargaMax);
		builder.append("Kg, tara=");
		builder.append(tara);
		builder.append("Kg]");
		return builder.toString();
	}
	

}
