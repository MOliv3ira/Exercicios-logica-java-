package lista.exercicios.repeticao;

import java.util.Scanner;

public class Ex07 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0;
		
		System.out.print("Digite um número: ");
		num = sc.nextInt();
		

		while(num >= 0) {
			
			if((num >= 0)&&(num <= 25)) {
				cont1++;
			}else if((num >= 26)&&(num <= 50)) {
				cont2++;
			}else if((num >= 51)&&(num <= 75)) {
				cont3++;
			}else if((num >= 76)&&(num <= 100)) {
				cont4++;
			}
			
			System.out.print("Digite um número: ");
			num = sc.nextInt();
		}
		
		System.out.printf("\n\t\tQuantidade de números digitados entre [0-25]:	%d ", cont1);
		System.out.printf("\n\t\tQuantidade de números digitados entre [26-50]: 	%d ", cont2);
		System.out.printf("\n\t\tQuantidade de números digitados entre [51-75]: 	%d ", cont3);
		System.out.printf("\n\t\tQuantidade de números digitados entre [76-100]:	%d ", cont4);
	}

}

/*Escrever um programa que leia uma quantidade desconhecida de números e conte quantos deles estão nos seguintes intervalos:
 *[0-25], [26-50], [51-75] e [76-100]. 
 *A entrada de dados deve terminar quando for lido um número negativo. */
