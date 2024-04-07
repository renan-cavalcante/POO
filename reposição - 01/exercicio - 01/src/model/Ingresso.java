package model;

	

public class Ingresso {

	private String codigo;
	private float valor;
	
	public Ingresso() {

	}
	
	public float valorFinal(float taxa) {
		return valor * taxa;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return  this.getClass().getSimpleName() + " [codigo=" + codigo + ", valor=" + valor + "]";
	}
	
	
	
}
