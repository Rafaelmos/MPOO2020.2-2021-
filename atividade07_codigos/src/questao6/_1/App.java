package questao6._1;

public class App {

	public static void main(String[] args) {

		BaseDados.inicializarBase();

		Produto produto = new Produto("Feijão de 1KG", 6.00, "31/12/2021", 50, "COD0001");
		Produto produto1 = new Produto("Feijão de 1KG", 6.00, "31/12/2020", 50, "COD0001");

		Produto produto2 = new Produto("Fubá de 500G", 1.5, "31/12/2021", 100, "COD0002");
		Produto produto3 = new Produto("Fubá de 500G", 1.5, "31/12/2020", 100, "COD0002");
		Produto produto4 = new Produto("Macarrão de 500G", 2.0, "31/12/2021", 80, "COD0003");
		Produto produto5 = new Produto("Macarrão de 500G", 2.0, "31/12/2020", 20, "COD0003");
		
		
		BaseDados.adicionarProduto(produto);
		BaseDados.adicionarProduto(produto1);
		BaseDados.adicionarProduto(produto2);

		BaseDados.adicionarProduto(produto3);
		BaseDados.adicionarProduto(produto4);
		BaseDados.adicionarProduto(produto5);

//		BaseDados.listarProdutos();

		BaseDados.atualizarEstoque(produto.getEstoque());
		BaseDados.atualizarEstoque(produto1.getEstoque());
		BaseDados.atualizarEstoque(produto2.getEstoque());
		BaseDados.atualizarEstoque(produto3.getEstoque());
		BaseDados.atualizarEstoque(produto4.getEstoque());
		BaseDados.atualizarEstoque(produto5.getEstoque());
		
		BaseDados.listarProdutos();

		
		
//		BaseDados.atualizarProduto(produto, produto2);
//		BaseDados.removerProduto(produto2);


		System.out.println(BaseDados.getDemostrativo().getValorTotal());
	}

}
