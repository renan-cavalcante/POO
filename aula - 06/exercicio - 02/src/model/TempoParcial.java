package model;

import java.time.LocalTime;

public final class TempoParcial extends Funcionario{

	private LocalTime horaEntrada;
	private LocalTime horaSaida;
	
	public TempoParcial() {
		// TODO Auto-generated constructor stub
	}
	
	public LocalTime getHoraEntrada() {
		return horaEntrada;
	}
	public LocalTime getHoraSaida() {
		return horaSaida;
	}
	public final void setHoraEntrada(LocalTime horaEntrada) {
		this.horaEntrada = horaEntrada;
	}
	public final void setHoraSaida(LocalTime horaSaida) {
		this.horaSaida = horaSaida;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\nhoraEntrada: ");
		builder.append(horaEntrada);
		builder.append("\nhoraSaida: ");
		builder.append(horaSaida);

		return builder.toString();
	}
	
	
}
