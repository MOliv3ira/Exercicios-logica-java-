package lista.exercicios.condicional;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b, c, aux;

		System.out.print("Digite um n�mero: ");
		a = sc.nextInt();
		System.out.print("Digite um n�mero: ");
		b = sc.nextInt();
		System.out.print("Digite um n�mero: ");
		c = sc.nextInt();

		if (a > c || b > c) {
			if (a > b) {
				aux = a;
				a = c;
				c = aux;
			} else {
				aux = b;
				b = c;
				c = aux;
			}
		}
		if (a > b) {
			aux = a;
			a = b;
			b = aux;
		}

		System.out.printf("Ordem crescente:\n" + "%d %d %d", a, b, c);
	}

}
