package controller;

import model.Estudante;

public class EstudanteSuperiorController implements IEstudanteController{

	public EstudanteSuperiorController() {
	}

	@Override
	public float percentualRendimento(Estudante estudante) {
		return estudante.getMediaNotas() *  estudante.getQtdAprovacoes() * 0.972f;
		
	}

	@Override
	public float percentualProgresso(Estudante estudante) {
		return (float)(estudante.getQtdAprovacoes()/6f);
		
	}

}
