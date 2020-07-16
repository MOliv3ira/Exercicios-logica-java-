package lista.exercicios.POO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class TesteCollections {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Collection<String> estoque = new ArrayList();
		int opcao = 0;
		String atualiza, prod = null;

		do {

			System.out.println(
					"Estoque." + "\nEscolha uma das opções:" + "\n\t1 - Adicionar produto" + "\n\t2 - Remover produto"
							+ "\n\t3 - Atualizar produto" + "\n\t4 - Mostrar estoque" + "\n\t0 - Para sair");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("ADICIONAR PRODUTO: ");
				prod = sc.next();
				estoque.add(prod);
				break;
			case 2:
				System.out.println("REMOVER PRODUTO: ");
				prod = sc.next();
				estoque.remove(prod);
				break;
			case 3:
				System.out.println("ATUALIZAR PRODUTO, DIGITE O NOME DO PRODUTO QUE DESEJA ATUALIZAR: ");
				prod = sc.next();
				if (estoque.contains(prod)) {

					estoque.remove(prod);
				}
				System.out.println("\nDIGITE O NOME DO NOVO PRODUTO: ");
				atualiza = sc.next();
				estoque.add(atualiza);
				break;
			case 4:
				for (String i : estoque) {
					System.out.println("LISTA DE PRODUTOS NO ESTOQUE: " + i);
				}
				break;
			default:
				if (opcao == 0) {

					System.out.print("Saiu ...");
				} else {
					System.out.print("Opcão invalida ...\n");
				}
				break;
			}
		} while (opcao != 0);
	}

}
