package questao5_2.model;

import java.util.ArrayList;
import java.util.Date;

import questao5_2.view.Mensagem;

public class BaseDados {

	private static ArrayList<Produto> produtos;

	public static void inicializarBase() {
		produtos = new ArrayList<Produto>();

	}

	public static boolean adicionarProduto(Produto produto) {
		if (!isProduto(produto) && buscarProduto(produto.getId()) == null) {
			return produtos.add(produto);
		}
		return false;
	}

	public static boolean removerProduto(Produto produto) {
		if (buscarProduto(produto) != null) {
			return produtos.remove(produto);
		}
		return false;
	}

	public static Produto buscarProduto(Produto produto) {
		if (isProduto(produto)) {
			return produto;
		}
		return null;
	}

	public static Produto buscarProduto(int id) {
		for (Produto produto : produtos) {
			if (produto.getId() == id) {
				return produto;
			}
		}
		return null;
	}

	public static boolean isProduto(Produto produto) {
		return produtos.contains(produto);
	}

	public static boolean verificarPrazoValidade(Produto produto) {
		Date dataAtual = new Date(System.currentTimeMillis());
		if (buscarProduto(produto) != null) {
			if (produto.getValidade().before(dataAtual)) {
				return false;
			}
		}
		return true;
	}
}
