package lista.exercicios.operadores;

import java.util.Scanner;

public class Ex02 {
		
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			double n1, n2, n3, media;
		
			
			System.out.println("Digite a nota da primeira prova: ");
			n1 = sc.nextDouble();
			System.out.println("Digite a nota da segunda prova: ");
			n2 = sc.nextDouble();
			System.out.println("Digite a nota do PI: ");
			n3 = sc.nextDouble();
			
			media = (n1*2+n2*3+n3*5)/10;
			
			if(media == 10) {
				System.out.printf("PARABÉNS! \nVocê foi aprovado com %.2f a nota máxima.",media);
			} else if(media >= 6) {
				System.out.printf("APROVADO: %.2f",media);
			} else {
				System.out.printf("REPROVADO: %.2f",media);
			}
		}

	}
