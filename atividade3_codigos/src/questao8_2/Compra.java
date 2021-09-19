package questao8_2;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Compra {
	private double total;
	private ArrayList<String> nota = new ArrayList<>();
	private String descricao;

	public void totalizar(double somaPreco) {
		this.total += somaPreco;
	}

	public void registrar(Produto produto) {
		this.descricao = produto.getNome();
		totalizar(produto.getPreco());
		this.nota.add("Cod: " + produto.getCodigo() + "		Produto: " + this.descricao + "		" + produto.getPreco());
	}

	public void resumir(Funcionario funcionario) {
		System.out.println("			CUMPOM FISCAL\n");
		for (int i = 0; i < this.nota.size(); i++) {
			System.out.println(this.nota.get(i));
		}
		DecimalFormat decimalFormat = new DecimalFormat("0.00");
		System.out.println("\nTotal: " + decimalFormat.format(this.total) + "		Total com Desconto: " + decimalFormat.format(funcionario.darDesconto(this.total)));

	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
}