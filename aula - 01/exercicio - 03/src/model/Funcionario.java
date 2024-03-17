package model;

public class Funcionario {

	private String nome;
	private double salario;
	private String cargo;
	
	public Funcionario() {
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) throws Exception {
		if(salario < 1412.00f) throw new Exception("O salario deve ser maior ou igual a 1412");
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public double getSalarioLiquido(double desconto, double beneficios) {
		return (salario +beneficios ) -   desconto;
	}

	
	
}
