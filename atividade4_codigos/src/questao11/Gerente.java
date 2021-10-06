package questao11;

public abstract class Gerente extends Funcionario {

	public Gerente(String nome, String cpf, String matricula) {
		super(nome, cpf, matricula);
	}
	
	public abstract double darDesconto(Produto produto);
	
}
