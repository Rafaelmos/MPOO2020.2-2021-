package questao6._1;

import java.util.ArrayList;

public class BaseDados implements VerificadorInterface, DemostrativoInterface {
	private static ArrayList<Produto> produtos;
	private static Demostrativo demostrativo;

	public static void inicializarBase() {
		demostrativo = new Demostrativo();
		produtos = new ArrayList<Produto>();
	}

	public static Produto buscarProduto(Produto produto) {
		if (isProduto(produto)) {
			return produto;
		}
		return null;
	}

	public static Produto buscarProduto(String codBarras) {
		for (Produto prod : produtos) {
			if (prod.getCodBarras().equals(codBarras)) {
				return prod;
			}
		}
		return null;
	}

	public static boolean isProduto(Produto produto) {
		return produtos.contains(produto);
	}

	public static boolean adicionarProduto(Produto produto) {
		if (buscarProduto(produto) == null) {
			for (Produto p : produtos) {
				if (!p.getNome().equals(produto.getNome()) && p.getCodBarras().equals(produto.getCodBarras())) {
					return false;
				}
			}
		}
		return produtos.add(produto);
	}

	public static boolean removerProduto(Produto produto) {
		if (buscarProduto(produto) != null) {
			return produtos.remove(produto);
		}
		return false;
	}

	public static boolean atualizarProduto(Produto produtoOld, Produto produtoNew) {
		if (buscarProduto(produtoNew) == null) {
			produtos.remove(buscarProduto(produtoOld));
			return produtos.add(produtoNew);
		}
		return false;
	}

	public static boolean atualizarEstoque(Estoque estoque) {
		for (Produto prod : produtos) {
			if (prod.getEstoque() == estoque && !VerificadorInterface.verificarValidade(prod)) {
				double prejuizo = (prod.getQuantidade() * prod.getPreco());
				removerProduto(prod);
				DemostrativoInterface.calcularDesmotrativo(prejuizo);
				return true;
			}
		}
		return false;
	}

	public static void listarProdutos() {
		for (Produto produto : produtos) {
			System.out.println(produto);
		}
	}

	public static ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public static Demostrativo getDemostrativo() {
		return demostrativo;
	}

}
