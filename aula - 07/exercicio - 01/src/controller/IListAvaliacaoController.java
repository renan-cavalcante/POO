package controller;

public interface IListAvaliacaoController<T> {
	public T consultaPorRealizacao(int posicao);
	public void limpaAvaliacoes();
	public void cadastraAvaliacao(T t);
	public void listaAvaliacoes();
	
}
