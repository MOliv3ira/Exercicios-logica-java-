package lista.exercicios.condicional;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int idade;

		System.out.println("Digite sua idade: ");
		idade = sc.nextInt();

		if (idade < 12) {
			System.out.println("Voc� � crian�a.");

		} else if (idade < 18) {
			System.out.println("Voc� � adolecente.");

		} else if (idade >= 18 && idade <= 65) {
			System.out.println("Voc� � um adulto.");

		} else {
			System.out.println("Voc� � idoso.");
		}
	}

}
