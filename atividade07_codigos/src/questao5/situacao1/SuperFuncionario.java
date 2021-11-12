package questao5.situacao1;

public interface SuperFuncionario extends Caixa, Gerente {

	public void contratarFuncionarios(Funcionario fucionario);

	public void demitirFuncionario(Funcionario fucionario);

}
