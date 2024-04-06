package controller;

import model.Estudante;

public interface IEstudanteController {
	public abstract float percentualRendimento(Estudante estudante);
	public abstract float percentualProgresso(Estudante estudante);

}
