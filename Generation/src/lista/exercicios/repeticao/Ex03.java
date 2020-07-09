package lista.exercicios.repeticao;

import java.util.Scanner;

public class Ex03 {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int idade = 0, cont50 = 0, cont21 = 0;
			
			System.out.println("Digite a sua idade: ");
			idade = sc.nextInt();
			
			while(idade != -99) {
				
				if(idade < 21) {
					cont21++;
				}else {
					cont50++;
				}
				
				System.out.println("Digite a sua idade: ");
				idade = sc.nextInt();
			}
				System.out.println("\nO total de pessoas com idade abaixo dos 21 ano são: "+ cont21);
				System.out.println("\nO total de pessoas com idade acima dos 50 ano são: "+ cont50);
		}
}
//3-Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
//Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)