package model;

public class ProfessorHorista extends Professor {

	private int horasAula;
	private double valorhorasAula ;
	
	public ProfessorHorista() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public void calcSal() {
		System.out.println("Salario base R$"+horasAula * valorhorasAula);
		
	}


	public int getHorasAula() {
		return horasAula;
	}


	public void setHorasAula(int horasAula) {
		this.horasAula = horasAula;
	}


	public double getValorhorasAula() {
		return valorhorasAula;
	}


	public void setValorhorasAula(double valorhorasAula) {
		this.valorhorasAula = valorhorasAula;
	}


	@Override
	public String toString() {
		return super.toString()+"[horasAula=" + horasAula + ", valorhorasAula=" + valorhorasAula + "]";
	}
	
	
}
