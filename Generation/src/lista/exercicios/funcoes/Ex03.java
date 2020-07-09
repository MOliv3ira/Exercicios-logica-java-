package lista.exercicios.funcoes;
import java.util.Scanner;

public class Ex03 {

		public static int triangulo(int n) {

			if (n == 0) {
				return 0;
			} else {
				return n + triangulo(n - 1);
			}

			/*
			 * (Questão - 03) Temos triângulos feito de
			 * blocos. A linha superior tem 1 bloco, a próxima linha abaixo tem 2 blocos, a
			 * próximalinhatem3blocoseassimpordiante.
			 * Criarumafunçãorecursivaquecalcule(semloopsoumultiplicação) o número total de
			 * blocos em um triângulo com o número especiﬁcado de linhas.
			 */
		}
		

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Digite o número de linhas: ");
			int num = sc.nextInt();
			
			System.out.println("\n");
			
			System.out.print("triangulo("+triangulo(num)+")");

		}
}
