package questao1;

public class Endereco {
	private String longradouro;
	private int numero;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;

	public Endereco(String longradouro, int numero, String bairro, String cidade, String estado, String cep,
			Cliente cliente) {
		if (!isEndereco(longradouro, numero, bairro, cidade, estado, cep, cliente)) {
			cliente.getEnderecos().add(new Endereco(longradouro, numero, bairro, cidade, estado, cep));
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

	private boolean isEndereco(String longradouro, int numero, String bairro, String cidade, String estado, String cep,
			Cliente cliente) {
		for (Endereco end : cliente.getEnderecos()) {
			if (end.getLongradouro().equalsIgnoreCase(longradouro) && end.getNumero() == numero
					&& end.getBairro().equalsIgnoreCase(bairro) && end.getCidade().equalsIgnoreCase(cidade)
					&& end.getEstado().equalsIgnoreCase(estado) && end.getCep().equalsIgnoreCase(cep)) {
				System.out.println("Endereço já existe nesse objeto");
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Endereco [" + longradouro + ", n. " + numero + ", " + bairro + ", " + cidade + "-" + estado + ", CEP "
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
