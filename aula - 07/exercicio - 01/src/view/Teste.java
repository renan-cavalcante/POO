package view;

import controller.AtividadeController;
import controller.ProvaController;
import model.Atividade;
import model.Prova;

public class Teste {
	public static void main(String[] args) {
		ProvaController provaCon = new ProvaController();
		AtividadeController atividadeCont = new AtividadeController();
		
		provaCon.cadastraAvaliacao(new Prova(10));
		provaCon.cadastraAvaliacao(new Prova(20));
		provaCon.cadastraAvaliacao(new Prova(12));
		provaCon.cadastraAvaliacao(new Prova(7));
		provaCon.cadastraAvaliacao(new Prova(6));
		provaCon.cadastraAvaliacao(new Prova(3));
		
		atividadeCont.cadastraAvaliacao(new Atividade("POO", 3));
		atividadeCont.cadastraAvaliacao(new Atividade("ENGIII", 10));
		atividadeCont.cadastraAvaliacao(new Atividade("BD", 6));
		atividadeCont.cadastraAvaliacao(new Atividade("SO2", 50));
		atividadeCont.cadastraAvaliacao(new Atividade("ING", 15));		
		
		System.out.println("==============Atividades=====================");
		atividadeCont.listaAvaliacoes();
		System.out.println("4° Atividade:"+atividadeCont.consultaPorRealizacao(3));
		atividadeCont.limpaAvaliacoes();
		
		System.out.println();
		
		System.out.println("==============Provas=====================");
		provaCon.listaAvaliacoes();
		System.out.println("4° Atividade:"+provaCon.consultaPorRealizacao(3));
		provaCon.limpaAvaliacoes();
		
	}

}
