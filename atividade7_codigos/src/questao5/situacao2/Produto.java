package questao5.situacao2;

public class Produto {
	private double preco;
	private String nome;

	public Produto(double preco, String nome) {
		super();
		this.preco = preco;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
