package view;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.Pessoa;



public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean continuar = true;
		do {
			try {
				Pessoa pessoa = new Pessoa();
				System.out.println("Digite o nome da pessoa");
				pessoa.setNome(scan.nextLine());
				
				boolean continuaSalario = true;
				do {
					
					try {
						System.out.println("Digite a profissão de "+pessoa.getNome());
						pessoa.setProfissao(scan.next());
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
						System.out.println("Digite a data de nascimento de "+pessoa.getNome()+" no formatdo dia/mes/ano");
						String data = scan.next();
						if(data.matches("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(19|20)\\\\d{2}$")) throw new Exception("Data invalida");
						pessoa.setDataNascimento(Integer.parseInt(data.split("/")[0]),Integer.parseInt(data.split("/")[1]),Integer.parseInt(data.split("/")[2]));
						continuaCargo = false;
					} catch (Exception e) {
						System.out.println(e.getMessage());
						continuaCargo = true;
						scan.nextLine();
						
					}
				} while (continuaCargo);
				

				
				System.out.println("A idade de "+pessoa.getNome()+", da profissao "+ pessoa.getProfissao()+" Nascida em "+pessoa.getDataNascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+" é "+pessoa.getIdade()+" Anos");

			

				System.out.println("Deseja cadastrar outra pessoa? (S/N)");
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
