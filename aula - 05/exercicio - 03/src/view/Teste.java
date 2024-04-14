package view;

import java.util.InputMismatchException;
import java.util.Scanner;

import controller.OperacaoController;

public class Teste {

	private static OperacaoController control = new OperacaoController();// statico apenas para a recursiva do catch

	public static void main(String[] args) {

		calculo();
	}

	private static void calculo() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero natural");
		try {
			System.out.println(control.operacaoValor(sc.nextInt()));
		} catch (ArithmeticException  e) {
			System.err.println(e.getMessage());
			calculo();
		}
		catch (InputMismatchException e) {
			System.err.println("Parâmetro invalido");
			calculo();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
