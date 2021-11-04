package model;

public class Cliente {
	private String telefone, nome, email, sexo;
	private Endereco endereco;
	private boolean aceitarProdutoPromocional;

	public Cliente(String telefone, String nome, String email, String sexo, Endereco endereco,
			boolean aceitarProdutoPromocional) {
		super();
		this.telefone = telefone;
		this.nome = nome;
		this.email = email;
		this.sexo = sexo;
		this.endereco = endereco;
		this.aceitarProdutoPromocional = aceitarProdutoPromocional;
	}

}