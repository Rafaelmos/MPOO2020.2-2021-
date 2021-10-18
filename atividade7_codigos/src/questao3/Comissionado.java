package questao3;

public class Comissionado extends Empregado {
	private double totalVendas;
	private double taxaComissao;

	public Comissionado(String nome, String cpf, double salario, double totalVendas, double taxaComissao) {
		super(nome, cpf, salario);
		this.totalVendas = totalVendas;
		this.taxaComissao = taxaComissao;
	}

	@Override
	public double calcularPagamento() {
		this.setSalario(this.taxaComissao * this.totalVendas);
		return this.getSalario();
	}

	public void somarVendas(double valor) {
		this.setTotalVendas(this.getTotalVendas() + valor);
	}

	@Override
	public String toString() {
		return super.toString() + " Comissionado [totalVendas=" + totalVendas + ", taxaComissao=" + taxaComissao + "]";
	}

	public double getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}

	public double getTaxaComissao() {
		return taxaComissao;
	}

	public void setTaxaComissao(double taxaComissao) {
		this.taxaComissao = taxaComissao;
	}

}
