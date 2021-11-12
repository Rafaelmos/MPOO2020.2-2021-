package questao1;

import java.util.ArrayList;

public class BaseDados {
	private static ArrayList<Cliente> clientes;
	private static final String CLIENTE_NULL = "Erro ao adicionar o cliente dados inválidos";
	private static final String CLIENTE_EXISTE = "Erro ao adicionar o cliente: já existe na base";

	public static void inicializarBase() {
		System.out.println("Base Inicializada");
		clientes = new ArrayList<Cliente>();
	}

	public static Cliente buscarCliente(Cliente cliente) {
		if (isCliente(cliente)) {
			return cliente;
		}
		return null;
	}

	public static Cliente buscarCliente(String cpf) {
		for (Cliente cliente : clientes) {
			if (cliente.getCpf().equals(cpf)) {
				return cliente;
			}
		}
		return null;
	}

	public static boolean isCliente(Cliente cliente) {
		return clientes.contains(cliente);
	}

	public static boolean adicionarCliente(Cliente cliente) throws ClienteException {
		if (cliente == null || cliente.getNome() == null || cliente.getNome().equals("")) {
			throw new ClienteException(CLIENTE_NULL);
		} else if (buscarCliente(cliente) != null || buscarCliente(cliente.getCpf()) != null) {
			throw new ClienteException(CLIENTE_EXISTE);
		}
		try {
			if (Validador.validarCPF(cliente.getCpf())) {
				clientes.add(cliente);
				Mensagem.exibirMensagem("Cliente adicionado com sucesso");
			}
		} catch (CPFException e) {
			e.printStackTrace();
		}
		return false;
	}

	public static ArrayList<Cliente> getClientes() {
		return clientes;
	}

}
