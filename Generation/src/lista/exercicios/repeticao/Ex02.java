package lista.exercicios.repeticao;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, par = 0, impar = 0;
		
		for (int i = 0; i < 10; i++) {
			
			System.out.print("Digite um n�mero: ");
			num = sc.nextInt();
			
				if(num%2==0) {
					par++;
					
				} else {
					impar++;
				}
		}
		
		System.out.println("\nO total de n�meros pares: " + par);
		System.out.println("\nO total de n�meros impares: " + impar);
		
	}

}
//2-Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)