package lista.exercicios.operadores;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeira número: ");
		float n1 = sc.nextFloat();
		System.out.println("Digite o segundo número: ");
		float n2 = sc.nextFloat();

		float prod = n1 * n2;

		System.out.println("A multiplicação entre os dois números informados é: " + prod);

	}

}
