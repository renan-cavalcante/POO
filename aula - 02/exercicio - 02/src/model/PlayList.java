package model;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;


public class PlayList  {
	private String nome;
	private List<Musica> musicas;
	private String dono;
	private Semaphore semaforo = new Semaphore(1);
	
	
	public PlayList() {
		musicas = new ArrayList<>();
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public List<Musica> getMusicas() {
		return musicas;
	}


	public void addMusicas(Musica musica) {
		musica.setSemaforo(semaforo);
		musicas.add(musica);
	}


	public String getDono() {
		return dono;
	}


	public void setDono(String dono) {
		this.dono = dono;
	}
	
	public void reproduzir() {
		musicas.forEach(System.out::println);
	}
	
	public void reproduzirAleatorio() {
		musicas.forEach(Musica::start);
	//	(int) (Math.random()*musicas.size()) toca aleatorio mas repete
	}
	
	
}
