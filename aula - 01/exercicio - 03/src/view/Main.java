package view;

import java.util.Scanner;

import model.Funcionario;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean continuar = true;
		do {
			try {
				Funcionario funcionario = new Funcionario();
				System.out.println("Digite o nome do funcionario");
				funcionario.setNome(scan.nextLine());
				
				boolean continuaSalario = true;
				do {
					
					try {
						System.out.println("Digite o salario de "+funcionario.getNome());
						funcionario.setSalario(scan.nextDouble());
						continuaSalario = false;
					} catch (Exception e) {
						System.out.println(e.getMessage());
						continuaSalario = true;
						scan.nextLine();
					}
				} while (continuaSalario);
				
				boolean continuaCargo = true;
				do {
					
					try {
						System.out.println("Digite o cargo de "+funcionario.getNome());
						funcionario.setCargo(scan.next());
						continuaCargo = false;
					} catch (Exception e) {
						System.out.println(e.getMessage());
						continuaCargo = true;
						scan.nextLine();
						
					}
				} while (continuaCargo);
				
				double desconto = 0;
				continuaCargo = true;
				do {
					
					try {
						System.out.println("Digite o desconto de "+funcionario.getNome());
						desconto = scan.nextDouble();
						continuaCargo = false;
					} catch (Exception e) {
						System.out.println(e.getMessage());
						continuaCargo = true;
					}
				} while (continuaCargo);
				
				continuaCargo = true;
				double beneficios = 0;
				do {
					
					try {
						System.out.println("Digite o valor dos beneficios de "+funcionario.getNome());
						beneficios = scan.nextDouble();
						continuaCargo = false;
					} catch (Exception e) {
						System.out.println(e.getMessage());
						continuaCargo = true;
					}
				} while (continuaCargo);
				
				System.out.println("O salario liquido de "+funcionario.getNome()+" é R$"+funcionario.getSalarioLiquido(desconto, beneficios));

			

				System.out.println("Deseja cadastrar outro funcionario? (S/N)");
				continuar = scan.next().toLowerCase().equals("s") ? true : false;

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
