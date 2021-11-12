package questao5.situacao3;

public class Gerente extends Funcionario implements GerenteInterface {

	public Gerente(String nome, String sobrenome, String cpf) {
		super(nome, sobrenome, cpf);
	}

	@Override
	public String toString() {
		return "Gerente [" + super.toString() + "]";
	}

}
