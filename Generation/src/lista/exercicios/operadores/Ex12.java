package lista.exercicios.operadores;

import java.util.Scanner;

public class Ex12 { //TESTE GFT
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int ini, fim;

		System.out.println("Digite n�mero inicial");
		ini = sc.nextInt();

		System.out.println("Digite n�mero final");
		fim = sc.nextInt();

		for (int i = ini; i <= fim; i++)
			if (i % 2 == 1) {
				System.out.println(i + " ");
			}
	}
}

//Elabore um algoritmo para mostrar os n�meros �mpares existentes em um intervalo. O
//usu�rio dever� fornecer os valores inicial (inicial > 0) e final (inicial < final) e os n�meros
//�mpares existentes no intervalo ([inicial, final]) devem ser separados por um espa�o em
//branco.
//Exemplo:
//Entrada: 2 13
//Sa�da: 3 5 7 9 11 13 