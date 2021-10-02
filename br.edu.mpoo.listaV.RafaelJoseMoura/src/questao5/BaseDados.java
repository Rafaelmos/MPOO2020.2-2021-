package questao5;

import java.util.ArrayList;

public class BaseDados {
	private ArrayList<Compra> compras = new ArrayList<Compra>();
	private ArrayList<Venda> vendas = new ArrayList<Venda>();
	
	public Compra buscarCompra(Compra compra) {
		return compra;
	}
	
	public Compra buscarCompra(int id) {
		return null;
	}
	
	public boolean adicionarCompra(Compra compra) {
		return false;
	}
	
	public boolean removerCompra(Compra compra) {
		return false;
	}

	public double totalVendas(int mes, int ano) {
		return 0;
	}
	
	public boolean atualizarVendas(Compra compra) {
		return false;
		
	}
}
