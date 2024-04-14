package model;

import java.time.LocalDate;

public final class Temporario extends Funcionario {
	
	private LocalDate fimContrato;
	
	public Temporario() {
		
	}

	public LocalDate getFimContrato() {
		return fimContrato;
	}

	public final void setFimContrato(LocalDate fimContrato) {
		this.fimContrato = fimContrato;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\nfimContrato: ");
		builder.append(fimContrato);
		return builder.toString();
	}

	
}
