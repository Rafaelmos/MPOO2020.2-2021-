package questao11;

public class Vendedor extends Funcionario {

	public Vendedor(String nome, String cpf, String matricula) {
		super(nome, cpf, matricula);
	}
	
	private double solicitarAutorizacaoDesconto(GerenteVendas gerenteVendas, Produto produto) {
		return gerenteVendas.darDesconto(produto);
		
	}
	

}
