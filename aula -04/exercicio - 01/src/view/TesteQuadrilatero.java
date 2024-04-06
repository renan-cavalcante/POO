package view;

import model.Paralelogramo;
import model.Trapezio;

public class TesteQuadrilatero {

	public static void main(String[] args) {
		Trapezio trapezio = new Trapezio();
		trapezio.setAltura(8f);
		trapezio.setBase(3);
		trapezio.setBaseMenor(2);
		
		Paralelogramo para = new Paralelogramo();
		para.setAltura(10);
		para.setBase(8);
		
		System.out.println("Trapezio");
		System.out.println("Perimetro: "+trapezio.calcularPerimetro());
		System.out.println("Area: "+trapezio.calcArea());
		System.out.println();
		System.out.println("Paralelogramo");
		System.out.println("Perimetro: "+para.calcularPerimetro());
		System.out.println("Area: "+para.calcArea());
		
	}

}
