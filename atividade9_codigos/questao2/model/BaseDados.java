package model;

import java.util.ArrayList;

public class BaseDados {
	private static ArrayList<Produto> produtos = new ArrayList<>();
	private static ArrayList<Cliente> clientes = new ArrayList<>();
	private ArrayList<Cliente> compras = new ArrayList<>();

	public static Object buscar(Object object) {
		if (object instanceof Produto) {
			Produto produto = (Produto) object;
			if (produtos.contains(produto)) {
				return produto;
			}
			return null;
		}
		if (object instanceof Cliente) {
			Cliente cliente = (Cliente) object;
			if (clientes.contains(cliente)) {
				return cliente;
			}
		}
		return null;
	}

	public static boolean adicionar(Object object) {
		if (buscar(object) == null) {
			if (object instanceof Produto) {
				Produto produto = (Produto) object;
				return produtos.add(produto);
			}

			if (object instanceof Cliente) {
				Cliente cliente = (Cliente) object;
				return clientes.add(cliente);
			}
		}
		return false;

	}

	public static boolean remover(Object object) {
		if (buscar(object) != null) {
			if (object instanceof Produto) {
				Produto produto = (Produto) object;
				return produtos.remove(produto);
			}

			if (object instanceof Cliente) {
				Cliente cliente = (Cliente) object;
				return clientes.remove(cliente);
			}
		}
		return false;

	}

	public static boolean atualizar(Object objectOld, Object objectNew) {
		if (objectOld instanceof Produto && objectNew instanceof Produto) {
			if (produtos.contains(objectOld) && !produtos.contains(objectNew)) {
				remover(objectOld);
				return adicionar(objectNew);
			}

		}
		if (objectOld instanceof Cliente && objectNew instanceof Cliente) {
			if (clientes.contains(objectOld) && !clientes.contains(objectNew)) {
				remover(objectOld);
				return adicionar(objectNew);

			}
		}

		return false;

	}

}