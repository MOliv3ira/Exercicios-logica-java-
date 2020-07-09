package lista.exercicios.condicional;

import java.util.Scanner;

public class Ex04 {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int idade;
			
			System.out.print("Digite sua idade: ");
			idade = sc.nextInt();
			
			if(idade >= 10 && idade <= 14) {
				System.out.println("•	10-14 Infantil");
			}else if(idade >= 15 && idade <= 17) {
				System.out.println("•	15-17 juvenil");
			}else if(idade >= 18 && idade <= 25) {
				System.out.println("•	18-25 adulto");
			}
		}

}
