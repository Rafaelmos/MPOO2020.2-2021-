package model;

public class TipoErro {
	public static final String NULL_PRODUTO = "Dados de Produto inv�lidos";
	public static final String EXISTE_PRODUTO = "Produto j� existe";
	public static final String NAO_EXISTE_PRODUTO = "Produto n�o existe";
	private static final String QUANTIDADE_ITEM_ERRO = "Quantidade Indispon�vel";
	private static final String NAO_EXISTE_IMAGEM = "Erro ao colocar imagem";

	public static String getQuantidadeItemErro() {
		return QUANTIDADE_ITEM_ERRO;
	}

	public static String getNaoExisteImagem() {
		return NAO_EXISTE_IMAGEM;
	}

}
