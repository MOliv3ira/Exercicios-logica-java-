package lista.exercicios.matrizes;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cont = 0;
		int matriz[][] = new int[3][3];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print("Digite um valor: ");
				matriz[i][j] = sc.nextInt();
				if (matriz[i][j] > 10) {
					cont++;
				}
			}
			
		}
		System.out.printf("\nA matriz possui %d numeros maiores que 10.\n ", cont);
	}
}

//Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
