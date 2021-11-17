package model;

import view.Mensagem;

public class NullProdutoException extends Exception {

	public NullProdutoException(String mensagem) {
		Mensagem.exibirMensagem(mensagem);
	}

}
