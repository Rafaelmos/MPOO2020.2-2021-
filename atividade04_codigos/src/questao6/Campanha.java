package questao6;

import java.time.LocalDateTime;
public abstract class Campanha {
	private static int numeroUltimaCampanha; 
	private static int anoUltimaCampanha=2021;
	private int numero; 
	private int ano;

/**
 * Construtor Campanha()
 * Esse construtor é um construtor implícito, incrementar e referenciar o objeto e 
 * também é uma supercarga
 * @deprecated
 */
	public Campanha() {
		numeroUltimaCampanha++;
		if(LocalDateTime.now().getYear()>anoUltimaCampanha){
			anoUltimaCampanha++;
			numeroUltimaCampanha=1;
		}
		this.numero = numeroUltimaCampanha;
		this.ano = anoUltimaCampanha;
	}

/**
 * Construtor Campanha(int numero, int ano)
 * Esse construtor será usado para referenciar o objeto nas subclasses.
 * @see Divulgacao, Produto, Verao
 * @param numero é usado para referenciar o número da campanha.
 * @param ano é usado para referenciar o número da campanha.
 */	
	public Campanha(int numero, int ano) {
		this.numero = numero;
		this.ano = ano;
	}
/** 
 * Metódo definirCampanha(Produto produto)
 * @see Divulgacao, Produto, Verao
 * @param produto é um parâmetro relacionado aos produtos, usada para definir qual
 * produto será utilizado na campanha
 */
	public abstract void definirCampanha(Produto produto);
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public static int getNumeroUltimaCampanha() {
		return numeroUltimaCampanha;
	}

	public static int getAnoUltimaCampanha() {
		return anoUltimaCampanha;
	}
	
	@Override
	public String toString() {
		return "Campanha: [" + numero + "/" + ano + "]";
	}
} 