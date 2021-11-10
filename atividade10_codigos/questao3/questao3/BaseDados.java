package questao3;

import java.util.ArrayList;
import java.util.Iterator;

public class BaseDados {
	private static ArrayList<Produto> produtos = new ArrayList<>();
	private static ArrayList<Cliente> clientes = new ArrayList<>();
	private ArrayList<Cliente> compras = new ArrayList<>();

	public static Produto buscar(Produto produto) {
		if (produtos.contains(produto)) {
			return produto;
		}
		return null;
	}

	public static Cliente buscar(Cliente cliente) {
		if (clientes.contains(cliente)) {
			return cliente;
		}
		return null;
	}
	
	public static Cliente buscar(String email) {
		for (Cliente cliente : clientes) {
			if (cliente.getEmail() == email) {
				return cliente;
			}
		}
		return null;
	}

	public static boolean adicionar(Cliente cliente) {
		if (buscar(cliente) == null) {
			return clientes.add(cliente);
		}
		return false;
	}

	public static boolean adicionar(Produto produto) {
		if (buscar(produto) == null) {
			return produtos.add(produto);
		}
		return false;
	}

	public static boolean remover(Cliente cliente) {
		if (buscar(cliente) != null) {
			return clientes.remove(cliente);
		}

		return false;

	}

	public static boolean remover(Produto produto) {
		if (buscar(produto) != null) {
			if (produto instanceof Produto) {
				return produtos.remove(produto);
			}
		}
		return false;
	}
	

	public static boolean atualizar(Produto produtoOld, Produto produtoNew) {
		return false;
		
	}
	public static boolean atualizar(Cliente clienteOld, Cliente clienteNew) {
		return false;
		
	}

	public static ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public static ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public ArrayList<Cliente> getCompras() {
		return compras;
	}

}