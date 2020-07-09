package lista.exercicios.vetores;

import java.util.Arrays;
import java.util.Random;

public class OrdenaçãoEmBolha {

	static int[] gerarVetor(int n) {
		int[] v = new int[n];
		Random gerador = new Random();
		for (int i = 0; i < n; i++) {
			v[i] = gerador.nextInt(100);
		}
		return v;
	}

	private static void bolha(int[] v) {
		for (int ultimo = v.length - 1; ultimo > 0; ultimo--) {
			for (int i = 0; i < ultimo; i++) {
				if (v[i] > v[i + 1]) {
					trocar(v, i, i + 1);
				}
			}
		}
	}

	private static void trocar(int[] v, int i, int j) {

		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;
	}

	public static void main(String[] args) {

		int[] vetor = gerarVetor(10);
		bolha(vetor);
		System.out.println(Arrays.toString(vetor));

	}
}
