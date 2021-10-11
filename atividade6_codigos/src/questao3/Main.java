package questao3;

public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("156.141.145-45", "Roberto", "(87) 9 99999-8888", "roberto@email.com");
		Cliente cliente1 = new Cliente("156.141.145-44", "Ana", "(87) 9 98742-8598", "ana@email.com");

		BaseDados.adicionarCliente(cliente);
		BaseDados.adicionarCliente(cliente1);

		Conta conta = new Conta(241, 100, "MinhaSenha123", cliente);

		Conta conta1 = new Conta(246, 500.00, "TenteAdvinhar", cliente1);
		Conta conta2 = new Conta(246, 2500.50, "Batata", cliente1);

	BaseDados.todasAsContas();
		
			Banco.deposito(Banco.saque(100, cliente.getContas().get(0)), cliente1.getContas().get(1));
			
			
			
			BaseDados.todasAsContas();


		}
	
}
