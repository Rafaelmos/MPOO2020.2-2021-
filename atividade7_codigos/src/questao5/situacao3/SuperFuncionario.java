package questao5.situacao3;

public class SuperFuncionario extends Funcionario implements SuperFuncionarioInterface {

	public SuperFuncionario(String nome, String sobrenome, String cpf) {
		super(nome, sobrenome, cpf);
	}

	@Override
	public String toString() {
		return "SuperFuncionario [" +super.toString() +"]";
	}
}
