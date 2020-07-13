package lista.exercicios.POO;

public class CriarConta {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		
		primeiraConta.deposita(400);
		
		boolean sacou = primeiraConta.saca(60); 
		
		System.out.println("Conta do Lucas:\n\tSaldo: "+primeiraConta.saldo+"\n\t "+sacou);
		
		System.out.println();
		
		Conta segundaConta = new Conta();
		
		segundaConta.deposita(100);
		
		boolean sacou1 = segundaConta.saca(200);
		
		System.out.println("Conta do Pedro:\n\tSaldo: "+segundaConta.saldo+"\n\t "+sacou1);
		
		
	}
	
}
