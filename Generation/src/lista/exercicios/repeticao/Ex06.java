package lista.exercicios.repeticao;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int  num, soma = 0 ;
		double media, cont = 0;
		
		System.out.print("Digite um número: ");
		num = sc.nextInt();
		
		do {
			
			if(num % 3 == 0 && num !=0) {
				soma = soma + num;
				cont++;
			}	
			System.out.print("Digite um número: ");
			num = sc.nextInt();
		
		}while(num != 0);
		
		media = soma/cont;
		System.out.printf("\nA média dos números múltiplos de 3 é %.2f", media);
	}
}

/*6-Escrever um programa que receba vários números inteiros no teclado.
 *  E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE) */