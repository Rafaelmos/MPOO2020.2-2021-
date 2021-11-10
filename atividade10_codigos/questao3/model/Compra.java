package model;

import java.util.ArrayList;

public class Compra {
	private static int ultima;
	private int id;
	private Cliente cliente;
	private ArrayList<Produto> produtos = new ArrayList<>();
	private double valor;

	public Compra(int id, Cliente cliente, ArrayList<Produto> produtos, double valor) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.produtos = produtos;
		this.valor = valor;
	}

}
