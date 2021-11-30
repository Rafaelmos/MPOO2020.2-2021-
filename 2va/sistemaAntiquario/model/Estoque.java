package model;

public class Estoque {
	private int quantidade;

	public Estoque(int quantidade, Produto produto) {
		super();
		this.quantidade = quantidade;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
