package questao5.situacao3;

public class Caixa extends Funcionario implements CaixaInterface {

	public Caixa(String nome, String sobrenome, String cpf) {
		super(nome, sobrenome, cpf);
	}

	@Override
	public String toString() {
		return "Caixa [" +super.toString() +"]";
	}

	

}
