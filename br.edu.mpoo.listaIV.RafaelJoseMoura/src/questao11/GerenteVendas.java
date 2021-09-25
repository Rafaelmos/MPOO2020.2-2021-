package questao11;

public class GerenteVendas extends Gerente {
	private String senha;
;

	public GerenteVendas(String nome, String cpf, String matricula, String senha) {
		super(nome, cpf, matricula);
		this.senha = senha;
	}

	@Override
	public double darDesconto(Produto produto) {
		//new Compra(produto, produto.getPreco(), true, 0);
		double desconto = 5;
		double valordesconto = produto.getPreco()*desconto/100;
		valordesconto = (valordesconto - produto.getPreco() * produto.getQuantidade());
		return valordesconto;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
