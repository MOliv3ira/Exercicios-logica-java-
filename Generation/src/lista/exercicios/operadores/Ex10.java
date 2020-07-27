package lista.exercicios.operadores;

import java.util.Scanner;

public class Ex10 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x, y, expo = 0;
		
		System.out.print("Digite a base: ");
		x = sc.nextDouble();
		System.out.print("Digite o expoente: ");
		y = sc.nextDouble();
		
		expo = Math.pow(x, y);
		
		System.out.printf("A base %.1f elevada ao expoente %.1f = %.2f ", x, y, expo);
	
	}

}

/* Fazer um programa que lê dois números, a base e o expoente, e imprime a potência.*/
