package questao4._5;

public abstract class Funcionario {
	private String nome;
	private static int id;

	public Funcionario(String nome, int id) {
		super();
		this.nome = nome;
		Funcionario.id = id;
	}

	public String getNome() {
		return nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", id=" + id + "]";
	}

}
