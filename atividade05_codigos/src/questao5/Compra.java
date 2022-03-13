package questao5;

import java.util.ArrayList;
import java.util.Date;

public class Compra {
	private int id;
	private Date date;
	private ArrayList<Produto> produtos = new ArrayList<Produto>();
	private double desconto;
	private double valorTotal;

	public Compra(int id, Date date, double desconto, double valorTotal) {
		super();
		this.id = id;
		this.date = date;
		this.desconto = desconto;
		this.valorTotal = valorTotal;
	}

	
	@Override
	public String toString() {
		return "Compra [id=" + id + ", date=" + date + ", produtos=" + produtos + ", desconto=" + desconto
				+ ", valorTotal=" + valorTotal + "]";
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
}
