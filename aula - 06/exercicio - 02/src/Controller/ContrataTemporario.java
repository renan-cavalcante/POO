package Controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model.Funcionario;
import model.Temporario;
import rcavalcante.entradadedados.view.Input;
import rcavalcante.entradadedados.view.Scan;

public class ContrataTemporario extends ContrataFactory {
	private Input sc = new Scan();

	@Override
	public Funcionario contratacao() {
		Temporario novoTemporario = new Temporario();
		super.inicialize(novoTemporario);
		novoTemporario.setFimContrato(getFimContrato());
		return novoTemporario;
	}

	private LocalDate getFimContrato() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return LocalDate.parse(sc.next("Digite a data do fim do contrato em dd/mm/aaaa"), formatter);
	}
}
