package questao5_2.model;

import java.util.Date;

import questao5_2.controller.ConversorData;

public class Produto {
	private int id;
	private String nome;
	private double preco;
	private Date validade;

	public Produto(int id, String nome, double preco, String validade) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.validade = ConversorData.formatarData(validade);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

}
