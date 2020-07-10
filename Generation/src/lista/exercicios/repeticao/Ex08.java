package lista.exercicios.repeticao;

public class Ex08 {

	public static void main(String[] args) {
		
		double soma = 0;
		int div = 1;
		
		for (int i = 1; i <= 50; i++) {

			soma = soma + div/i;
			div = div + 2;
			
		}
			System.out.print("\n\t\tResultado da soma: "+ soma);
	}
}

/*Faça um programa em C que calcula e escreve a seguinte soma: soma = 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50 */