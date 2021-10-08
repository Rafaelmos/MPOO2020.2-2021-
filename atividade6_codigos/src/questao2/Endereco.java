package questao2;

public class Endereco {
	private String longradouro;
	private int numero;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;

	public Endereco(String longradouro, int numero, String bairro, String cidade, String estado, String cep) {
		super();
		this.longradouro = longradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}

	@Override
	public String toString() {
		return "\nEndereco [" + longradouro + ", n. " + numero + ", " + bairro + ", " + cidade + "-" + estado + ", CEP "
				+ cep + "]";
	}

	public String getLongradouro() {
		return longradouro;
	}

	public void setLongradouro(String longradouro) {
		this.longradouro = longradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

}
