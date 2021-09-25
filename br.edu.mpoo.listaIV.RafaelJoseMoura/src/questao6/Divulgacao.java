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
	 * @param numero é usado para referenciar o número da campanha.
	 * @param ano é usado para referenciar o número da campanha.
	 * */
	public Divulgacao(int numero, int ano) {
		super(numero, ano);
	}

	/**
	 * Método definirCampanha(Produto produto)
	 * @see Produto
	 * @param produto é um parâmetro relacionado aos produtos, usada para definir qual
	 * produto será utilizado na campanha
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
