package Main;

import Figuras.*;

public class Main {
	public static void main(String args[]) {
		
		/*
		 * (1) desenhar figuras geométricas,
			(2) calcular a área
			(3) calcular o perímetro
			(4) exibir as informações dessas figuras.
		 */
		
		Quadrado quadrado = new Quadrado(2);
		Circulo circulo = new Circulo(4);
		Retangulo retangulo = new Retangulo(2, 5);
		TrianguloEquilatero triangulo1 = new TrianguloEquilatero(4); //3 lados iguais
		TrianguloIsoceles triangulo2 = new TrianguloIsoceles(2, 4); //2 lados iguais
		TrianguloRetangulo triangulo3 = new TrianguloRetangulo(4, 2); //angulo reto de 90 graus
		
		
		System.out.println(quadrado.getInfo());
		System.out.println();
		System.out.println(circulo.getInfo());
		System.out.println();
		System.out.println(retangulo.getInfo());
		System.out.println();
		System.out.println(triangulo1.getInfo());
		System.out.println();
		System.out.println(triangulo2.getInfo());
		System.out.println();
		System.out.println(triangulo3.getInfo());
		System.out.println();
		
	}
}