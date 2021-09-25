package questao11;

public class Mensagem {
	
	public static String exibirMensagem(boolean isDesconto) {
		String resposta;
		if (isDesconto) {
			resposta = "Desconto realizado";
		} else {
			resposta = "Erro no desconto";
		}
		return resposta;
		
	}

}
