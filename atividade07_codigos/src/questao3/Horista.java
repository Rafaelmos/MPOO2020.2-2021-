package questao3;

public class Horista extends Empregado {
	private double precoHora;
	private double horasTrabalhadas;

	public Horista(String nome, String cpf, double salario, double precoHora, double horasTrabalhadas) {
		super(nome, cpf, salario);
		this.precoHora = precoHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}

	@Override
	public double calcularPagamento() {
		this.setSalario(this.getHorasTrabalhadas() * this.getPrecoHora());
		return this.getSalario();
	}

	@Override
	public String toString() {
		return super.toString() + " Horista [precoHora=" + precoHora + ", horasTrabalhadas=" + horasTrabalhadas + "]";
	}

	public double getPrecoHora() {
		return precoHora;
	}

	public void setPrecoHora(double precoHora) {
		this.precoHora = precoHora;
	}

	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

}
