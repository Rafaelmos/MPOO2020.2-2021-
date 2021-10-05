package questao5;

public class Mensagem {

	public static String exibirMensagem(double desconto) {
		String mensagem;
		if (desconto > 0) {
			mensagem = "Desconto dado com sucesso";
		} else {
			mensagem = "Desconto não autorizado";
		}
		return mensagem;
	}

}
