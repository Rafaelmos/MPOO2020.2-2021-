package model;

public abstract class Produto {
	private Estoque estoque;
	private String codBarras;
	private double preco;
	private double precoPromocional;

	public Produto(String codBarras, double preco, double precoPromocional, int quantidade) {
		super();
		this.estoque = new Estoque(quantidade, this);
		this.codBarras = codBarras;
		this.preco = preco;
		this.precoPromocional = precoPromocional;
	}

	public Estoque getEstoque() {
		return estoque;
	}

	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}

	public String getCodBarras() {
		return codBarras;
	}

	public void setCodBarras(String codBarras) {
		this.codBarras = codBarras;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPrecoPromocional() {
		return precoPromocional;
	}

	public void setPrecoPromocional(double precoPromocional) {
		this.precoPromocional = precoPromocional;
	}

	
}
