package questao6;

public class Vendendor extends Funcionario {
	boolean produtoEmBomEstado;
	
	public Vendendor(int id, String nome) {
		super(id, nome);
	}

	public boolean verificarProduto(Produto produto) {
		return produtoEmBomEstado;
	}

	public void atualizaEstoque(Produto produto, Estoque estoque){
	}
	
	public void trocarProduto(Cliente cliente) {
	}
}
