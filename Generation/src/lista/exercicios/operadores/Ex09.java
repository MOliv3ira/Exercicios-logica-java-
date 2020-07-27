package lista.exercicios.operadores;

import java.util.Scanner;

public class Ex09 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x, y, prod = 0;
		
		System.out.print("Digite um número: ");
		x = sc.nextDouble();
		System.out.print("Digite um número: ");
		y = sc.nextDouble();
		
		prod = x*y;
		
		System.out.print("A multiplicação dos números é: " + prod);
	
		
	}

}

/*Fazer um algoritmo que leia dois números e imprima na tela o produto(Multiplicação)
 * dos dois números. */
