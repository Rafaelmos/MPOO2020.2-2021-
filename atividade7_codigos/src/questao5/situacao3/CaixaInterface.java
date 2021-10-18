package questao5.situacao3;

public interface CaixaInterface {

	public default void realizarVenda(Produto produto) {
		if (BaseDados.isFuncionario(this)) {
			if (produto != null) {
				System.out.println("Venda realizada");
			}
			return;
		}
		System.out.println("Não é um Caixa cadastrado");
	}
}
