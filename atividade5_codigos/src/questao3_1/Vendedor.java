package questao3_1;

public class Vendedor extends Funcionario{
	private double totalComissao;

	public Vendedor(String cpf, String login) {
		super(cpf, login);
	}

	public double getTotalVendas() {
		return totalComissao;
	}

	public void setTotalVendas(double totalVendas) {
		this.totalComissao = totalVendas;
	}

	@Override
	public String toString() {
		return "Vendedor [totalVendas=" + totalComissao + ", " + super.toString() + "]";
	}
}