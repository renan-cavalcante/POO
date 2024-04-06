package model;

public class Animal {

	private String nome;
	private int comprimento;
	private int patas;
	private String cor;
	private String ambiente;
	private float velocidade;

	public Animal() {
		patas = 4;
	}

	public String getNome() {
		return nome;
	}

	public void alteraNome(String nome) {
		this.nome = nome;
	}

	public int getComprimento() {
		return comprimento;
	}

	public void alteraComprimento(int comprimento) {
		this.comprimento = comprimento;
	}

	public int getPatas() {
		return patas;
	}

	public void alteraPatas(int patas) {
		this.patas = patas;
	}

	public String getCor() {
		return cor;
	}

	public void alteraCor(String cor) {
		this.cor = cor;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void alteraAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public float getVelocidade() {
		return velocidade;
	}

	public void alteraVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}

	public String dados() {
		return "Animal: " + nome + "\nComprimento: " + comprimento + "cm\nPatas: " + patas + "\nCor: " + cor
				+ "\nAmbiente: " + ambiente + "\nVelocidade: " + velocidade+"m/s";
	}

}
