package lista.exercicios.operadores;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeira n�mero: ");
		float n1 = sc.nextFloat();
		System.out.println("Digite o segundo n�mero: ");
		float n2 = sc.nextFloat();

		float prod = n1 * n2;

		System.out.println("A multiplica��o entre os dois n�meros informados �: " + prod);

	}

}
