package lista.exercicios.operadores;

import java.util.Scanner;

public class Ex09 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x, y, prod = 0;
		
		System.out.print("Digite um n�mero: ");
		x = sc.nextDouble();
		System.out.print("Digite um n�mero: ");
		y = sc.nextDouble();
		
		prod = x*y;
		
		System.out.print("A multiplica��o dos n�meros �: " + prod);
	
		
	}

}

/*Fazer um algoritmo que leia dois n�meros e imprima na tela o produto(Multiplica��o)
 * dos dois n�meros. */
