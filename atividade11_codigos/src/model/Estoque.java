package model;

public class Estoque {
	private int quantidade;

	public Estoque(Produto produto) {
		super();
		this.quantidade = produto.getQuantidade();
	}

	@Override
	public String toString() {
		return "Estoque [quantidade=" + quantidade + "]";
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
