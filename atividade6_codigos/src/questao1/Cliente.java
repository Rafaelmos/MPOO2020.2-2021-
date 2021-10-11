package questao1;

import java.util.ArrayList;

public class Cliente {
	private String cpf;
	private String telefone;
	private String nome;
	private String email;
	private ArrayList<Endereco> enderecos;
	private String sexo;

	public Cliente(String cpf, String telefone, String nome, String email, String sexo) {
		super();
		this.cpf = cpf;
		this.telefone = telefone;
		this.nome = nome;
		this.email = email;
		this.sexo = sexo;
		this.enderecos = new ArrayList<Endereco>();
		
	}

	public void addEd(String longradouro, int numero, String bairro, String cidade, String estado, String cep) {
		Endereco endereco = new Endereco(longradouro, numero, bairro, cidade, estado, cep, this);
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
