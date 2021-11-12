package questao3;

public class Banco {

	public static double saque(double valor, Conta contaSaque) {
		for (Cliente cliente : BaseDados.getClientes()) {
			for (Conta conta : cliente.getContas()) {
				if (contaSaque.equals(conta)) {
					if (contaSaque.getSaldo() < valor) {
						System.out.println("Erro ao efetuar o saque");
						return 0;
					}
					conta.setSaldo(conta.getSaldo() - valor);
					return valor;
				}
			}
		}
		System.out.println("Erro ao efetuar o saque");
		return 0;
	}

	public static double deposito(double valor, Conta contaDeposito) {
		for (Cliente cliente : BaseDados.getClientes()) {
			for (Conta conta : cliente.getContas()) {
				if (contaDeposito.equals(conta)) {
					conta.setSaldo(conta.getSaldo() + valor);
					return conta.getSaldo();
				}
			}
		}
		System.out.println("Erro ao efetuar o depósito");

		return 0;
	}

}
