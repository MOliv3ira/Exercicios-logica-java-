package lista.exercicios.repeticao;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num, soma = 0;
		double cont = 0;
		
		System.out.print("Digite um número: ");
		num = sc.nextInt();
		
		do {
			if(num != 0) {
			soma = soma + num;
			cont++;
			}
			System.out.print("Digite um número: ");
			num = sc.nextInt();
			
		}while(num != 0);
		
		System.out.printf("A soma dos números digitados é: %d", soma);
	}

}

/*5-Crie um programa que leia um número do teclado até que encontre um número igual a zero.
 *  No final, mostre a soma dos números digitados.(DO...WHILE) */
