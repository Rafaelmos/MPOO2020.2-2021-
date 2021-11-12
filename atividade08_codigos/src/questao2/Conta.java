package questao2;

public class Conta {
	private int agencia;
	private int numero;
	private double saldo;
	private String senha;
	private static int contador = 0;

	public Conta(int agencia, double saldo, String senha, Cliente cliente) {
		super();
		cliente.getContas().add(new Conta(agencia, saldo, senha));
	}

	private Conta(int agencia, double saldo, String senha) {
		super();
		contador++;
		this.agencia = agencia;
		this.numero = contador;
		this.saldo = saldo;
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Conta [agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + ", senha=" + senha + "]";
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

}
