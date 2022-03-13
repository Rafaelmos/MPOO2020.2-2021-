package questao3_2;

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
		calcularSalario();
		return "Vendedor [totalVendas=" + totalComissao + ", cpf= " + getCpf() +", login= "+ getLogin()+", salario="+getSalario()+"]";
	}

	@Override
	public void calcularSalario() {
		setSalario(getSalariobase()+totalComissao);
	}
}