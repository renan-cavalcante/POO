package controller;

import model.Estudante;

public class EstudandeTecnicoController implements IEstudanteController {

	public EstudandeTecnicoController() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public float percentualRendimento(Estudante estudante) {
		return estudante.getMediaNotas() * estudante.getQtdAprovacoes() * 0.931f;
		
	}

	@Override
	public float percentualProgresso(Estudante estudante) {
		return (float) estudante.getQtdAprovacoes()/3;
		
	}

}
