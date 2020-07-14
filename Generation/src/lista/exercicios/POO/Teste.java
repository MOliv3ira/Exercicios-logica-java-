package lista.exercicios.POO;

import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("\n");
		
		Pessoa felipe = new Pessoa("Felipe","Rua da Paz","977003344");
		System.out.println("Nome: "+felipe.getNome()
						+"\nEndereço: "+felipe.getEndereco()
						+"\nTelefone: "+felipe.getTelefone());
		
		System.out.println("\n");
		Fornecedor paulo = new Fornecedor("Paulo", "Rua Itu, 1.120 ", "911002255", 1000, 600);
		System.out.println("Nome: "+paulo.getNome()
						+"\nEndereço: "+paulo.getEndereco()
						+"\nTelefone: "+paulo.getTelefone());
		paulo.obterSaldo();
		
		System.out.println("\n");
		Empregado lucas = new Empregado("Lucas", "Rua Ângelo Romano, 186", "900886644", 001, 1500, 0.95);
		System.out.println("Nome: "+lucas.getNome()
						+"\nEndereço: "+lucas.getEndereco()
						+"\nTelefone: "+lucas.getTelefone()
						+"\nCódigo: "+lucas.getCodigoSetor()
						+"\nSalário: R$ "+lucas.getSalarioBase()
						+"\nImposto: "+lucas.getImposto());
						System.out.println("\n"+lucas.calcularSalario());
		
		System.out.println("\n");
		Administrador vinicius = new Administrador("Vinicius", "Rua Cruz e Souza, 3.100", "58932576", 100.00);
		System.out.println("Nome: "+vinicius.getNome()
						+"\nEndereço: "+vinicius.getEndereco()
						+"\nTelefone: "+vinicius.getTelefone()
						+"\nAjuda de custo: R$ "+vinicius.getAjudaDeCusto());
		
		System.out.println("\n");
		Operario pedro = new Operario("Pedro", "Rua Roberto Michellin, 95", "41497853", 500, 0.75);
		System.out.println("Nome: "+pedro.getNome()
						+"\nEndereço: "+pedro.getEndereco()
						+"\nTelefone: "+pedro.getTelefone()
						+"\nSalário base: "+pedro.getValorProducao()
						+"\nComissão: "+pedro.getComissao()
						+"\nValor final: "+pedro.valorFinal());
		
		System.out.println("\n");
		Vendedor rodrigo = new Vendedor("Rodrigo", "Av. Cavalheiro Paschoal Innecchi, 500", "956881025", 700, 0.85);
		System.out.println("Nome: "+rodrigo.getNome()
						+"\nEndereço: "+rodrigo.getEndereco()
						+"\nTelefone: "+rodrigo.getTelefone()
						+"\nSalário base: "+rodrigo.getValorVendas()
						+"\nComissão: "+rodrigo.getComissao()
						+"\nValor final: "+rodrigo.finalVendas());
				
		
	}

}
