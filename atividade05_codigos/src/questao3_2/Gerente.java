package questao3_2;

public class Gerente extends Funcionario{

	public Gerente(String cpf, String login) {
		super(cpf, login);
	}

	@Override
	public String toString() {
		calcularSalario();
		return "Gerente [cpf= " + getCpf() +", login= "+ getLogin()+", salario="+getSalario()+"]";
	}

	@Override
	public void calcularSalario() {
		setSalario(getSalariobase()*5);
	}	
}
