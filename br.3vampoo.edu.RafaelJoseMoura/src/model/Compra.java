package model;

import java.util.ArrayList;

public class Compra {
	private int numero;
	private double valor;
	private Funcionario funcionarioResponsavel;
	private ArrayList<Item> itens = new ArrayList<>();
	private static int numeroUltimaCompra;

	public Compra(Funcionario funcionarioResponsavel) {
		super();
		numeroUltimaCompra++;
		this.numero = numeroUltimaCompra;
		this.funcionarioResponsavel = funcionarioResponsavel;
	}

	public boolean adicionarItem(Item item) throws ItemException {
		if (item == null) {
			throw new ItemException(Constante.ITEM_NULL);
		}

		this.itens.add(item);
		this.valor += item.getPreco();
		return true;
	}

	public int getNumero() {
		return numero;
	}

	public double getValor() {
		return valor;
	}

	public Funcionario getFuncionarioResponsavel() {
		return funcionarioResponsavel;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
