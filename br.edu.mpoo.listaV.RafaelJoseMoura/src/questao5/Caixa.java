package questao5;

import java.util.ArrayList;
import java.util.Date;

public class Caixa extends Funcionario {

	private ArrayList<String> listaCompras = new ArrayList<String>();

	public Caixa(String nome, String cpf, String matricula) {
		super(nome, cpf, matricula);
	}

	public void registrarCompra(Produto produto, Vendedor vendedor, GerenteVendas gerenteVendas, boolean isDesconto) {
		double desconto = 0;
		if (isDesconto) {
			desconto = vendedor.solicitarAutorizacaoDesconto(gerenteVendas, produto);
		} 
		double valorTotal = (produto.getPreco() * produto.getQuantidade()) - desconto;
		Date data = new Date(System.currentTimeMillis());
		Compra compra = new Compra(0, data, desconto, valorTotal);
		compra.setId(listaCompras.size() + 1);
		compra.setDate(data);
		compra.addProdutos(produto);
		compra.setDesconto(desconto);
		compra.setValorTotal(valorTotal);
		compra.getProdutos().add(produto);
		BaseDados.adicionarCompra(compra);
		listaCompras.add(compra.toString());
	}

	public void imprimirResultado() {
		for (String string : listaCompras) {
			System.out.println(string);
		}
	}
}
