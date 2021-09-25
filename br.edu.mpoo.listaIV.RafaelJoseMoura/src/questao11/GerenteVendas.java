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
		double desconto = 5;
		double valordesconto = produto.getPreco()*desconto/100;
		return valordesconto;
	}
	
	public boolean aprovarDesconto(boolean resposta) {
		return resposta;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
