package questao5.situacao3;

public interface GerenteInterface {

	public default void darDesconto(Produto produto, double desconto) {
		if (BaseDados.isFuncionario((Funcionario) this)) {
			if (produto != null) {
				desconto = produto.getPreco() - (produto.getPreco() * desconto / 100);
				return;
			}
		}

		System.out.println("Não é um Gerente cadastrado");

	}
}