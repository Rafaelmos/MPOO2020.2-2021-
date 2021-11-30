package model;

public class ProdutoNullException extends Exception {

	
	public ProdutoNullException(String mensagem) {
		System.err.println(mensagem);
	}
}
