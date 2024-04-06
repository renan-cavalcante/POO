package model;

public class Peixe extends Animal{

	private String caracteristica;
	
	public Peixe() {
		super();
		alteraPatas(0);
		alteraAmbiente("Mar");
		alteraCor("Cinza");
	}

	public String caracteristica() {
		return caracteristica;
	}

	public void alteraCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	
	@Override
	public String dados() {
		// TODO Auto-generated method stub
		return super.dados() +"\nCaracteristica: "+caracteristica;
	}
	

}
