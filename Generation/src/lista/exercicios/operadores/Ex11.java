package lista.exercicios.operadores;

import java.util.Scanner;

public class Ex11 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		double soma = 0;
		
		System.out.print("Digite um n�mero: ");
		x = sc.nextInt();
		System.out.print("Digite um n�mero: ");
		y = sc.nextInt();
		
		soma = Math.pow(x, 2) + Math.pow(y, 2);
		
		System.out.printf("\n\tA soma dos quadrados dos n�meros %d e %d = %.2f ", x, y, soma);
	}

}
