package questao6;

public class Divulgacao extends Campanha {

	private static final int cupomPromocional=90;

	/**
	 * Construtor Divulgacao()
	 * @deprecated
	 */
	public Divulgacao() {}
	
	/**
	 * Construtor Divulgacao
	 * @see Divulgacao
	 * @param numero � usado para referenciar o n�mero da campanha.
	 * @param ano � usado para referenciar o n�mero da campanha.
	 * */
	public Divulgacao(int numero, int ano) {
		super(numero, ano);
	}

	/**
	 * M�todo definirCampanha(Produto produto)
	 * @see Produto
	 * @param produto � um par�metro relacionado aos produtos, usada para definir qual
	 * produto ser� utilizado na campanha
	 */
	@Override
	public void definirCampanha(Produto produto) {
		if (produto!=null)
			produto.setPrecoPromocional(produto.getPreco()-produto.getPreco()*(this.cupomPromocional/100));
	}

	@Override 
	public String toString() {
		return super.toString() + "[Cupom Promocional = " + cupomPromocional + "%]";
	}

	public static int getCupompromocional() {
		return cupomPromocional;
	}	
}
