package lista.exercicios.POO;

public class Aviao {
	
	private String empresa;
	private String modelo;
	private String cor;
	private String tamanho;
	
	public Aviao(String empresaA, String modeloA, String corA, String tamanhoA) {
		
		empresa = empresaA;
		modelo = modeloA;
		cor = corA;
		tamanho = tamanhoA;
	}
	
	public String getEmpresa() {
		
		String empresaAviao = empresa;
		
		return empresaAviao;
	}
	
	public String getModelo() {
		
		String modeloAviao = modelo;
		
		return modeloAviao;
	}
	public String getCor() {
		
		String corAviao = cor;
		
		return corAviao;
	}
	public String getTamanho() {
		
		String tamanhoAviao = tamanho;
		
		return tamanhoAviao;
	}

}
