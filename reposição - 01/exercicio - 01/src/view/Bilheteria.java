package view;

import model.Ingresso;
import model.IngressoVip;

public class Bilheteria {

	public static void main(String[] args) {
		Ingresso i = new Ingresso();
		IngressoVip vip = new IngressoVip();
		
		i.setCodigo("I000");
		i.setValor(100.00f);
		
		vip.setCodigo("V0000");
		vip.setValor(100.00f);
		vip.setFuncao("Diretor");
		
		System.out.println("Valor ingresso R$" + i.valorFinal(1.10f));
		System.out.println("Valor VIP R$" +vip.valorFinal(1.10f));
		
		System.out.println(i.toString());
		System.out.println(vip.toString());

	}

}
