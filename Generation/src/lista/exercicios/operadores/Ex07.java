package lista.exercicios.operadores;
import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			double a, b, c, d, e, f, X, Y;
			
			System.out.print("Informe o valor de A: ");
			a = sc.nextDouble();
			System.out.print("Informe o valor de B: ");
			b = sc.nextDouble();
			System.out.print("Informe o valor de C: ");
			c = sc.nextDouble();
			System.out.print("Informe o valor de D: ");
			d = sc.nextDouble();
			System.out.print("Informe o valor de E: ");
			e = sc.nextDouble();
			System.out.print("Informe o valor de F: ");
			f = sc.nextDouble();
			
			X = ((c*e - b*f)/(a*e - b*d)); 
			Y = ((a*f - c*d)/(a*e - b*d));
			
			System.out.printf("\nOs valores de X e Y são: X = %.2f e Y = %.2f", X,Y);
		
		}
	}