package controller;

import java.util.ArrayList;
import java.util.List;

import model.Atividade;

public class AtividadeController implements IListAvaliacaoController<Atividade> {
	private List<Atividade> lista;
	
	public AtividadeController() {
		lista = new ArrayList<>();
	}

	@Override
	public Atividade consultaPorRealizacao(int posicao) {
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
	public void cadastraAvaliacao(Atividade Atividade) {
		lista.add(Atividade);
	}

}
