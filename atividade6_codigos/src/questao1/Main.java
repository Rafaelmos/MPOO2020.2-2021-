package questao1;

public class Main {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("156.141.145-45", "(87) 9 99999-8888", "Roberto", "roberto@email.com", "M");
		cliente1.addEd("Rua dos Cactos", 100, "Cactolândia", "Serra Talhada", "PE", "56970-00");

		Cliente cliente2 = new Cliente("156.141.145-44", "(87) 9 98742-8598", "Ana", "ana@email.com", "F");
		cliente2.addEd("Rua dos Cactos", 100, "Cactolândia", "Serra Talhada", "PE", "56970-00");
		cliente2.addEd("Av. Gregório Ferraz Nogueira", 20, "José Tomé de Souza Ramos", "Serra Talhada", "PE",
				"56909-535");

		BaseDados.adicionarCliente(cliente1);
		BaseDados.adicionarCliente(cliente2);
//		BaseDados.removerCliente(cliente2);
//		BaseDados.atualizarCliente(cliente1, cliente2);
//		BaseDados.buscarCliente(cliente1);
//		System.out.println(BaseDados.buscarCliente("156.141.145-44"));
//		System.out.println(BaseDados.isCliente(cliente2));

		for (Cliente c : BaseDados.getClientes()) {
			System.out.println(c);
		}
	}

}
