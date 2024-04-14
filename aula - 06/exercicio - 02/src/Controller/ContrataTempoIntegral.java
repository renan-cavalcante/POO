package Controller;

import model.Funcionario;
import model.TempoIntegral;
import rcavalcante.entradadedados.view.Input;
import rcavalcante.entradadedados.view.Scan;

public class ContrataTempoIntegral extends ContrataFactory {
	private Input sc = new Scan();
	
	@Override
	public Funcionario contratacao() {
		try {
			TempoIntegral novoTempoIntegral = new TempoIntegral();
			super.inicialize(novoTempoIntegral);
			novoTempoIntegral.setBancoHora(getBancoHora());
			return novoTempoIntegral;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	private int getBancoHora() {
		return sc.nextInt("Digite o numero de horas em banco de horas");
	}

}
