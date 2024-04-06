package view;

import model.Animal;
import model.Mamifero;
import model.Peixe;

public class TesteAnimais {

	public static void main(String arg[]) {
		Animal camelo = new Animal();
		camelo.alteraNome("Camelo");
		camelo.alteraAmbiente("Terra");
		camelo.alteraComprimento(150);
		camelo.alteraCor("Amarelo");
		camelo.alteraVelocidade(2.0f);
		
		Peixe tubarao = new Peixe();
		tubarao.alteraNome("Tubarão");
		tubarao.alteraComprimento(300);
		tubarao.alteraVelocidade(1.5f);
		tubarao.alteraCaracteristica("Barbatanas e calda.");
		
		Mamifero urso = new Mamifero();
		urso.alteraNome("Urso");
		urso.alteraComprimento(180);
		urso.alteraCor("Vermelho");
		urso.alteraVelocidade(0.5f);
		urso.alteraAlimento("Mel");
		
		
		System.out.println("Zoo:");
		System.out.println("-----------------------------------------");
		
		System.out.println(camelo.dados());
		
		System.out.println("-----------------------------------------");
		
		System.out.println(tubarao.dados());
		
		System.out.println("-----------------------------------------");
		System.out.println(urso.dados());
		
				
	}

}
