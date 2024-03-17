package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.ItemPedido;
import model.Pedido;
import model.Produto;
import view.Main;

public class VendaController {
	static Map<Integer,Produto> produtos = new HashMap<>();
	static List<Pedido> pedidos = new ArrayList<>();
	
	public Map<Integer,Produto> getProdutos() {
		return produtos;
	}
	
	public List<Pedido> getPedidos(){
		return pedidos;
	}

	public void adicionaProduto() {
		
		Produto produto = new Produto();

		boolean continua = true;
		do {
			try {
				System.out.println("Digite o codigo do produto");
				produto.setCodigo(Main.scan.nextInt());
				continua = false;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				continua = true;
				Main.scan.nextLine();
			}
		} while (continua);

		continua = true;
		do {
			try {
				System.out.println("Digite a descrição do produto");
				Main.scan.nextLine();
				produto.setDescricao(Main.scan.nextLine());
				continua = false;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				continua = true;
				Main.scan.nextLine();
			}
		} while (continua);

		continua = true;
		do {
			try {
				System.out.println("Digite o valor do produto");
				produto.setValor(Main.scan.nextFloat());
				continua = false;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				continua = true;
				Main.scan.nextLine();
			}
		} while (continua);
		produtos.put(produto.getCodigo(),produto);
		
	}
	
	private void adicionaItem(Pedido pedido) {
		ItemPedido item = new ItemPedido();
		
		System.out.println("Cod.   R$     Descrição");
		for(Integer codProduto : produtos.keySet()) {
			System.out.println(produtos.get(codProduto));
		}
		
		boolean continua = true;
		do {
			try {
				System.out.println("Digite o codigo do produto");;
				item.setProduto(produtos.get(Main.scan.nextInt()));
				continua = false;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				continua = true;
				Main.scan.nextLine();
			}
		} while (continua);
		
		continua = true;
		do {
			try {
				System.out.println("Digite a quantidade do produto");
				item.setQuantidade((Main.scan.nextInt()));
				continua = false;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				continua = true;
				Main.scan.nextLine();
			}
		} while (continua);
		pedido.adicionaItem(item);
	}
	
	public void adicionarPedido() {
		Pedido pedido = new Pedido();
		
		boolean continua = true;
		do {
			try {
				System.out.println("Digite o numero da nota");
				pedido.setNumeroNota(Main.scan.nextInt());
				continua = false;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				continua = true;
				Main.scan.nextLine();
			}
		} while (continua);
		
		continua = true;
		do {
			try {
				adicionaItem(pedido);
				System.out.println("Deseja adicionar outro produto? (S/N)");
				continua = Main.scan.next().toLowerCase().equals("s") ? true : false;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				continua = true;
				Main.scan.nextLine();
			}
			
		} while (continua);
		pedidos.add(pedido);
		System.out.println("Nº ValorTotal");
		System.out.println(pedido);
	
		
	}

}
