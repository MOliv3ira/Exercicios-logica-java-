package lista.exercicios.repeticao;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int idade, sexo, cod, qtdPessoas = 0, calma = 0, mNervosa = 0, hAgressivo = 0, pcalma = 0, pNervosa = 0;

		while (qtdPessoas <= 5) {

			System.out.print("Digite sua idade: ");
			idade = sc.nextInt();
			System.out.print("Digite seu sexo, sendo 1 - Feminino e 2 - Masculino: ");
			sexo = sc.nextInt();

			System.out.print("\nDigite uma op��o entre 1 a 3.\n" + "\n1 - Voc� era uma pessoa calma? "
					+ "\n2 - Voc� era uma pessoa nervosa?" + "\n3 - Voc� era uma pessoa agressiva?" + "\nOp��o: \n");
			cod = sc.nextInt();

			

			if (cod == 1) {
				calma++;
			}  if ((cod == 3) && (sexo == 2)) {
				hAgressivo++;
			}  if ((cod == 2) && (sexo == 1)) {
				mNervosa++;
			}  if ((cod == 2) && (idade > 40)) {
				pNervosa++;
			}  if ((cod == 1) && (idade < 18)) {
				pcalma++;
			}
			
			qtdPessoas++;
		}
		System.out.println("o n�mero de pessoas calmas �:" + calma);
		System.out.println("o n�mero de mulheres nervosas �:" + mNervosa);
		System.out.println("o n�mero de homens agressivos �:" + hAgressivo);
		System.out.println("o n�mero de pessoas nervosas com mais de 40 anos:" + pNervosa);
		System.out.println("o n�mero de pessoas calmas com menos de 18 anos:" + pcalma);

	}

}

/*
 * 4-Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
 * psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
 * era perguntado: idade, sexo (1-feminino / 2-masculino), e as op��es (1, se a
 * pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva).
 * Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas,
 * calcule e mostre: (WHILE)
 *
 * � o n�mero de pessoas calmas; � o n�mero de mulheres nervosas; � o n�mero de
 * homens agressivos; � o n�mero de pessoas nervosas com mais de 40 anos; � o
 * n�mero de pessoas calmas com menos de 18 anos.
 */