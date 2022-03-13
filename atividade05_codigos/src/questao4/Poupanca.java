package questao4;

public class Poupanca  extends Conta{
	
	private static final int dv = 1;
	
	public Poupanca(double saldo) {
		super(saldo);
	}

	public static int getDv() {
		return dv;
	}
	
	public void renderJuros(double taxa) {}
}
