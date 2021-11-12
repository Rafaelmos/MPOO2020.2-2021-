package questao6;

import java.util.Date;

public class Produto {
	private String nome;
	private double preco;
	private double precoPromocional;
	Date validade;
	private String codBarras;
	private int quantidade;

/**
 * Construtor Produto(String nome, double preco, Date validade, String codBarras, int quantidade)
 * @see String, java.util.Date, String.
 * @param nome onde seria o nome do produto.
 * @param preco onde seria o preço do produto.
 * @param validade é uma data para definir a validade do produto
 * @param codBarras é uma String que define o id para localizar o produto mais facilmente
 * @param quantidade é quantidade de produto no estoque.
 * */	
	public Produto(String nome, double preco, Date validade, String codBarras, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.precoPromocional = preco;
		this.validade = validade;
		this.codBarras = codBarras;
		this.quantidade = quantidade;
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
	public double getPrecoPromocional() {
		return precoPromocional;
	}
	public void setPrecoPromocional(double precoPromocional) {
		this.precoPromocional = precoPromocional;
	}
	public Date getValidade() {
		return validade;
	}
	public void setValidade(Date validade) {
		this.validade = validade;
	}
	public String getCodBarras() {
		return codBarras;
	}
	public void setCodBarras(String codBarras) {
		this.codBarras = codBarras;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}