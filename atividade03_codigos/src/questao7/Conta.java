package questao7;

public class Conta {
	private int num;
	private double saldo;
	
	public Conta(int num, double saldo) {
		super();
		this.num = num;
		this.setSaldo(saldo);
	}

	public void debito(double valor) {
		this.setSaldo(this.getSaldo() - valor);
	}
	
	public void credito(double valor) {
		this.setSaldo(this.getSaldo() + valor);
	}
	
	@Override
	public String toString() {
		return "Conta [num=" + num + ", saldo=" + saldo + "]";
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
