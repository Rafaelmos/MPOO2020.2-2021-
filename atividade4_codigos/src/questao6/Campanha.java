package questao6;

import java.time.LocalDateTime;
public abstract class Campanha {
	private static int numeroUltimaCampanha; 
	private static int anoUltimaCampanha=2021;
	private int numero; 
	private int ano;

/**
 * Construtor Campanha()
 * Esse construtor � um construtor impl�cito, incrementar e referenciar o objeto e 
 * tamb�m � uma supercarga
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
 * Esse construtor ser� usado para referenciar o objeto nas subclasses.
 * @see Divulgacao, Produto, Verao
 * @param numero � usado para referenciar o n�mero da campanha.
 * @param ano � usado para referenciar o n�mero da campanha.
 */	
	public Campanha(int numero, int ano) {
		this.numero = numero;
		this.ano = ano;
	}
/** 
 * Met�do definirCampanha(Produto produto)
 * @see Divulgacao, Produto, Verao
 * @param produto � um par�metro relacionado aos produtos, usada para definir qual
 * produto ser� utilizado na campanha
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