package questao11;

public class Cliente {
	private String nome;
	private String cpf;
	private boolean pedirDesconto; 
	
	
	public Cliente(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
	
	
	public boolean pedirDesconto(boolean pedirD) {
		pedirDesconto = pedirD;
		return pedirDesconto;
	}
	

}
