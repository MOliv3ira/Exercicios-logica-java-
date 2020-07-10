package lista.exercicios.condicional;

import java.util.Scanner;

public class Ex06 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		double valor, valorD = 0, valorF = 0;
		
		System.out.printf("\nDigite o valor do produto: ");
		valor = sc.nextDouble();
		
		System.out.print("\t\tMenu:\n"
				+ "\t\t1 > À vista em dinheiro ou cheque, recebe 20% de desconto\n"
				+ "\t\t2 > À vista no cartão de crédito, recebe 15% de desconto\n"
				+ "\t\t3 > Em duas vezes, preço normal de etiqueta sem juros\n"
				+ "\t\t4 > Em três vezes, preço normal de etiqueta mais juros de 10% ");
		
		System.out.print("\nSelecione uma opção: ");
		opcao = sc.nextInt();
		
		if(opcao == 1) {
			valorD = valor * 0.20;
			valorF = valor * 0.80;
			System.out.printf("\nGanhou desconto de: R$ %.2f\n\nTOTAL A PAGAR: R$ %.2f", valorD, valorF);
		}else if(opcao == 2) {
			valorD = valor * 0.15;
			valorF = valor * 0.85;
			System.out.printf("\nGanhou desconto de: R$ %.2f\n\nTOTAL A PAGAR: R$ %.2f", valorD, valorF);
		}else if(opcao == 3) {
			System.out.printf("\nSem juros!\nTOTAL A PAGAR: R$ %.2f", valor);
		}else if(opcao == 4) {
			valorF = valor * 1.10;
			System.out.printf("\nPagamento com juros.\n\nTOTAL A PAGAR: R$ %.2f", valorF);
		}else {
			System.out.printf("\nOPÇÃO INVALIDA.");
		}
		
	}

}

/*Elabore um programa que calcule o que deve ser pago por um produto, considerando o preço normal de etiqueta e a escolha da condição de pagamento.
 Utilize os códigos da tabela a seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo adequado. 
Código Condição de pagamento 
1 À vista em dinheiro ou cheque, recebe 20% de desconto 
2 À vista no cartão de crédito, recebe 15% de desconto 
3 Em duas vezes, preço normal de etiqueta sem juros 
4 Em três vezes, preço normal de etiqueta mais juros de 10%
 */
