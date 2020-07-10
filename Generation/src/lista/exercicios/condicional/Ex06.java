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
				+ "\t\t1 > � vista em dinheiro ou cheque, recebe 20% de desconto\n"
				+ "\t\t2 > � vista no cart�o de cr�dito, recebe 15% de desconto\n"
				+ "\t\t3 > Em duas vezes, pre�o normal de etiqueta sem juros\n"
				+ "\t\t4 > Em tr�s vezes, pre�o normal de etiqueta mais juros de 10% ");
		
		System.out.print("\nSelecione uma op��o: ");
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
			System.out.printf("\nOP��O INVALIDA.");
		}
		
	}

}

/*Elabore um programa que calcule o que deve ser pago por um produto, considerando o pre�o normal de etiqueta e a escolha da condi��o de pagamento.
 Utilize os c�digos da tabela a seguir para ler qual a condi��o de pagamento escolhida e efetuar o c�lculo adequado. 
C�digo Condi��o de pagamento 
1 � vista em dinheiro ou cheque, recebe 20% de desconto 
2 � vista no cart�o de cr�dito, recebe 15% de desconto 
3 Em duas vezes, pre�o normal de etiqueta sem juros 
4 Em tr�s vezes, pre�o normal de etiqueta mais juros de 10%
 */
