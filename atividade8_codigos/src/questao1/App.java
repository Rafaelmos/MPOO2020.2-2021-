package questao1;

public class App {

	public static void main(String[] args) {

		BaseDados.inicializarBase();

		try {
			Cliente cliente = new Cliente("Rafael", "04673392442");
			Cliente cliente1 = new Cliente("Roberto", "11111111111");
			Cliente cliente2 = null;
			BaseDados.adicionarCliente(cliente);
			// BaseDados.adicionarCliente(cliente);
			BaseDados.adicionarCliente(cliente1);
			BaseDados.adicionarCliente(cliente2);

		} catch (ClienteException e) {
			e.printStackTrace();
		}

		BaseDados.getClientes();
	}
}
