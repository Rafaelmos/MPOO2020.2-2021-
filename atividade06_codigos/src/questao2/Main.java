package questao2;

public class Main {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("105.839.137-25", "(87) 9 91151-8168", "Roberto", "roberto@email.com", "M");

		Cliente cliente2 = new Cliente("047.583.668-53", "(87) 9 98322-8789", "Patricia", "patricia@email.com", "F");

		new Endereco("Rua dos Cactos", 100, "Cactolândia", "Serra Talhada", "PE", "56970-00", cliente1);

		new Endereco("Rua dos Cactos", 100, "Cactolândia", "Serra Talhada", "PE", "56970-00", cliente2);

		new Endereco("Av. Gregório Ferraz Nogueira", 20, "José Tomé de Souza Ramos", "Serra Talhada", "PE", "56909-535",
				cliente2);

//		Endereco endereco = new Endereco("Av. Gregório Ferraz Nogueira", 20, "José Tomé de Souza Ramos",
//				"Serra Talhada", "PE", "56909-535");

		BaseDados.adicionarCliente(cliente1);
		BaseDados.adicionarCliente(cliente2);
//		BaseDados.atualizarCliente(cliente1, cliente2);
//		BaseDados.buscarCliente(cliente1);
//		System.out.println(BaseDados.buscarCliente("156.141.145-44"));
//		System.out.println(BaseDados.isCliente(cliente2));

		// BaseEnderecos.adicionarEndereco(cliente1,
		// BaseEnderecos.buscarEndereco(cliente2, endereco));
//		BaseEnderecos.adicionarEndereco(cliente1, endereco);
//		BaseEnderecos.adicionarEndereco(cliente2, endereco);
//		BaseEnderecos.adicionarEndereco(cliente2, endereco);

//		BaseEnderecos.removerEndereco(cliente2, endereco2);
//		BaseEnderecos.atualizarEndereco(cliente1, endereco1, endereco2);
//		System.out.println(cliente2.getEnderecos());

		for (Cliente c : BaseDados.getClientes()) {
			System.out.println(c);
		}

	}

}
