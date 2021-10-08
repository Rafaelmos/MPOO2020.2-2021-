package questao2;

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


	@Override
	public String toString() {
		return "Cliente \n[cpf=" + cpf + ", telefone=" + telefone + ", nome=" + nome + ", email=" + email
				+ ",\n enderecos=" + enderecos.toString() + ",\n sexo=" + sexo + "]";
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public ArrayList<Endereco> getEnderecos() {
		return enderecos;
	}
}
