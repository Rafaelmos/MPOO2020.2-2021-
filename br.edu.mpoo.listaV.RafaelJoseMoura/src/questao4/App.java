package questao4;

public class App {

	public static void main(String[] args) {
		Conta c1 = new Corrente(500);
		Conta c2 = new Poupanca(800);

		Banco banco = new Banco();
		
		banco.transferir(c1, c2, 0);
	}
}
