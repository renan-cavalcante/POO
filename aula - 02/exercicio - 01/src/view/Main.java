package view;

import java.util.Scanner;

import controller.VendaController;

public class Main {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		VendaController controller = new VendaController();
		
		boolean continuar = true;
		do {
			
			try {
				
				System.out.println(
						"Digite 1 - adicionar produto, 2 - adicionar venda, 3 - listar produtos, 4 - listar vendas ou 0 - finalizar");
				int opcao = scan.nextInt();
				switch (opcao) {
				case 1: 
					controller.adicionaProduto();
					break;
				case 2: 
					controller.adicionarPedido();
					break;
				case 3: 
					System.out.println("Cod. R$  Descriçao");
					for(Integer numero : controller.getProdutos().keySet()) {
						System.out.println(controller.getProdutos().get(numero)); // preguiça
					}
					break;
				case 4: 
					controller.getPedidos().forEach(System.out::println);
					break;
				case 0: 
					continuar = false;
					break;
				default:
					throw new IllegalArgumentException("Unexpected value: " + opcao);
				}
				
			} catch (Exception e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
				scan.nextLine();
				continuar = true;
			}
		} while (continuar);
		System.out.println("Programa finalizado");
		scan.close();
	}
}
