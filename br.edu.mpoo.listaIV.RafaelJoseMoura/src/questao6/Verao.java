package questao6;

public class Verao extends Campanha{

	/**
	 * Construtor Verao()
	 * @deprecated
	 * */
	public Verao() {}
	
	/**
	 * Construtor Verao(int numero, int ano)
	 * @param numero é usado para referenciar o número da campanha.
	 * @param ano é usado para referenciar o número da campanha.
	 */
	public Verao(int numero, int ano) {
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
		if (produto.getNome().contains("biquini"))
			produto.setPrecoPromocional(produto.getPreco()-produto.getPreco()/2);
	}
	
	@Override 
	public String toString() {
		return super.toString() + "[Desconto biquine = 50%]";
	}
}