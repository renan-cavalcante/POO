package view;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.Circulo;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean continuar = true;
		do {
			try {
				System.out.println("Digite o raio do circulo");
				Circulo c = new Circulo(scan.nextDouble());
				System.out.print("Area do circulo: ");
				System.out.println(c.getArea());
				System.out.print("Perimetro do circulo: ");
				System.out.println(c.getPerimetro());
				System.out.println("Deseja digitar novo valor de area? (S/N)");
				String s = scan.next();
				continuar = s.toLowerCase().equals("s") ? true : false; System.out.println(s);
			} catch (IllegalArgumentException e) {
				System.out.println("O raio não pode ser negativo");
				continuar = true;
			} catch (InputMismatchException e) {
				System.out.println("O valor do raio deve ser um numero");
				scan.nextLine();
			}
		} while (continuar);
		System.out.println("Programa finalizado");
		scan.close();
	}

}
