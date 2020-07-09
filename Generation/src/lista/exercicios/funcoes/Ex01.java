package lista.exercicios.funcoes;
import java.util.Scanner;

public class Ex01 {
	
		public static int orelhasCoelho(int n) {

			if (n < 1) {
				return 0;
			} else {
				return (n + n) + orelhasCoelho(1 - n);
			}

			/*
			 * (Questão - 01) Temos vários coelhos e
			 * cada coelho tem duas orelhas grandes e ﬂexíveis. Queremos calcular o número
			 * total de orelhas em todos os coelhos de forma recursiva (sem loops ou
			 * multiplicação). Criar uma função recursiva que receba um número N
			 * representando o número de coelhos e retorne a número total de orelhas.
			 */

		}

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Digite o número de coelhos: ");
			int n = sc.nextInt();
			
			System.out.println("\n");
			
			System.out.print("OrelhasCoelho("+orelhasCoelho(n)+")");

		}

}
