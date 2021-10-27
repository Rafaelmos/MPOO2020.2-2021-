package questao2;

public class Banco {
	public static boolean transferir(double valor, Conta contaOrigem, Conta contaDestino) {
		try {
			if (sacar(valor, contaOrigem)) {
				if (depositar(valor, contaDestino)) {
					return true;
				} else {
					// Caso o deposio não seja feito dará uma exceção na conta destino
					throw new ContaException("destino");
				}
			} else {
				// Caso o saque não seja feito dará uma exceção na conta origem
				throw new ContaException("origem");
			}

		} catch (ContaException e) {
			e.printStackTrace();

		} catch (OperacaoException e) {
			e.printStackTrace();
		}

		return false;

	}

	public static boolean validarConta(Conta conta) {
		if (conta == null) {
			return false;
		}
		for (Usuario usuario : BaseDados.getUsuarios()) {
			if (((Cliente) usuario).getContas().contains(conta)) {
				return true;
			}
		}
		return false;
	}

	public static boolean depositar(double valor, Conta conta) throws OperacaoException {
		if (validarConta(conta) && valor > 0) {
			conta.setSaldo(conta.getSaldo() + valor);
			return true;
		}
		// Se o deposito não for efetuado, ocorrerá uma exceção no deposito
		throw new OperacaoException("Erro ao efetuar o deposito");
	}

	public static boolean sacar(double valor, Conta conta) throws OperacaoException {
		if (validarConta(conta)) {
			if (conta.getSaldo() >= valor) {
				conta.setSaldo(conta.getSaldo() - valor);
				return true;
			}
			// Se o saque não for efetuado, ocorrerá uma exceção no saque
			throw new OperacaoException("Erro ao efetuar o saque");

		}
		// Se o saque não for efetuado, ocorrerá uma exceção no saque
		throw new OperacaoException("Erro ao efetuar o saque");

	}

}
