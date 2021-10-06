package questao11;

import java.util.Date;

public class Main {
	
	public static void main(String[] args) {
		GerenteVendas gerenteVendas = new GerenteVendas("Susyane", "151.151.151-15", "88888", "4151afaaf");
		Cliente cliente = new Cliente("Robertinho","155.115.154-45", true);
		Vendedor vendedor = new Vendedor("Alecknardo", "155.555.154-45", "151542");
		Caixa caixa = new Caixa("Senior", "825.555.154-45", "125215");
		
		Produto produto = new Produto("Coca", 2.5, new Date(2050, 4, 1), "D4515f1fasffas4A", 1);
		Produto produto1 = new Produto("Papel", 2.5, new Date(2023, 9, 13), "faf515f4a4asffas4A", 5);
		Produto produto2 = new Produto("Agua Vegana", 2.5, new Date(2025, 2, 9), "D45gs1s45g15gsffas4A", 1);
		Produto produto3 = new Produto("Soverte", 2.5, new Date(2020, 6, 5), "D451515511fasf151s4A", 1);
		
		caixa.registrarCompra(produto, vendedor, gerenteVendas, gerenteVendas.aprovarDesconto(false), cliente.pedirDesconto(true));
		caixa.registrarCompra(produto1, vendedor, gerenteVendas, gerenteVendas.aprovarDesconto(true), cliente.pedirDesconto(true));
		caixa.registrarCompra(produto1, vendedor, gerenteVendas, gerenteVendas.aprovarDesconto(false), cliente.pedirDesconto(true));

		
		//caixa.imprimirResultandos();
		
		
	}

}
