package model;

public class Item {
	private String codBarras;
	private String nome;
	private double preco;

	public Item(String codBarras, String nome, double preco) {
		super();
		this.codBarras = codBarras;
		this.nome = nome;
		this.preco = preco;
	}

	public String getCodBarras() {
		return codBarras;
	}

	public void setCodBarras(String codBarras) {
		this.codBarras = codBarras;
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
