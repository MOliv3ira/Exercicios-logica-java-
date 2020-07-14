package lista.exercicios.POO;

public class Conta {
	
	 double saldo;
	 int agencia;
	 int numero;
	 String titular;
	
	public Conta() {
		
	}

	public void deposita(double valor) {
		
		this.saldo = this.saldo + valor;
	}
	
	public boolean saca(double valor) {
		
		if(this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            System.out.println("Operação concluída!");
            return true;
        } else { 
        	System.out.println("Saldo insuficiente!");
            return false;
        }
    }
}
