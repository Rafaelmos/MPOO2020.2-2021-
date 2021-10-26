package questao2;

public class ContaException extends Exception {

	public ContaException(String tipo) {
		Mensagem.exibirMensagem("Conta " + tipo + " inválida");
		;
	}
}
