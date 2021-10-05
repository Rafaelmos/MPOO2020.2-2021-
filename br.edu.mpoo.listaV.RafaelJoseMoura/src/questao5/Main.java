package questao5;

public class Main {

	public static void main(String[] args) {
		BaseDados baseDados = new BaseDados();
		Caixa caixa = new Caixa(null, null, null);
		Produto produto = new Produto("Arroz", 5.5, null, null, 4);
		Vendedor vendedor = new Vendedor(null, null, null);
		GerenteVendas gerenteVendas = new GerenteVendas(null, null, null, null);
		
		caixa.registrarCompra(produto, vendedor, gerenteVendas, true);
		caixa.registrarCompra(produto, vendedor, gerenteVendas, false);

		System.out.println(baseDados.totalVendas(10, 2021));
		
		caixa.imprimirResultado();
		
	}

}
