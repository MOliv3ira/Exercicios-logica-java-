package lista.exercicios.operadores;

import java.util.Scanner;

public class Ex12 { //TESTE GFT
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int ini, fim;

		System.out.println("Digite número inicial");
		ini = sc.nextInt();

		System.out.println("Digite número final");
		fim = sc.nextInt();

		for (int i = ini; i <= fim; i++)
			if (i % 2 == 1) {
				System.out.println(i + " ");
			}
	}
}

//Elabore um algoritmo para mostrar os números ímpares existentes em um intervalo. O
//usuário deverá fornecer os valores inicial (inicial > 0) e final (inicial < final) e os números
//ímpares existentes no intervalo ([inicial, final]) devem ser separados por um espaço em
//branco.
//Exemplo:
//Entrada: 2 13
//Saída: 3 5 7 9 11 13 