package questao6;

public class Verao extends Campanha{

	/**
	 * Construtor Verao()
	 * @deprecated
	 * */
	public Verao() {}
	
	/**
	 * Construtor Verao(int numero, int ano)
	 * @param numero � usado para referenciar o n�mero da campanha.
	 * @param ano � usado para referenciar o n�mero da campanha.
	 */
	public Verao(int numero, int ano) {
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
		if (produto.getNome().contains("biquini"))
			produto.setPrecoPromocional(produto.getPreco()-produto.getPreco()/2);
	}
	
	@Override 
	public String toString() {
		return super.toString() + "[Desconto biquine = 50%]";
	}
}