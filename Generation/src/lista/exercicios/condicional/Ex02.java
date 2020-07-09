package lista.exercicios.condicional;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int idade;

		System.out.println("Digite sua idade: ");
		idade = sc.nextInt();

		if (idade < 12) {
			System.out.println("Você é criança.");

		} else if (idade < 18) {
			System.out.println("Você é adolecente.");

		} else if (idade >= 18 && idade <= 65) {
			System.out.println("Você é um adulto.");

		} else {
			System.out.println("Você é idoso.");
		}
	}

}
