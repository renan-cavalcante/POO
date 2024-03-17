package model;

public class Produto {
	private String nome;
	private float preco;
	private int qtdEstoque;
	
	public Produto() {
		super();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) throws  Exception{
		if(preco < 0) throw new Exception("O preço não pode ser negativo");
		
		this.preco = preco;
	}
	public int getQtdEstoque() {
		return qtdEstoque;
	}
	public void setQtdEstoque(int qtdEstoque) throws  Exception{
		if(qtdEstoque < 0) throw new Exception("A quantidade não pode ser negativo");
		
		this.qtdEstoque = qtdEstoque;
	}
	
	public boolean verificaProdutoDisponivel() {
		return qtdEstoque > 0;
	}
	
	public float totalValorEstoque() {
		return preco * qtdEstoque;
	}
	
	
}
