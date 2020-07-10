package lista.exercicios.vetores;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double vet[] = new double[5];
		int cod;

		for (int i = 0; i < vet.length; i++) {
			System.out.print("Digite um n�mero: ");
			vet[i] = sc.nextDouble();
		}

		System.out.print("Entre com o c�digo: ");
		cod = sc.nextInt();

		if (cod == 1) {
			for (int i = 0; i < vet.length; i++) {
				System.out.println("Vetor[" + (i + 1) + "] = " + vet[i]);
			}
		} else if (cod == 2) {
			for (int i = 4; i >= 0; i--) {
				System.out.println("Vetor[" + i + "] = " + vet[i]);
			}
		} else {
			System.out.println("Op��o invalida.");
		}
	}
}

/*Fa�a um programa que leia um vetor de 5 posi��es para n�meros reais e, depois, um c�digo inteiro.
 *Se o c�digo for zero, finalize o programa; se for 1, mostre o vetor na ordem direta; se for 2, mostre o vetor na ordem inversa.
 *Caso, o c�digo for diferente de 1 e 2, escreva uma mensagem informando que o c�digo inv�lido. */
 

