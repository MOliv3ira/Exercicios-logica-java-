package lista.exercicios.POO;

public class CriarCliente {
	
	public static void main(String[] args) {
		
		Cliente primeiroCliente = new Cliente("Joaquim", 27, "Masculino");
		
		System.out.println("Nome do cliente: "+primeiroCliente.getNomeCli());
		System.out.println("Idade do cliente: "+primeiroCliente.getIdadeCli()+ " anos");
		System.out.println("Sexo: "+primeiroCliente.getSexo());
		
		System.out.println();
		
		Cliente segundoCliente = new Cliente("Juliana", 20, "Feminino");
		
		System.out.println("Nome do cliente: "+segundoCliente.getNomeCli());
		System.out.println("Idade do cliente: "+segundoCliente.getIdadeCli()+ " anos");
		System.out.println("Sexo: "+segundoCliente.getSexo());
	}
}
