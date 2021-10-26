package questao2;

public class Banco {
	public static boolean transferir(double valor, Conta contaOrigem, Conta contaDestino) {
		try {
			if (sacar(valor, contaOrigem) && depositar(valor, contaDestino)) {

			}
		} catch (ContaException e) {
			e.printStackTrace();
		}

		return false;

	}

	public static boolean validarConta(Conta conta, String tipo) throws ContaException {
		if (conta == null) {
			throw new ContaException(tipo);
		}
		for (Usuario usuario : BaseDados.getUsuarios()) {
			if (((Cliente) usuario).getContas().contains(conta)) {
				return true;
			}
		}
		throw new ContaException(tipo);
	}

	public static boolean depositar(double valor, Conta conta) throws ContaException {

		try {
			if (validarConta(conta, "destino")) {
				conta.setSaldo(conta.getSaldo() + valor);
				return true;
			}
		} catch (ContaException e) {
			throw new ContaException("destino");
		}

		throw new ContaException("destino");

	}

	public static boolean sacar(double valor, Conta conta) throws ContaException {
		try {
			if (validarConta(conta, "origem")) {
				if (conta.getSaldo() >= valor) {
					conta.setSaldo(conta.getSaldo() - valor);
					return true;
				}

			}
		} catch (ContaException e) {
			e.printStackTrace();
		}

		throw new ContaException("origem");

	}
}
