package questao11;

import java.util.ArrayList;

public class Caixa extends Funcionario{
	private ArrayList<String> listaCompras = new ArrayList<String>();
	
	public Caixa(String nome, String cpf, String matricula) {
		super(nome, cpf, matricula);
	}

	public void registrarCompra(Produto produto, Vendedor vendedor, GerenteVendas gerenteVendas, boolean isDesconto, boolean pedirDesconto) {
		if (pedirDesconto) {
			if (isDesconto) {
				System.out.println(	Mensagem.exibirMensagem(isDesconto));
				Compra compra = new Compra(Compra.getContadorId(), produto, 0, isDesconto, gerenteVendas.darDesconto(produto));
				int novoid = compra.getId()+ 1;
				compra.setDesconto(vendedor.solicitarAutorizacaoDesconto(gerenteVendas, produto));
				compra.setId(novoid);
				listaCompras.add(compra.toString());
				compra.setContadorId(novoid);
				System.out.println(compra.toString());
			} else {
				System.out.println(	Mensagem.exibirMensagem(isDesconto));
				compraSemDesconto(produto, vendedor, gerenteVendas, isDesconto, pedirDesconto);
			}	
		} else {
			compraSemDesconto(produto, vendedor, gerenteVendas, isDesconto, pedirDesconto);
		}
	}
	
	private void compraSemDesconto(Produto produto, Vendedor vendedor, GerenteVendas gerenteVendas, boolean isDesconto, boolean pedirDesconto) {
		Compra compra = new Compra(Compra.getContadorId(), produto, 0, isDesconto, 0);
		int novoid = compra.getId()+ 1;
		compra.setId(novoid);
		compra.setContadorId(novoid);
		listaCompras.add(compra.toString());
		System.out.println(compra.toString());
	}
	
	public void imprimirResultandos() {
		for (String string : listaCompras) {
			System.out.println(string);
		}
}
}
