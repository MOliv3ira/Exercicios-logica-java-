package lista.exercicios.condicional;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double peso, altura, imc = 0;

		System.out.print("Informe seu peso: ");
		peso = sc.nextDouble();

		System.out.print("Informe sua altura: ");
		altura = sc.nextDouble();

		imc = peso / Math.pow(altura, 2);

		if (imc < 18.5) {
			System.out.print("\n\t\tALERTA!\n\t\tAbaixo do peso.");
		} else if ((imc >= 18.5) && (imc <= 25)) {
			System.out.print("\n\t\tPARAB�NS!\n\t\tPeso normal.");
		} else if ((imc > 25) && (imc <= 30)) {
			System.out.print("\n\t\tALERTA!\n\t\tAcima do pedo.");
		} else {
			System.out.print("\n\t\tPERIGO!\n\t\tObeso...");
		}
	}
}

/*O IMC � �ndice de Massa Corporal � um crit�rio da Organiza��o Mundial de Sa�de para dar uma indica��o sobre 
 * a condi��o de peso de uma pessoa adulta. A f�rmula � IMC = peso / ( altura )2 
Elabore um programa que leia o peso e a altura de um adulto e mostre sua condi��o de acordo com a tabela abaixo. 
IMC em adultos Condi��o 
Abaixo de 18,5 Abaixo do peso 
Entre 18,5 e 25 Peso normal 
Entre 25 e 30 Acima do peso 
Acima de 30 obeso
 */