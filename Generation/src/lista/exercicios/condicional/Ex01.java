package lista.exercicios.condicional;

import java.util.Scanner;

public class Ex01 {
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int codigo;
			
			System.out.println("Digite um opção de 1 a 5.");
			codigo = sc.nextInt();
			
			switch(codigo) {
				case 1:
					System.out.println("Cachorro Quente.");
					System.out.println("R$ 4,00");
					break;
				case 2:
					System.out.println("X-Salada.");
					System.out.println("R$ 4,50");
					break;
				case 3:
					System.out.println("X-Bacon.");
					System.out.println("R$ 5,00");
					break;
				case 4:
					System.out.println("Torrada simples.");
					System.out.println("R$ 2,00");
					break;
				case 5:
					System.out.println("Refrigerante.");
					System.out.println("R$ 1,50");
				break;
			default:
				System.out.println("Opção invalida.");
				break;
			}
		}
	}
