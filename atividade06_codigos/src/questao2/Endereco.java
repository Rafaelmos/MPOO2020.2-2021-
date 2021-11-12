package questao2;

public class Endereco {
	private String longradouro;
	private int numero;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;

	public Endereco(String longradouro, int numero, String bairro, String cidade, String estado, String cep,
			Cliente cliente) {
		if (!BaseEnderecos.isEndereco(longradouro, numero, bairro, cidade, estado, cep, cliente)) {
			BaseEnderecos.adicionarEndereco(cliente, (new Endereco(longradouro, numero, bairro, cidade, estado, cep)));
		}
	}

	private Endereco(String longradouro, int numero, String bairro, String cidade, String estado, String cep) {
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
		return "Endereco [" + longradouro + ", n. " + numero + ", " + bairro + ", " + cidade + "-" + estado + ", CEP "
				+ cep + "]";
	}

	public String getLongradouro() {
		return longradouro;
	}

	public int getNumero() {
		return numero;
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

}
