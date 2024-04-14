package controller;

public class OperacaoController {

	public int operacaoValor(int valor) throws ArithmeticException {

		if(valor < 0) throw new ArithmeticException("O parâmetro não pode ser negativo");
		
		if (valor % 2 == 0) {
			return valor * valor;
		}

		return valor * valor * valor;

	}
}
