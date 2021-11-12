package questao3;

import java.util.ArrayList;

public class BaseDados {
	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();

	public static Cliente buscarCliente(Cliente cliente) {
		if (!isCliente(cliente)) {
			if (!clientes.contains(cliente)) {
				return cliente;
			}
		} else {
			System.out.println("CPF DUPLICADO");
		}
		return null;
	}

	public static Cliente buscarCliente(String cpf) {
		for (Cliente cliente : clientes) {
			if (cliente.getCpf() == cpf) {
				return cliente;
			}
		}
		return null;
	}

	public static boolean isCliente(Cliente cliente) {
		for (Cliente c : clientes) {
			if (c.getCpf() == cliente.getCpf()) {
				return true;
			}
		}
		return false;
	}

	public static Cliente adicionarCliente(Cliente cliente) {
		if (buscarCliente(cliente) != null) {
			clientes.add(cliente);

		}
		return cliente;
	}

	public static boolean removerCliente(Cliente cliente) {
		if (buscarCliente(cliente.getCpf()) != null) {
			for (Conta c : cliente.getContas()) {
				cliente.getContas().remove(c);
			}
			return clientes.remove(cliente);
		}
		return false;
	}

	public static boolean atualizarCliente(Cliente clienteOld, Cliente clienteNew) {
		for (Cliente c : clientes) {
			if (c.equals(clienteOld)) {
				if (c.equals(clienteOld)) {
					clientes.remove(c);
					adicionarCliente(clienteNew);
					return true;
				}
			}
		}
		return false;
	}

	public static void todasAsContas() {
		for (Cliente cli : BaseDados.getClientes()) {
			for (Conta c : cli.getContas()) {
				System.out.println(c);
			}
		}
		System.out.println("");
	}
	
	public static ArrayList<Cliente> getClientes() {
		return clientes;
	}
}
