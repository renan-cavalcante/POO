package model;

import java.util.concurrent.Semaphore;

public class Musica extends Thread {
	private String nome;
	private String autor;
	private String gravadora;
	private Semaphore semaforo;

	public Musica() {
	}

	@Override
	public void run() { // apenas para relembrar threads
		try {
			semaforo.acquire();
			System.out.println(toString());
		} catch (InterruptedException e) {

		} finally {
			semaforo.release();
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGravadora() {
		return gravadora;
	}

	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}

	public void setSemaforo(Semaphore semaforo) {
		this.semaforo = semaforo;
	}

	@Override
	public String toString() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Trocando " + nome;
	}

}
