package view;

import java.util.Scanner;

import Controller.ContrataFactory;
import Controller.ContrataTempoIntegral;
import Controller.ContrataTempoParcial;
import Controller.ContrataTemporario;

public class Teste {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		ContrataFactory contrata = inicializa();
		
		System.out.println(contrata.contratacao().toString());
		
	}
	
	public static void finalizaSistemaErro() {
		System.out.println("Sistema finalizado por excesso de tentativas");
		System.exit(0);
	}
	
	private static ContrataFactory inicializa() {
		

		System.out.println("Cadastro de novo funcionario");
		System.out.println("1 - Funcionrio Integral");
		System.out.println("2 - Funcionrio Parcial");
		System.out.println("3 - Funcionrio Temporario");

		int opcao = sc.nextInt();
		switch (opcao) {
		case 1:
			return  new ContrataTempoIntegral();
		case 2:
			return new ContrataTempoParcial();
		case 3:
			return new ContrataTemporario();

		default:
			System.err.println("Opção invalida");
			return inicializa();
		}
		
	}

}
