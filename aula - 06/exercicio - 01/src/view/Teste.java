package view;

import model.Carga;
import model.Motor;
import model.Passeio;

public class Teste {

	public static void main(String[] args) {
		Motor v8 = new Motor();
		v8.setPotencia(200);
		v8.setQtdPist(8);
		
		Motor v6 = new Motor();
		v6.setPotencia(260);
		v6.setQtdPist(6);
		
		
		Passeio p1 = new Passeio();
		p1.setCor("Vermelho");
		p1.setMarca("Citroen");
		p1.setModel("C3");
		p1.setPlaca("###*#**");
		p1.setVelocMax(100f);
		p1.setMotor(v8);
		System.out.println(p1.calcVel()+"cm/H");
		System.out.println(p1.toString());
		System.out.println();
		
		Passeio p2 = new Passeio();
		p2.setCor("Preto");
		p2.setMarca("Renault");
		p2.setModel("Sandero");
		p2.setPlaca("###*#**");
		p2.setVelocMax(200f);
		p2.setMotor(v8);
		System.out.println(p2.calcVel()+"cm/H");
		System.out.println(p2.toString());
		System.out.println();
		
		Carga c1 = new Carga();
		c1.setCor("Vermelho");
		c1.setMarca("VOLKWAGEN");
		c1.setModel("Meteor");
		c1.setPlaca("###*#**");
		c1.setVelocMax(160);
		c1.setMotor(v6);
		c1.setQtdRodas(6);
		c1.setCargaMax(50000);
		c1.setTara(10120);
		System.out.println(c1.calcVel()+"m/H");
		System.out.println(c1.toString());
		System.out.println();
		
		Carga c2 = new Carga();
		c2.setCor("Vermelho");
		c2.setMarca("Mercedes-Bez");
		c2.setModel("Atego");
		c2.setPlaca("###*#**");
		c2.setVelocMax(180);
		c2.setMotor(v6);
		c2.setQtdRodas(4);
		c2.setCargaMax(10000);
		c2.setTara(7696);
		System.out.println(c2.calcVel()+"m/H");
		System.out.println(c2.toString());



	}

}
