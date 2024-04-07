package model;

public class IngressoVip extends Ingresso{
	
	private String funcao;
	
	public IngressoVip() {
		super();
	}
	
	

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	@Override
	public float valorFinal(float taxa) {
		return super.valorFinal(taxa)*1.18f;
	}
	
	@Override
	public String toString() {
		return super.toString() + "[funcao=" + funcao + "]";
	}

	
	
}
