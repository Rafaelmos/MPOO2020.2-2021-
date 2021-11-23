package model;

public class EnderecoModel extends Model{
	private String logradouro, cep, bairro, estado, cidade;
	private int numero;

	public EnderecoModel(String logradouro, String cep, String bairro, String estado, String cidade, int numero) {
		this.logradouro = logradouro;
		this.cep = cep;
		this.bairro = bairro;
		this.estado = estado;
		this.cidade = cidade;
		this.numero = numero;
	}

}