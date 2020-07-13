package lista.exercicios.POO;

public class Cliente {
	
	private String nome;
	private String sexo;
	private int idade;
	
	public Cliente(String nomeC, int idadeC, String sexoC) {
		
		nome = nomeC;
		idade = idadeC;
		sexo = sexoC;
	}
	
	 public String getNomeCli() {
		
		String nomeCli = nome;
		
		return nomeCli;
	}
	public int getIdadeCli() {
		
		int idadeCli = idade;
		
		return idadeCli;
	}
	public String getSexo() {
		
		String sexoCli = sexo;
		
		return sexoCli;
	} 
}
