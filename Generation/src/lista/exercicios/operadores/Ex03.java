package lista.exercicios.operadores;

import java.util.Scanner;

public class Ex03 {

	static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final float distribuidor = 28, imposto = 45;
		double custo, consumidor;

		System.out.print("Digite o custo de f�brica: ");
		custo = sc.nextDouble();

		consumidor = custo + (distribuidor + imposto);

		System.out.printf("\nO custo do consumidor � %.2f ", consumidor);
	}

}
