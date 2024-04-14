package controller;

import java.util.ArrayList;
import java.util.List;

import model.Prova;

public class ProvaController implements IListAvaliacaoController<Prova> {
	private List<Prova> lista;
	
	public ProvaController() {
		lista = new ArrayList<>();
	}

	@Override
	public Prova consultaPorRealizacao(int posicao) {
		return lista.get(posicao);
	}

	@Override
	public void limpaAvaliacoes() {
		lista.clear();
		System.out.println("Lista limpa");
	}

	@Override
	public void listaAvaliacoes() {
		lista.forEach(System.out::println);
	}

	@Override
	public void cadastraAvaliacao(Prova prova) {
		lista.add(prova);
	}

}
