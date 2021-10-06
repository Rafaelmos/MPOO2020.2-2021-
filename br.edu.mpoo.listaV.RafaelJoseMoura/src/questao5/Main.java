package questao5;

public class Main {

	public static void main(String[] args) {
		Caixa caixa = new Caixa("Katarina", "747.232.690-96", "69000");

		Produto produto = new Produto("Arroz", 5.5, "30/12/2022", "15115154dass", 4);
		Produto produto2 = new Produto("Feijao", 5, "30/05/2022", "991515151ass", 1);

		Vendedor vendedor = new Vendedor("Renata", "634.646.670-49", "67000");
		GerenteVendas gerenteVendas = new GerenteVendas("Robertinho", "658.319.170-96", "17000", "RF551sa@");

		caixa.registrarCompra(produto, vendedor, gerenteVendas, true);
		caixa.registrarCompra(produto2, vendedor, gerenteVendas, false);

		System.out.println(BaseDados.totalVendas(9, 2021));
		caixa.imprimirResultado();

		BaseDados.removerCompra(2);

//		caixa.imprimirResultado();

		System.out.println(BaseDados.getCompras());
		System.out.println(BaseDados.getVendas());
		

		
	}

}
