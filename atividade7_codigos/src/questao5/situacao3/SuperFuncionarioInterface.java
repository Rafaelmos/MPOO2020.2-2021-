package questao5.situacao3;

public interface SuperFuncionarioInterface extends CaixaInterface, GerenteInterface {

	public default void contratarFuncionarios(Object fucionario) {
		if (BaseDados.isFuncionario(this)) {
			BaseDados.createFuncionario(fucionario);
			return;
		}
		System.out.println("Não é um SuperFuncionario cadastrado");
	}

	public default void demitirFuncionario(Object fucionario) {
		if (BaseDados.isFuncionario(this)) {
			BaseDados.deleteFuncionario(fucionario);
			return;
		}
		System.out.println("Não é um SuperFuncionario cadastrado");
	}

}
