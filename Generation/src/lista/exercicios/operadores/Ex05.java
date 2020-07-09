package lista.exercicios.operadores;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int anos, meses, dias;

		System.out.print("Digite os anos: ");
		anos = sc.nextInt();
		System.out.print("Digite os meses: ");
		meses = sc.nextInt();
		System.out.print("Digite os dias: ");
		dias = sc.nextInt();

		int total = ((anos * 365) + (meses * 30) + dias);

		System.out.printf("\nTotal de dias vividos %d.", total);
	}
}
