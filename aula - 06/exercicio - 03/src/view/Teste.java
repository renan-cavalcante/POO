package view;

import java.util.Map;

import controller.ICalculoImposto;
import model.Cidade;
import model.Imovel;
import rcavalcante.entradadedados.view.Input;
import rcavalcante.entradadedados.view.Scan;

public class Teste {
	static Input sc = new Scan();

	public static void main(String[] args) {

		System.out.println("Digite os dados do imovel");
		Imovel imovel = new Imovel();
		defineAreaGaragem(imovel);
		defineAreatotal(imovel);

		while (imovel.getCidade() == null) {
			defineCidade(imovel);
		}

		defineEndereco(imovel);
		defineIdade(imovel);
		defineNumeroComodos(imovel);
		defineNumeroQuartos(imovel);

		ICalculoImposto calculo = imovel.getCidade().defineCalculoImposto();

		calculo.defineImposto(imovel);
		System.out.println("O imposto devido do imovel é de R$" + imovel.getImposto());

	}

	private static void defineAreaGaragem(Imovel imovel) {
		imovel.setAreaGaragem(sc.nextDouble("Digite a area da garagem"));
	}

	private static void defineAreatotal(Imovel imovel) {
		imovel.setAreaTotal(sc.nextLong("Digite a area da total"));
	}

	private static void defineCidade(Imovel imovel) {
		exibeCidade();
		int cidadeNum = sc.nextInt("Digite o numero da cidade");
		Map<Integer, Cidade> cidades = Cidade.obtercidades();

		if (cidadeNum > 0 && cidadeNum <= cidades.size()) {
			imovel.setCidade(cidades.get(cidadeNum));
			return;
		}
		System.err.println("numero incorreto");
	}

	private static void defineEndereco(Imovel imovel) {
		imovel.setEndereco(sc.nextLine("Digite o endereço"));
	}

	private static void defineIdade(Imovel imovel) {
		imovel.setIdade(sc.nextInt("Digite a idade"));
	}

	private static void defineNumeroComodos(Imovel imovel) {
		imovel.setNumeroComodos(sc.nextInt("Digite o numero de comodos"));
	}

	private static void defineNumeroQuartos(Imovel imovel) {
		imovel.setNumeroQuartos(sc.nextInt("Digite o numero de quartos"));
	}

	private static void exibeCidade() {
		int count = 1;
		for (Cidade cidade : Cidade.values()) {
			System.out.println(count + " - " + cidade.getNome());
			count++;
		}
	}

}
