package questao1;

public class Cliente {
	private String nome;
	private String cpf;

	public Cliente(String nome, String cpf) {
		super();
		this.nome = nome;

//		try {
//			if (Validador.validarCPF(cpf)) {
		this.cpf = cpf;
//			}
//		} catch (CPFException e) {
//			e.printStackTrace();
//		}

	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + "]";
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
