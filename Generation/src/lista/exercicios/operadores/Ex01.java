package lista.exercicios.operadores;
	
	import java.util.Scanner;

	public class Ex01 {
		
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int a, b, c; 
			double D, R, S;
			
			System.out.println("Digite o valor de A: ");
			a = sc.nextInt();
			System.out.println("Digite o valor de B: ");
			b = sc.nextInt();
			System.out.println("Digite o valor de C: ");
			c = sc.nextInt();
			
			R = Math.pow(a+b, 2);
			S = Math.pow(b+c, 2);
			D = (R+S)/2;
			
			System.out.printf("\nO resultado calculado é %.2f \n", D);
		}
	}
