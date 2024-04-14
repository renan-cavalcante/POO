package model;

public abstract class Funcionario {

	private int id;
	private String nome;
	private double salario;

	public Funcionario() {
	}

	public String getNome() {
		return nome;
	}

	public final void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public final void setSalario(double salario) throws Exception {
		if (salario < 1412.00f)
			throw new Exception("O salario deve ser maior ou igual a 1412");
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public final void setId(int id) {
		this.id = id;
	}

	public double getSalarioLiquido(double desconto, double beneficios) {
		return (salario + beneficios) - desconto;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("id: ");
		builder.append(id);
		builder.append("\nnome: ");
		builder.append(nome);
		builder.append("\nsalario: ");
		builder.append(salario);

		return builder.toString();
	}
	
	

}
