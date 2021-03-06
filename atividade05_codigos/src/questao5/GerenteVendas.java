package questao5;

public class GerenteVendas extends Gerente {
	private String senha;

	public GerenteVendas(String nome, String cpf, String matricula, String senha) {
		super(nome, cpf, matricula);
		this.senha = senha;
	}

	@Override
	public double darDesconto(Produto produto) {
		double desconto = 0.10 * produto.getPreco() * produto.getQuantidade();
		Mensagem.exibirMensagem(desconto);
		return desconto;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
