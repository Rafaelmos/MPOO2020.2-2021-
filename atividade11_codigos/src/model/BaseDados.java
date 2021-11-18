package model;

import java.util.ArrayList;

public class BaseDados implements VerificadorInterface, DemostrativoInterface {
	private static ArrayList<Produto> produtos;
	private static Demostrativo demostrativo;

	public static void inicializarBase() {
		demostrativo = new Demostrativo();
		produtos = new ArrayList<Produto>();

		try {
			BaseDados.adicionarProduto(new Produto("Feijão", 6.00, "31/12/2021", 50, "COD0001", 1, "Kg"));
			BaseDados.adicionarProduto(new Produto("Feijão", 6.00, "31/12/2020", 50, "COD0001", 1, "Kg"));
			BaseDados.adicionarProduto(new Produto("Fubá", 1.50, "31/12/2021", 100, "COD0002", 0.5, "Kg"));
			BaseDados.adicionarProduto(new Produto("Fubá", 1.50, "31/12/2020", 100, "COD0002", 0.5, "Kg"));
			BaseDados.adicionarProduto(new Produto("Leite", 5.00, "31/12/2021", 80, "COD0003", 1, "L"));
			BaseDados.adicionarProduto(new Produto("Leite", 5.00, "31/12/2020", 20, "COD0003", 1, "L"));
			BaseDados.adicionarProduto(new Produto("Tecido", 10.00, "31/12/2050", 100, "COD0004", 2, "M"));
			BaseDados.adicionarProduto(new Produto("Banana", 1.50, "20/11/2021", 50, "COD0005", 1, "Unid."));
		} catch (ProdutoExistenteException e) {
			e.printStackTrace();
		}
	}

	public static Produto buscarProduto(Produto produto) throws ProdutoNullException {
		if (isProduto(produto)) {
			return produto;
		}
		return null;
	}

	public static Produto buscarProduto(String codBarras) throws ProdutoNullException {
		for (Produto prod : produtos) {
			if (prod.getCodBarras() == codBarras) {
				return prod;
			}
		}
		throw new ProdutoNullException("Produto não existente");
	}

	public static boolean isProduto(Produto produto) throws ProdutoNullException {
		if (produto == null) {
			throw new ProdutoNullException("Produto inválido");
		}
		return produtos.contains(produto);
	}

	public static boolean adicionarProduto(Produto produto) throws ProdutoExistenteException {
		if (produtos.contains(produto)) {
		}

		try {
			if (buscarProduto(produto) == null) {
				for (Produto p : produtos) {
					if (p.getNome().equals(produto.getNome()) && p.getPreco() == produto.getPreco()
							&& p.getValidade().equals(produto.getValidade())
							&& p.getCodBarras().equals(produto.getCodBarras())
							&& p.getEstoque().getQuantidade() == produto.getEstoque().getQuantidade()
							&& p.getPeso() == produto.getPeso()
							&& p.getUnidadeDeMedida().equals(produto.getUnidadeDeMedida())) {
						throw new ProdutoExistenteException("Produto já existe");
					} else if (!p.getNome().equals(produto.getNome())
							&& p.getCodBarras().equals(produto.getCodBarras())) {
						throw new ProdutoExistenteException("Produto inválido");
					}
				}
				return produtos.add(produto);

			}

		} catch (ProdutoNullException | ProdutoExistenteException e) {
			e.printStackTrace();
		}
		return false;

	}

	public static boolean removerProduto(Produto produto) {
		try {
			if (buscarProduto(produto) != null) {
				return produtos.remove(produto);
			}
		} catch (ProdutoNullException e) {
			e.printStackTrace();
		}
		return false;
	}

	public static boolean atualizarProduto(Produto produtoOld, Produto produtoNew) {
		int index = 0;
		try {
			if (buscarProduto(produtoOld) != null) {
				for (Produto produto : produtos) {
					if (produto == produtoOld) {
						produtos.set(index, produtoNew);
						return true;
					}
					index++;
				}
			}
		} catch (ProdutoNullException e) {
			e.printStackTrace();
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
