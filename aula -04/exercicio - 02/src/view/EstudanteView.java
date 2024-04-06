package view;

import controller.EstudandeTecnicoController;
import controller.EstudanteSuperiorController;
import model.EstudanteSuperior;
import model.EstudanteTecnico;

public class EstudanteView {

	public static void main(String[] args) {
		EstudandeTecnicoController etc = new EstudandeTecnicoController();
		EstudanteSuperiorController esc = new EstudanteSuperiorController();
		
		EstudanteTecnico et = new EstudanteTecnico();
		EstudanteSuperior es = new EstudanteSuperior();
		
		et.setEmail("tecnico@mail");
		et.setMediaNotas(8.5f);
		et.setNome("Estudante Tecnico");
		et.setQtdAprovacoes(2);
		et.setRa("102784598");
				
		es.setEmail("superio@mail");
		es.setMediaNotas(8.5f);
		es.setNome("Estudante Superior");
		es.setQtdAprovacoes(3);
		es.setRa("22278459");
		es.setAnoConclusaoSegundoGrau(2024);
		es.setInstituicaoSegundoGrau("EEM");
		
		System.out.println("Tecnico");
		System.out.println(et.toString());
		System.out.println("Percentual de progresso: "+etc.percentualProgresso(et));
		System.out.println("Percentual de rendimento: "+etc.percentualRendimento(et));
		
		System.out.println("superior");
		System.out.println(es.toString());
		System.out.println("Percentual de progresso: "+esc.percentualProgresso(es));
		System.out.println("Percentual de rendimento: "+esc.percentualRendimento(es));
		
		
		

	}

}
