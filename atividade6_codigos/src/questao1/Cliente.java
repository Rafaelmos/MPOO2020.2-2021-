package questao1;

import java.util.ArrayList;

public class Cliente {
	private String cpf;
	private String telefone;
	private String nome;
	private String email;
	private ArrayList<Endereco> enderecos = new ArrayList<Endereco>();
	private String sexo;

	public Cliente(String cpf, String telefone, String nome, String email, String sexo) {
		super();
		this.cpf = cpf;
		this.telefone = telefone;
		this.nome = nome;
		this.email = email;
		this.sexo = sexo;
	}

	public void addEd(Endereco endereco) {
		if (!enderecos.contains(endereco)) {
			this.enderecos.add(endereco);
		} else
			System.out.println("Endereço já existe nesse objeto");

	}

	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ", telefone=" + telefone + ", nome=" + nome + ", email=" + email + ", enderecos="
				+ enderecos.toString() + ", sexo=" + sexo + "]";
	}

	public String getCpf() {
		return cpf;
	}

	public ArrayList<Endereco> getEnderecos() {
		return enderecos;
	}
}
