package model;

public class Mamifero extends Animal{

	private String alimento;
	
	public Mamifero() {
		alteraAmbiente("Terra");
	}

	public String alimento() {
		return alimento;
	}

	public void alteraAlimento(String alimento) {
		this.alimento = alimento;
	}

	@Override
	public String dados() {
		// TODO Auto-generated method stub
		return super.dados()+"\nAlimento: "+alimento;
	}
	
}
