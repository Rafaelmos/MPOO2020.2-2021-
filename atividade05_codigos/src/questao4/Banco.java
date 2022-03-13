package questao4;

public class Banco {

	public void transferir(Conta origem, Conta destino, double valor) {
		if (autenticarTransferencia(origem, destino, valor)) {
			origem.setSaldo(origem.getSaldo() - valor);
			destino.setSaldo(destino.getSaldo() + valor);
			System.out.println("Transferiu");
		} else {
			System.out.println("Valor do saldo insuficiente");
		}
	}

	private boolean autenticarTransferencia(Conta origem, Conta destino, double valor) {
		boolean autenticador;
		if (origem.getSaldo() - valor >= 0) {
			autenticador = true;
			return autenticador;
		}
		autenticador = false;
		return autenticador;
	}
}
