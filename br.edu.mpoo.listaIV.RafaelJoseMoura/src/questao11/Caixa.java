package questao11;

import java.util.ArrayList;
import java.util.Date;

public class Caixa extends Funcionario{
	ArrayList<String> listaCompras = new ArrayList<String>();
	
	public Caixa(String nome, String cpf, String matricula) {
		super(nome, cpf, matricula);
	}

	public void registrarCompra(Produto produto, Vendedor vendedor, GerenteVendas gerenteVendas, boolean isDesconto, boolean pedirDesconto) {
		Cliente cliente = new Cliente(getNome(), getCpf());
		if (cliente.pedirDesconto(pedirDesconto)) {
			if (isDesconto) {
				Compra compra = new Compra(produto, 0, isDesconto, gerenteVendas.darDesconto(produto));
				listaCompras.add(compra.toString());
				System.out.println(	Mensagem.exibirMensagem(isDesconto));
			} else {
				System.out.println(	Mensagem.exibirMensagem(isDesconto));
				Compra compra = new Compra(produto, 0, isDesconto, 0);
				listaCompras.add(compra.toString());
			}
				
		} else {
			Compra compra = new Compra(produto, 0, isDesconto, 0);
			listaCompras.add(compra.toString());	
		}
		
	}		
}
