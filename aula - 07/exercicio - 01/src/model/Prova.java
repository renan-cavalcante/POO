package model;

public class Prova {
	
	private int qtdquestoes;
	private float media;
	
	public Prova(int qtdQuestoes) {
		this.qtdquestoes = qtdQuestoes;
		setMedia((float)(Math.random()*10));

	}

	public final int getQtdquestoes() {
		return qtdquestoes;
	}

	public final void setQtdquestoes(int qtdquestoes) {
		this.qtdquestoes = qtdquestoes;
	}

	public final float getMedia() {
		return media;
	}

	public final void setMedia(float media) {
		this.media = media;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Prova [qtdquestoes=");
		builder.append(qtdquestoes);
		builder.append(", media=");
		builder.append(String.format("%.2f", media));
		builder.append("]");
		return builder.toString();
	}
	
	

}
