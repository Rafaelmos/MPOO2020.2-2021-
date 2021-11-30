package model;

public class ProdutoExisteException extends Exception {

	
	public ProdutoExisteException(String mensagem) {
		System.err.println(mensagem);
	}
}
