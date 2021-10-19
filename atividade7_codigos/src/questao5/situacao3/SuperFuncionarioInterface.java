package questao5.situacao3;

public interface SuperFuncionarioInterface extends CaixaInterface, GerenteInterface {

	public default void contratarFuncionarios(Funcionario fucionario) {
		if (BaseDados.isFuncionario((Funcionario) this)) {
			BaseDados.createFuncionario(fucionario);
			return;
		}
		System.out.println("N�o � um SuperFuncionario cadastrado");
	}

	public default void demitirFuncionario(Funcionario fucionario) {
		if (BaseDados.isFuncionario((Funcionario) this)) {
			BaseDados.deleteFuncionario(fucionario);
			return;
		}
		System.out.println("N�o � um SuperFuncionario cadastrado");
	}

}
