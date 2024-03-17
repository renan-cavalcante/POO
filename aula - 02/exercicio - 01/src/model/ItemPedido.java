package model;

public class ItemPedido {

	private Produto produto;
	private int quantidade;
	
	public ItemPedido() {
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		String p = String.format("Qntd: %d  valor Un R$%.2f Descrição %s", produto.getValor(),  produto.getDescricao());
		return p;
	}
	
}
