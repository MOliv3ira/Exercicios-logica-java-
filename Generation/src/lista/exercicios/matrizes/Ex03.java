package lista.exercicios.matrizes;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double m1 [][] = new double [2][2], m2 [][] = new double [2][2];
		
		double soma [][] = new double [2][2], sub [][] = new double [2][2];
		
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1.length; j++) {
				
				System.out.print("Digite um valor: ");
				m1[i][j] = sc.nextDouble();
			}
		}
		
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2.length; j++) {
				
				System.out.print("Digite um valor: ");
				m2[i][j] = sc.nextDouble();
			}
		}
		
		int opcao, cont = 0;
		
		do {
		
		System.out.println("\n(1) somar as duas matrizes.");
		System.out.println("\n(2) subtrair a primeira matriz da segunda.");
		System.out.println("\n(3) adicionar uma constante as duas matrizes.");
		System.out.println("\n(4) imprimir as matrizes.");
		
		System.out.print("\nDigite uma opção: ");
		 opcao = sc.nextInt();
		
		final int constt;
		
		switch(opcao) {
		case 1:
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					soma[i][j] = m1[i][j]+m2[i][j];
					System.out.println("Valor: " + soma[i][j]);
				}
			}
				break;
		case 2:
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					sub[i][j] = m1[i][j]-m2[i][j];
					System.out.println("Valor: " + sub[i][j]);
				}
			}
				break;
		case 3:
			System.out.print("Digite um valor constante: ");
			constt = sc.nextInt();
			
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					
					m1[i][j] = m1[i][j]+constt;
					m2[i][j] = m2[i][j]+constt;
					
					System.out.println("\nM1: " + m1[i][j]);
					System.out.println("\nM2: " + m2[i][j]);
				}
			}
				break;
		case 4:
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					System.out.println("\nMatriz 1: " + m1[i][j]);
				}
			}
			
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					System.out.println("\nMatriz 2: " + m2[i][j]);
				}
			}
			break;
		default: 
			System.out.println("Opção inválida.");
		}
		cont++;
		}while(cont <= 3);
		
	}

}
