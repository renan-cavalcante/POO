package view;

import java.util.Scanner;

import model.AgendaTelefonica;
import model.Contato;

public class Main {

	public static void main(String[] args) {
		AgendaTelefonica agenda = new AgendaTelefonica();
		Scanner scan = new Scanner(System.in);

		boolean continuar = true;
		do {
			try {
				System.out.println(
						"Digite 1 - adicionar contato, 2 - buscar contato, 3- listar os contatos 0 - finalizar");
				int opcao = scan.nextInt();
				scan.nextLine();
				switch (opcao) {
				case 1:
					Contato c = new Contato();
					System.out.println("Digite o nome do contato: ");
					c.setNome(scan.nextLine());
					
					System.out.println("Digite o telefone");
					c.setNumero(scan.nextLine());
					
					System.out.println("Digite o email");
					c.setEmail(scan.nextLine());
					agenda.addContato(c);
					break;
				case 2:
					System.out.println("Digite o nome do contato");
					System.out.println(agenda.getContatos().get(scan.nextLine()));
					break;
				case 3:
					agenda.getContatos().keySet().forEach(System.out::println);
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
