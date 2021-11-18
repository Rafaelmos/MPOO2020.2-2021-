package model;

import view.Mensagem;

public class ProdutoNullException extends Exception {

	public ProdutoNullException(String mensagem) {
		Mensagem.exibirMensagem(mensagem);

	}

}
