package model;

public abstract class Professor {
	
    private String nome;
	private String matricula;
	private int idade;
	
	public Professor() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public abstract void calcSal();

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [nome=" + nome + ", matricula=" + matricula + ", idade=" + idade + "]";
	}

	
	
}
