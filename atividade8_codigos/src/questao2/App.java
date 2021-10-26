package questao2;

public class App {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Jose", "111.111.111-11");
		Cliente cliente1 = new Cliente("Maria", "222.222.222-22");

		new Conta(1, 0, "123", cliente);
		new Conta(1, 100, "jose123", cliente);

		new Conta(1, 1000, "Maria222", cliente1);

		BaseDados.addUsuario(cliente);
		BaseDados.addUsuario(cliente1);

		Banco.transferir(100, cliente1.getContas().get(0), cliente.getContas().get(0));

		System.out.println(BaseDados.getUsuarios());
	}

}
