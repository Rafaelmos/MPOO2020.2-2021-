package model;

import java.util.Date;

public class Produto {
	private String nome, codBarras;
	private double preco, precoPromocional;
	private Date validade;
	private int quantidade;
	
	public Produto(String nome, String codBarras, double preco, double precoPromocional, Date validade,
			int quantidade) {
		super();
		this.nome = nome;
		this.codBarras = codBarras;
		this.preco = preco;
		this.precoPromocional = precoPromocional;
		this.validade = validade;
		this.quantidade = quantidade;
	}

	
	
}