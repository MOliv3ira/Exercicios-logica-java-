package lista.exercicios.repeticao;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, par = 0, impar = 0;
		
		for (int i = 0; i < 10; i++) {
			
			System.out.print("Digite um número: ");
			num = sc.nextInt();
			
				if(num%2==0) {
					par++;
					
				} else {
					impar++;
				}
		}
		
		System.out.println("\nO total de números pares: " + par);
		System.out.println("\nO total de números impares: " + impar);
		
	}

}
//2-Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)