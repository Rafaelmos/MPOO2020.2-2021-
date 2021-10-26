package questao2;

public abstract class Usuario {
	private String cpf;
	private String nome;

	public Usuario(String cpf, String nome) {
		super();
		this.cpf = cpf;
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Usuario [cpf=" + cpf + ", nome=" + nome + "";
	}

	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

}
