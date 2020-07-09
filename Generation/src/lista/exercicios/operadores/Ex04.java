package lista.exercicios.operadores;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o sua idade no total de dias: ");
		int total = sc.nextInt();

		int idadeAnos = total / 365;
		total = total % 365;
		int idadeMeses = total / 30;
		total = total % 30;
		int idadeDias = total;

		System.out.printf("Você tem %d anos %d meses %d dias.", idadeAnos, idadeMeses, idadeDias);

	}
}
