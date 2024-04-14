package Controller;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import model.Funcionario;
import model.TempoParcial;
import rcavalcante.entradadedados.view.Input;
import rcavalcante.entradadedados.view.Scan;

public class ContrataTempoParcial extends ContrataFactory {
	private Input sc = new Scan();

	@Override
	public Funcionario contratacao() {
		TempoParcial novoTempoParcial = new TempoParcial();
		super.inicialize(novoTempoParcial);
		novoTempoParcial.setHoraEntrada(getHoraEntrada());
		novoTempoParcial.setHoraSaida(getHoraSaida());
		return novoTempoParcial;

	}

	private LocalTime getHoraEntrada() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
		return LocalTime.parse(sc.next("Digite a hora de entrada em hh:mm"), formatter);
	}

	private LocalTime getHoraSaida() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
		return LocalTime.parse(sc.next("Digite a hora de saida em hh:mm"), formatter);
	}

}
