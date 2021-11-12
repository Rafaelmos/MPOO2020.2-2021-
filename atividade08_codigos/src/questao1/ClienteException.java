package questao1;

public class ClienteException extends Exception {

	public ClienteException(String mensagem) {
		Mensagem.exibirMensagem(mensagem);
	}
}
