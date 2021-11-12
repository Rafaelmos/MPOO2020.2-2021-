package questao5.situacao1;

public class Funcionario implements SuperFuncionario, Caixa, Gerente {
	private String nome;
	private String sobrenome;
	private String cpf;

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", sobrenome=" + sobrenome + ", cpf=" + cpf + "]";
	}

	public String getNome() {
		return nome;
	}

	public Funcionario(String nome, String sobrenome, String cpf) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public void darDesconto(Produto produto, double desconto) {
		if (produto != null) {
			desconto = produto.getPreco() - (produto.getPreco() * desconto / 100);
			return;
		}

	}

	@Override
	public void realizarVenda(Produto produto) {
		if (produto != null) {
			System.out.println("Venda realizada");
		}
	}

	@Override
	public void contratarFuncionarios(Funcionario fucionario) {
		BaseDados.createFuncionario(fucionario);
	}

	@Override
	public void demitirFuncionario(Funcionario fucionario) {
		BaseDados.deleteFuncionario(fucionario);
	}

}
