package view;

import model.ProfessorHorista;
import model.ProfessorTitular;

public class Escola {

	public static void main(String[] args) {
		ProfessorHorista ph = new ProfessorHorista();
		ProfessorTitular pt = new ProfessorTitular();

		ph.setHorasAula(10);
		ph.setNome("Professor horista");
		ph.setIdade(50);
		ph.setMatricula("015248");
		ph.setValorhorasAula(10);

		pt.setNome("Professor");
		pt.setMatricula("a0578");
		pt.setIdade(70);
		pt.setSalario(10000);
		pt.setAnosIntituicao(10);

		System.out.println(ph.toString());
		ph.calcSal();

		System.out.println();
		System.out.println(pt.toString());
		pt.calcSal();
	}

}
