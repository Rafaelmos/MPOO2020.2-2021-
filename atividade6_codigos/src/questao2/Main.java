package questao2;

public class Main {

	public static void main(String[] args) {
		Endereco endereco1 = new Endereco("Rua dos Cactos", 100, "Cactolândia", "Serra Talhada", "PE", "56970-00");
		Endereco endereco2 = new Endereco("Av. Gregório Ferraz Nogueira", 20, "José Tomé de Souza Ramos",
				"Serra Talhada", "PE", "56909-535");

		Cliente cliente1 = new Cliente("156.141.145-45", "(87) 9 9999-8888", "Roberto", "roberto@email.com", "M");

		Cliente cliente2 = new Cliente("156.141.145-44", "(87) 9 98742-8598", "Ana", "ana@email.com", "F");

		BaseDados.adicionarCliente(cliente1);
		BaseDados.adicionarCliente(cliente2);
//		BaseDados.atualizarCliente(cliente1, cliente2);
//		BaseDados.buscarCliente(cliente1);
//		System.out.println(BaseDados.buscarCliente("156.141.145-44"));
//		System.out.println(BaseDados.isCliente(cliente2));

		BaseEnderecos.adicionarEndereco(cliente1, endereco1);
		BaseEnderecos.adicionarEndereco(cliente1, endereco2);
		BaseEnderecos.adicionarEndereco(cliente2, endereco2);
//		BaseEnderecos.removerEndereco(cliente2, endereco2);
//		BaseEnderecos.atualizarEndereco(cliente1, endereco1, endereco2);
//		System.out.println(cliente2.getEnderecos());

		for (Cliente c : BaseDados.getClientes()) {
			System.out.println(c);
		}

	}

}
