package questao3;

public class Main {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("105.839.137-25", "(87) 9 91151-8168", "Roberto", "roberto@email.com");

		Cliente cliente2 = new Cliente("047.583.668-53", "(87) 9 98322-8789", "Patricia", "patricia@email.com");
		BaseDados.adicionarCliente(cliente1);
		BaseDados.adicionarCliente(cliente2);

		new Conta(241, 100, "MinhaSenha123", cliente1);
		new Conta(246, 500.00, "MinhaSenha456", cliente2);
		new Conta(246, 2500.50, "MinhaSenha789", cliente2);

		BaseDados.todasAsContas();

		Banco.deposito(Banco.saque(100, cliente1.getContas().get(0)), cliente2.getContas().get(1));

		BaseDados.todasAsContas();

	}

}
