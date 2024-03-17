package view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import model.ContaBancaria;

public class Main {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Map<String, ContaBancaria> contas = new HashMap<>();

		boolean continuar = true;
		do {
			try {
				System.out.println("============ CONTAS ============");
				System.out.println("Nº        Titular                        Saldo");
				for (String numeroConta : contas.keySet()) {
					ContaBancaria conta = contas.get(numeroConta);
					System.out.printf("%s      %-30s %.2f %n", conta.getNumeroConta(), conta.getNome(),
							conta.getSaldo());
				}
				System.out.println();

				System.out.println("Digite 1 para criar uma nova conta ou o numero de uma conta para seleciona-la");
				Integer op = scan.nextInt();

				ContaBancaria conta;

				if (op == 1) {
					conta = criarConta();
					contas.put(conta.getNumeroConta(), conta);
				}else if (contas.containsKey(op.toString())) {
					conta = contas.get(op.toString());
				} else {
					throw new Exception("Nenhum conta encontrada com esse numero");
				}

				opereracoes(conta);

				System.out.println("Deseja criar uma nova conta ou selecionar outra? (S/N)");
				continuar = scan.next().toLowerCase().equals("s") ? true : false;

			} catch (Exception e) {
				System.err.println(e.getMessage());
				scan.nextLine();
				continuar = true;
			}
		} while (continuar);
		System.out.println("Programa finalizado");

	}

	private static void opereracoes(ContaBancaria conta) {
		boolean continuar = true;
		do {
			try {
				System.out.println("Digite 1 - saque, 2 - deposito, 3 - saldo 0 - finalizar");
				int opcao = scan.nextInt();

				switch (opcao) {
				case 1:
					System.out.println("Digite o valor para saque: ");
					conta.realizaSaque(scan.nextDouble());
					break;
				case 2:
					System.out.println("Digite o valor do deposito: ");
					conta.realizaDeposito(scan.nextDouble());
					break;
				case 3:
					System.out.printf("Conta %s saldo: %.2f %n",conta.getNumeroConta(), conta.getSaldo());
					break;
				case 0: 
					continuar = false;
					break;
				default:
					throw new IllegalArgumentException("Valor inesperado: " + opcao);
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
				scan.nextLine();
			}
		} while (continuar);
	}

	private static ContaBancaria criarConta() {
		ContaBancaria conta = new ContaBancaria();
		conta.setNumeroConta((int) (Math.random() * 10000));
		String numeroConta = conta.getNumeroConta();
		System.out.println("Conta criada, numero: " + numeroConta);
		boolean continuar = false;

		do {
			try {
				System.out.println("Digite o nome do titular da conta  " + numeroConta);
				scan.nextLine();
				conta.setNome(scan.nextLine());
				continuar = false;
			} catch (Exception e) {
				System.out.println("Valor invalido para nome");
				continuar = true;
				scan.nextLine();
			}
		} while (continuar);

		do {
			try {
				System.out.println("Digite o saldo inicial da conta " + numeroConta);
				conta.setSaldo(scan.nextDouble());
				continuar = false;
			} catch (Exception e) {
				System.out.println("Valor invalido para saldo");
				continuar = true;
				scan.nextLine();
			}
		} while (continuar);
		scan.nextLine();
		return conta;
	}

}
