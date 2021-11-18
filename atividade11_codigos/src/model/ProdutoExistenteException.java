package model;

import view.Mensagem;

public class ProdutoExistenteException extends Exception {

	public ProdutoExistenteException(String mensagem) {
		Mensagem.exibirMensagem(mensagem);
	}

}
