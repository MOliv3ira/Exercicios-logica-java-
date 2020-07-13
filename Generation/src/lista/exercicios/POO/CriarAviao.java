package lista.exercicios.POO;

public class CriarAviao {
	public static void main(String[] args) {
		
		Aviao aviao1 = new Aviao("Gol", "727", "Laranja e Branco", "Grande");
		Aviao aviao2 = new Aviao("Tam", "PT-22", "Vermelho e Branco", "Pequeno");
		
		System.out.println("Empresa: "+aviao1.getEmpresa());
		System.out.println("Modelo aeronave: "+aviao1.getModelo());
		System.out.println("Cores da empresa: "+ aviao1.getCor());
		System.out.println("Tamanho da aeronave: "+ aviao1.getTamanho());
		
		System.out.println();
		
		System.out.println("Empresa: "+aviao2.getEmpresa());
		System.out.println("Modelo aeronave: "+aviao2.getModelo());
		System.out.println("Cores da empresa: "+ aviao2.getCor());
		System.out.println("Tamanho da aeronave: "+ aviao2.getTamanho());
	}

}
