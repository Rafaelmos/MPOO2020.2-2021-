package model;

import view.Mensagem;

public class NullExistenteException extends Exception {

	public NullExistenteException(String mensagem) {
		Mensagem.exibirMensagem(mensagem);
	}

}
