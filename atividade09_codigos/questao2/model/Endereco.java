package model;

public class Endereco {
	private String logadouro, bairro, cidade, estado, cep;
	private int numero;
	
	public Endereco(String logadouro, String bairro, String cidade, String estado, String cep, int numero) {
		super();
		this.logadouro = logadouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.numero = numero;
	}

	public String getLogadouro() {
		return logadouro;
	}


	public String getBairro() {
		return bairro;
	}


	public String getCidade() {
		return cidade;
	}


	public String getEstado() {
		return estado;
	}


	public String getCep() {
		return cep;
	}


	public int getNumero() {
		return numero;
	}

}
