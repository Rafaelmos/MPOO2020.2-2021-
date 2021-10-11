package questao3;

public class Conta {
	private int agencia, numero;
	private double saldo;
	private String senha;
	private static int cont = 0;

	public Conta(int agencia, double saldo, String senha, Cliente cliente) {

		for (Conta c : cliente.getContas()) {
			if (c.getAgencia() == agencia && c.getNumero() == numero || c.equals(cliente)) {
				System.out.println("Conta existe nesse cliente ou numeros duplicados");

				return;
			}
		}
		cliente.getContas().add(new Conta(agencia, saldo, senha));

		return;

	}

	private Conta(int agencia, double saldo, String senha) {
		super();
		cont++;
		this.agencia = agencia;
		this.numero = cont;
		this.saldo = saldo;
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Conta [agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + "]";
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
