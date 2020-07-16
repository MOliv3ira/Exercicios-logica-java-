package lista.exercicios.POO;

import java.util.Scanner;

public class CriarAnimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();

		Animal animal = null;

		System.out.print("Digite um número entre 1 e 3: ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			animal = cachorro;
			animal.emitirSom();
			animal.acao();
			break;
		case 2:
			animal = cavalo;
			animal.emitirSom();
			animal.acao();
			break;
		case 3:
			animal = preguica;
			animal.emitirSom();
			animal.acao();
			break;

		default:
			System.out.println("\n\t\tValor inválido ...");
		}
	}

}
