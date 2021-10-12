package questao3;

public class Banco {

	public static double saque(double valor, Conta ContaSaque) {
		for (Cliente cliente : BaseDados.getClientes()) {
			for (Conta conta : cliente.getContas()) {
				if (ContaSaque.equals(conta)) {
					conta.setSaldo(conta.getSaldo() - valor);
					return valor;
				}
			}
		}
		return 0;
	}

	public static double deposito(double valor, Conta ContaDeposito) {
		for (Cliente cliente : BaseDados.getClientes()) {		
			for (Conta conta : cliente.getContas()) {
				if (ContaDeposito.equals(conta)) {
					conta.setSaldo(conta.getSaldo() + valor);
					return conta.getSaldo();
				}
			}
		}
		return 0;
	}

}
