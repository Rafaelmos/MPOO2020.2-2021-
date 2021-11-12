package questao8_2;

public class Supermercado {
	
	public static void main(String[] args) {
		Produto produto = new Produto("Arroz", 2215, 4.87);
		Produto produto2 = new Produto("Feijao", 2219, 5.51);
		Produto produto3 = new Produto("Cafe", 2082, 4.52);
		Produto produto4 = new Produto("Manteiga", 2000, 2.99);
		Produto produto5 = new Produto("Amaciante", 015115, 7.99);
		Funcionario funcionario = new Funcionario(10001, 7777666, "Claudio", "Caixa", "484ads58asf");
		Funcionario funcionario1 = new Funcionario(10001, 7777666, "Adamastor", "gerente", "484ads58asf");

		Compra compra = new Compra();
		
		
		compra.registrar(produto);
		compra.registrar(produto2);
		compra.registrar(produto3);
		compra.registrar(produto4);
		compra.registrar(produto5);
		

		compra.resumir(funcionario1);
	}
}