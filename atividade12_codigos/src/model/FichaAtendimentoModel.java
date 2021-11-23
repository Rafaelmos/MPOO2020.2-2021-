package model;

import java.util.Date;

public class FichaAtendimentoModel extends Model {

	private String nome;
	private String numero;
	private Date hora;

	public FichaAtendimentoModel(String nome, String numero) {
		super();
		this.nome = nome;
		this.numero = numero;
		this.hora = new Date(System.currentTimeMillis());
	}

	public String getNome() {
		return nome;
	}

	public String getNumero() {
		return numero;
	}

}
