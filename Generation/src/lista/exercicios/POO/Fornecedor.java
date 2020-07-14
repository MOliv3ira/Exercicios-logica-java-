package lista.exercicios.POO;

public class Fornecedor extends Pessoa{
	
	private double valorCredito;
	private double valorDivida;
	
	/*public Fornecedor() {
		
	}*/
	
	public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
		super(nome, endereco, telefone);
		this.setValorCredito(valorCredito);
		this.setValorDivida(valorDivida);
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public void obterSaldo() {
		
		double diferenca = this.valorCredito - this.valorDivida;
		System.out.printf("O valor da diferen�a entres os valores � R$ %.2f ",diferenca);
	}
	
	/*public double obterSaldo(double valorC, double valorD) {
		
		double diferenca = this.valorCredito - this.valorDivida;
		
		return diferenca;
	}*/
}
