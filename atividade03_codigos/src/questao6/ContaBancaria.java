package questao6;

public class ContaBancaria {
	private int numerodaConta;
	private int agencia;
	private int banco;
	private int cpf;
	
	public ContaBancaria(int numerodaConta, int agencia, int banco, int cpf) {
		super();
		this.numerodaConta = numerodaConta;
		this.agencia = agencia;
		this.banco = banco;
		this.cpf = cpf;
	}

	
	public int getNumerodaConta() {
		return numerodaConta;
	}

	public void setNumerodaConta(int numerodaConta) {
		this.numerodaConta = numerodaConta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getBanco() {
		return banco;
	}

	public void setBanco(int banco) {
		this.banco = banco;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
}
