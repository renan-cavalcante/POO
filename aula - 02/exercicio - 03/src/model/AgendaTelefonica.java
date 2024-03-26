package model;

import java.util.HashMap;
import java.util.Map;

public class AgendaTelefonica {
	private Map<String,Contato> contatos;

	public AgendaTelefonica() {
		contatos = new HashMap<>();
	}

	public Map<String, Contato> getContatos() {
		return contatos;
	}
	
	public void addContato(Contato contato){
		contatos.put(contato.getNome(), contato);
	}
	
	public Contato buscarContato(String parametro) {
		return contatos.get(parametro);
	}
}
