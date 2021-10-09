package questao1;

public class Main {

	public static void main(String[] args) {
		Endereco endereco1 = new Endereco("Rua dos Cactos", 100, "Cactolândia", "Serra Talhada", "PE", "56970-00");
		Endereco endereco2 = new Endereco("Av. Gregório Ferraz Nogueira", 20, "José Tomé de Souza Ramos",
				"Serra Talhada", "PE", "56909-535");

		Cliente cliente1 = new Cliente("156.141.145-45", "(87) 9 99999-8888", "Roberto", "roberto@email.com", "M");
		cliente1.addEd(endereco1);

		Cliente cliente2 = new Cliente("156.141.145-44", "(87) 9 98742-8598", "Ana", "ana@email.com", "F");
		cliente2.addEd(endereco1);
		cliente2.addEd(endereco2);

		BaseDados.adicionarCliente(cliente1);
		BaseDados.adicionarCliente(cliente2);

		for (Cliente c : BaseDados.getClientes()) {
			System.out.println(c);
		}
	}

}
