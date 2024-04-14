package model;

public final class TempoIntegral extends Funcionario{
	private int bancoHora;

	public TempoIntegral() throws Exception {

	}
	
	public int getBancoHora() {
		return bancoHora;
	}

	public final void setBancoHora(int bancoHora) {
		this.bancoHora = bancoHora;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\nbancoHora: ");
		builder.append(bancoHora);

		return builder.toString();
	}
	

}
