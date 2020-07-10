package lista.exercicios.vetores;

public class Ex02 {

	public static void main(String[] args) {

		int soma = 0;

		int vet[] = { 1, 0, 5, -2, -5, 7 };
		
		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i] + "  ");
		}
		
		System.out.println();
		
		soma += (vet[0] + vet[1] + vet[5]);
		System.out.println("\nA soma dos elementos nas posis�es A[0], A[1] e A[5] = " + soma + "\n");

		vet[4] = 100;

		for (int i = 0; i < vet.length; i++) {
			System.out.println("A[" + i + "] = " + vet[i]);
		}
	}
}

/*- Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros inteiros. 
 * O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.
 */
