package model;

public class ProfessorTitular extends Professor {

	private int anosIntituicao;
	private double salario;

	public ProfessorTitular() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calcSal() {
		double salarioBase = salario * (1 + (0.05*(anosIntituicao/5)));
		System.out.println("Salario base R$"+salarioBase);

	}

	public int getAnosIntituicao() {
		return anosIntituicao;
	}

	public void setAnosIntituicao(int anosIntituicao) {
		this.anosIntituicao = anosIntituicao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return super.toString()+"[anosIntituicao=" + anosIntituicao + ", salario=" + salario + "]";
	}

	
	
}
