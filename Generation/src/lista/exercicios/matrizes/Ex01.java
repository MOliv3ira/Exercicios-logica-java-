package lista.exercicios.matrizes;

import java.util.Random;

public class Ex01 {

	// MatrizTransposta

	/*
	 * fazer uma função que receba uma matriz e calcule a sua transposta e retorne.
	 */

	static int[][] criaMatriz(int N, int M) {
		int[][] matriz = new int[N][M];

		Random gerador = new Random();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = gerador.nextInt(100);
			}
		}

		return matriz;
	}

	static int[][] matrizTransposta(int[][] matriz) {

		int[][] matrizTransposta = new int[matriz[0].length][matriz.length];
		for (int i = 0; i < matrizTransposta.length; i++) {
			for (int j = 0; j < matrizTransposta.length; j++) {
				matrizTransposta[i][j] = matriz[j][i];
			}
		}

		return matrizTransposta;
	}

	static void imprimeMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.print("\n");
		}

	}

	public static void main(String[] args) {

		int[][] matriz = criaMatriz(3, 3);
		imprimeMatriz(matriz);

		System.out.println();

		int[][] transposta = matrizTransposta(matriz);
		imprimeMatriz(transposta);

	}

}
