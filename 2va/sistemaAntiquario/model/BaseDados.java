package model;

import java.awt.Container;
import java.util.ArrayList;

public class BaseDados {
	private static ArrayList<Produto> produtos;

	public static void iniciarBase() {
		produtos = new ArrayList<Produto>();
		produtos.add(new Livro("CD001", 300.0, 300.0, 10, "987-1111111111", "Mpoo na Prática", "DEmery, R.A.", "Uast",
				1, 2020));
		produtos.add(new Livro("CD002", 150.0, 150.0, 5, "987-222222222", "Java para SI", "Siloé, B.", "Prentice Hall",
				1, 2018));
		produtos.add(new DVD("CD003", 50.0, 50.0, 20, "Siloé, B.", "Gospel", 10));
		produtos.add(new Moeda("CD004", 10.0, 10.0, 3, "Real", "Brasil", "conservada", 1.0, 1994));
		produtos.add(new Moeda("CD005", 5000.0, 5000.0, 2, "Reis", "Brasil", "rara", 1.0, 1871));
	}

	public static Produto buscarProduto(Produto produto) throws ProdutoNullException {
		if (isProduto(produto)) {
			return produto;
		}
		return null;
	}

	public static Produto buscarProduto(String codBarras) {
		for (Produto produto : produtos) {
			if (produto.getCodBarras().equals(codBarras)) {
				return produto;
			}
		}
		return null;
	}

	public static boolean isProduto(Produto produto) throws ProdutoNullException {
		if (produto == null) {
			throw new ProdutoNullException(TipoErro.NULL_PRODUTO);
		}
		return produtos.contains(produto);

	}

	public static boolean adicionarProduto(Produto produto) throws ProdutoExisteException, ProdutoNullException {
		if (buscarProduto(produto) == null) {
			return produtos.add(produto);
		}
		throw new ProdutoExisteException(TipoErro.EXISTE_PRODUTO);
	}

	public static boolean atualizarEstoque(Produto produto, Estoque Novoestoque) throws ProdutoNullException {
		if (buscarProduto(produto) != null) {
			buscarProduto(produto).setEstoque(Novoestoque);			
			return true;
		}
		throw new ProdutoNullException(TipoErro.NAO_EXISTE_PRODUTO);
	}

	public static ArrayList<Produto> getProdutos() {
		return produtos;
	}

}
