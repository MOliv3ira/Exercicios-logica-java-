package lista.exercicios.vetores;

import java.util.Arrays;
import java.util.Random;

public class OrdenaçãoPorInserção {

	public static void main(String[] args) {

		int[] vetor = gerarVetor(10);

		insertionSort(vetor);
		System.out.println(Arrays.toString(vetor));
	}

	public static int[] gerarVetor(int n) {
		int[] vetor = new int[n];
		Random gerador = new Random();

		for (int i = 0; i < n; i++) {
			vetor[i] = gerador.nextInt(100);
		}
		return vetor;
	}

	private static void insertionSort(int[] vetor) {
		int x, j;
		for (int i = 1; i < vetor.length; i++) {
			x = vetor[i];
			j = i - 1;
			while ((j >= 0) && (vetor[j] > x)) {
				vetor[j + 1] = vetor[j];
				j = j - 1;
			}
			vetor[j + 1] = x;
		}

	}

}
