package questao4;

import java.util.ArrayList;
import java.util.Date;

import questao5_2.view.Mensagem;

public class BaseDados {

	private static ArrayList<Produto> produtos;

	public static void inicializarBase() {
		produtos = new ArrayList<Produto>();
	}

	public static boolean adicionarProduto(Produto produto) {
		if (buscarProduto(produto) == null && buscarProduto(produto.getId(), false) == null) {
			Mensagem.exibirMensagem(2);
			return produtos.add(produto);
		}
		Mensagem.exibirMensagem(0);
		return false;
	}

	public static boolean removerProduto(Produto produto) {
		if (buscarProduto(produto) != null) {
			Mensagem.exibirMensagem(3);
			return produtos.remove(produto);
		}
		Mensagem.exibirMensagem(1);
		return false;
	}

	public static Produto buscarProduto(Produto produto) {
		if (isProduto(produto)) {
			return produto;
		}
		return null;
	}

	
	public static Produto buscarProduto(int id, boolean b) {
		for (Produto produto : produtos) {
			if (b && produto.getId() == id) {
				return buscarProduto(produto);
			}
			if (produto.getId() == id) {
				return produto;
			}
		}
		if (b) {
			return buscarProduto(null);
		}
		return null;
	}

	public static boolean isProduto(Produto produto) {
		return produtos.contains(produto);
	}

	public static boolean verificarPrazoValidade(Produto produto) {
		Date dataAtual = new Date(System.currentTimeMillis());
		if (produto.getValidade().before(dataAtual)) {
			Mensagem.exibirMensagem(4);
			return false;
		}
		Mensagem.exibirMensagem(5);
		return true;
	}
}
