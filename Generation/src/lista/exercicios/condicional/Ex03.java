package lista.exercicios.condicional;
import java.util.Scanner;

public class Ex03 {
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int num;
			double raiz = 0, potencia = 0;
			System.out.println("Digite um númmero: ");
			num = sc.nextInt();
			
			if(num%2==0) {
				raiz = Math.sqrt(num);
				System.out.printf("O número %d é PAR e a Raiz quadrada é %.2f", num, raiz);
			}else {
				potencia = Math.pow(num, 2);
				System.out.printf("O número %d é IMPAR elevado² fica: %.1f ",num, potencia);
			}
		}
}
