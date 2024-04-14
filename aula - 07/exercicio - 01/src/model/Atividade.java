package model;

public class Atividade {
	private String assunto;
	private int numeroPagina;
	
	public Atividade() {
	}
	
	public Atividade(String assunto, int numeroPagina) {
		super();
		this.assunto = assunto;
		this.numeroPagina = numeroPagina;
	}

	public final String getAssunto() {
		return assunto;
	}

	public final void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public final int getNumeroPagina() {
		return numeroPagina;
	}

	public final void setNumeroPagina(int numeroPagina) {
		this.numeroPagina = numeroPagina;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Atividade [assunto=");
		builder.append(assunto);
		builder.append(", numeroPagina=");
		builder.append(numeroPagina);
		builder.append("]");
		return builder.toString();
	}
	
	

}
