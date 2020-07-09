package lista.exercicios.vetores;

import java.util.Arrays;
import java.util.Random;

public class OrdenaçãoPorSeleção {

	static void selectionSort(int[] v) {
		for (int i = 0; i < v.length; i++) {
			int menor = i;
			for (int j = i + 1; j < v.length; j++) {
				if (v[j] < v[menor]) {
					menor = j;
				}
			}
			trocar(v, i, menor);
		}
	}

	private static void trocar(int[] v, int i, int menor) {

		int aux = v[i];
		v[i] = v[menor];
		v[menor] = aux;
	}

	static int[] gerarVetor(int n) {
		int[] v = new int[n];

		Random gerador = new Random();

		for (int i = 0; i < n; i++) {
			v[i] = gerador.nextInt(100);
		}
		return v;
	}

	public static void main(String[] args) {

		int[] vetor = gerarVetor(10);
		selectionSort(vetor);
		System.out.println(Arrays.toString(vetor));
	}
}
