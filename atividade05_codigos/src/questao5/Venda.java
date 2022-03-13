package questao5;

public class Venda {
	private double valorTotal;
	private int mes;
	private int ano;

	public Venda(double valorTotal, int mes, int ano) {
		super();
		this.valorTotal = valorTotal;
		this.mes = mes;
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Venda [valorTotal=" + valorTotal + ", mes=" + mes + ", ano=" + ano + "]";
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

}
