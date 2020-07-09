package lista.exercicios.vetores;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int vet[] = new int[3];
		int maior = 0, negativo = -999;
		for (int i = 0; i < vet.length; i++) {

			System.out.print("Digite um valor inteiro: ");
			vet[i] = sc.nextInt();

			if (vet[i] > maior) {
				maior = vet[i];
			} else if (vet[i] > negativo) {
				negativo = vet[i];
			}
		}

		if (maior > 0) {
			System.out.printf("\nO usuário entrou com números positivo, entre eles o maior foi (%d)", maior);

		} else {
			System.out.printf("\nO usuário entrou com números negativos, entre eles o maior foi (%d)", negativo);
		}
	}
}

