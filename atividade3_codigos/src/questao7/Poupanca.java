package questao7;

public class Poupanca extends Conta {
	private static double taxa = 0.5;
	
	
	public Poupanca(int num, double saldo) {
		super(num, saldo);
	}

	public void debito(double valor) {
		this.setSaldo(this.getSaldo() - valor);
	}
	
	public void rendeJuros(){
		this.setSaldo(this.getSaldo() + getSaldo()*taxa/100);
	}
}
