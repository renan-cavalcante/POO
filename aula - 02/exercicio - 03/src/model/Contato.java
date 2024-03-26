package model;

public class Contato {
	private String nome;
	private String numero;
	private String email;
	
	public Contato() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {

		return "Nome: "+nome+"\nTelefone:"+numero+"\nEmai:"+email;
	}
	
	

}
