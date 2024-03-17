package model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

	private int numeroNota;
	private double valorTotal;
	private List<ItemPedido> produtos;

	public Pedido() {
		produtos = new ArrayList<>();
		valorTotal = 0;
	}

	public int getNumeroNota() {
		return numeroNota;
	}

	public void setNumeroNota(int numeroNota) {
		this.numeroNota = numeroNota;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void adicionaItem(ItemPedido item) {
		produtos.add(item);
		valorTotal += item.getQuantidade() * item.getProduto().getValor();
	}

	@Override
	public String toString() {
		String p = String.format("%d  %.2f ", numeroNota, valorTotal);
		return p ;
	}
}
