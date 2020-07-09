package lista.exercicios.funcoes;

import java.util.Scanner;

public class Ex02 {

	public static int contarX(String palavra, char x, char X) {

		if (palavra.equals("")) {
			return 0;
		} else if ((palavra.charAt(0) == x) || (palavra.charAt(0) == X)) {
			return contarX(palavra.substring(1), x, X) + 1;
		} else {
			return contarX(palavra.substring(1), x, X);
		}

		/*
		 * (Quest�o - 02) Dada uma string, criar uma fun��o recursiva (sem la�os) que
		 * compute o n�mero de caracteres �x� na string.
		 */
	}

	public static void main(String[] args) {

		int num = contarX("Texto, Xadrez, Xicara", 'x', 'X');

		System.out.println("contarX(" + num + ")");

	}
}
