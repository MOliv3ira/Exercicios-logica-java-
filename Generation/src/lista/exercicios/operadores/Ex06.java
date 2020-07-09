package lista.exercicios.operadores;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x1, x2, y1, y2;
		double D;

		System.out.print("Informe o valor de X1: ");
		x1 = sc.nextInt();
		System.out.print("Informe o valor de X2: ");
		x2 = sc.nextInt();
		System.out.print("Informe o valor de Y1: ");
		y1 = sc.nextInt();
		System.out.print("Informe o valor de Y2: ");
		y2 = sc.nextInt();

		double temp = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
		D = Math.sqrt(temp);

		System.out.printf("\nA distância entre os dois pontos P(X1,Y1) e P(X2,Y2) é: %.2f", D);
	}
}
