package questao5;

import java.util.ArrayList;
import java.util.Date;

public class Compra {
	private int id;
	private Date date;
	private ArrayList<Produto> produtos;
	private	double desconto;
	private double valorTotal;
	
	@Override
	public String toString() {
		return "Compra [id=" + id + ", date=" + date + ", produtos=" + produtos + ", desconto=" + desconto
				+ ", valorTotal=" + valorTotal + "]";
	}
}
