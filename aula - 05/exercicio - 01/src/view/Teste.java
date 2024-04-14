package view;

public class Teste {
	public static void main(String[] args) {
		System.out.println("Inicio do main");
		try {
			metodo1();
		} catch (ArithmeticException e) {
			System.err.println("Não pode dividir por zero");
		} finally {
			System.out.println("Fim do main");
		}

	}

	public static void metodo1() throws ArithmeticException {
		System.out.println("Inicio do método 1");
		try {
			metodo2();
		}
		finally {
			System.out.println("Fim do método 1");
		}

	}

	public static void metodo2() throws ArithmeticException {
		System.out.println("Inicio do método 2");

		try {
			int[] vetor = new int[10];
			for (int i = 0; i <= 15; i++) {
				vetor[i] = i;
				System.out.println(i);
				if (i == 9) {
					int vlr = vetor[i] / vetor[0];
					System.out.println(vlr);
				}
			}
		} finally {
			System.out.println("Fim do método 2");
		}

	}
}
