package view;

import java.util.Scanner;

import model.Produto;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean continuar = true;
		do {
			try {
				Produto produto = new Produto();
				System.out.println("Digite o nome do produto");
				produto.setNome(scan.nextLine());

				boolean continuaVerif = true;
				do {

					try {
						System.out.println("Digite o preço de " + produto.getNome());
						produto.setPreco(scan.nextFloat());
						continuaVerif = false;
					} catch (Exception e) {
						System.out.println(e.getMessage());
						continuaVerif = true;
						scan.nextLine();
					}
				} while (continuaVerif);

				continuaVerif = true;
				do {

					try {
						System.out.println("A quantidade em estoque de " + produto.getNome());

						produto.setQtdEstoque(scan.nextInt());
						continuaVerif = false;
					} catch (Exception e) {
						System.out.println(e.getMessage());
						continuaVerif = true;
						scan.nextLine();

					}
				} while (continuaVerif);

				System.out.println(produto.getNome() + " - R$" + produto.getPreco() + " tem " + produto.getQtdEstoque()
						+ "Un em estoque, estando "
						+ (produto.verificaProdutoDisponivel() ? "Disponivel" : "Indisponivel")
						+ " em estoque com valor total de estoque de R$"+produto.totalValorEstoque());

				System.out.println("Deseja cadastrar outro produto? (S/N)");
				continuar = scan.next().toLowerCase().equals("s") ? true : false;
				scan.nextLine();

			} catch (Exception e) {
				System.err.println(e.getMessage());
				scan.nextLine();
				continuar = true;
			}
		} while (continuar);
		System.out.println("Programa finalizado");
		scan.close();
	}
}
