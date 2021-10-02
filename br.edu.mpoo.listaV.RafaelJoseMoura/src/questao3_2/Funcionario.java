package questao3_2;

public abstract class Funcionario {

	private String cpf;
	private String login;
	private double salario;
	private static final double salarioBase = 1000;
	
	public Funcionario(String cpf, String login) {
		this.cpf = cpf;
		this.login = login;
	}

	public abstract void calcularSalario();
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public static double getSalariobase() {
		return salarioBase;
	}

	@Override
	public String toString() {
		return "Funcionario [cpf=" + cpf + ", login=" + login + "]";
	}
}