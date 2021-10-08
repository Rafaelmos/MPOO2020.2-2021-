package questao1;

public class Main {

	public static void main(String[] args) {
		Endereco endereco1 = new Endereco("Rua dos Cactos", 100, "Cactol�ndia", "Serra Talhada", "PE", "56970-00");
		Endereco endereco2 = new Endereco("Av. Greg�rio Ferraz Nogueira", 20, "Jos� Tom� de Souza Ramos",
				"Serra Talhada", "PE", "56909-535");

		Cliente cliente1 = new Cliente("156.141.145-45", "(87) 9 9999-8888", "Roberto", "roberto@email.com", "M");
		cliente1.addEd(endereco1);

		Cliente cliente2 = new Cliente("156.141.145-44", "(87) 9 98742-8598", "Ana", "ana@email.com", "F");
		cliente2.addEd(endereco1);
		cliente2.addEd(endereco2);
//		cliente2.addEd(endereco2);

		Cliente cliente3 = new Cliente("156.141.145-45", "(87) 9 9999-9999", "Roberto Duplicado", "roberto@email.com",
				"M");
		cliente3.addEd(endereco2);

		BaseDados.adicionarCliente(cliente1);
//		BaseDados.adicionarCliente(cliente1);
//		BaseDados.adicionarCliente(cliente3);

//		BaseDados.adicionarCliente(cliente2);

//		System.out.println(BaseDados.isCliente(cliente1));
//		System.out.println(BaseDados.isCliente(cliente2));

//		System.out.println(BaseDados.getClientes());

//		BaseDados.atualizarCliente(cliente1, cliente2);

//		System.out.println(BaseDados.getClientes());

	}

}