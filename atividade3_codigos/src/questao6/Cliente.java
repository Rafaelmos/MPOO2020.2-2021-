package questao6;

import java.util.ArrayList;

public class Cliente {
	private int idCliente;
	private String nome, sobrenome;
	private int cpf;
	private ContaBancaria contaBancaria;
	private ArrayList<Produto> produtosComprados;
	private String email;
	private String endereco;
	private ArrayList<String> telefones;
	
	public Cliente(int idCliente, String nome, String sobrenome, int cpf, ContaBancaria contaBancaria,
			ArrayList<Produto> produtosComprados, String email, String endereco, ArrayList<String> telefones) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.contaBancaria = contaBancaria;
		this.produtosComprados = produtosComprados;
		this.email = email;
		this.endereco = endereco;
		this.telefones = telefones;
	}
	
	
	public void solicitarDevolucao(Produto produto) {
		
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public ContaBancaria getContaBancaria() {
		return contaBancaria;
	}

	public void setContaBancaria(ContaBancaria contaBancaria) {
		this.contaBancaria = contaBancaria;
	}

	public ArrayList<Produto> getProdutosComprados() {
		return produtosComprados;
	}

	public void setProdutosComprados(ArrayList<Produto> produtosComprados) {
		this.produtosComprados = produtosComprados;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public ArrayList<String> getTelefones() {
		return telefones;
	}

	public void setTelefones(ArrayList<String> telefones) {
		this.telefones = telefones;
	}
}
