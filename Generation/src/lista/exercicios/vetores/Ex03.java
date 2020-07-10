package lista.exercicios.vetores;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int soma = 0, cont = 0;
		
		int vet [] = new int [6];
		
		for (int i = 0; i < vet.length; i++) {
			System.out.print("Digite um valor: ");
			vet[i] = sc.nextInt();
		}
		
		for (int i = 0; i < vet.length; i++) {
			if(vet[i]%2==0) {
				System.out.printf("\nNúmero %d PAR.", vet[i]);
				soma = soma + vet[i];
			}else {
				System.out.printf("\nNúmero %d IMPAR. ", vet[i]);
				cont++;
			}
		}
				System.out.println();
				System.out.println("\nA soma dos números pares digitados: " + soma);
				System.out.println("\nA quantidade de números ímpares digitados: " + cont);
	}

}
