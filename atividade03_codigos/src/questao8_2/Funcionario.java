package questao8_2;

public class Funcionario {
	private int matricula;
	private int rg;
	private String nome;
	private String funcao;
	private String senha;

	public Funcionario(int matricula, int rg, String nome, String funcao, String senha) {
		super();
		this.matricula = matricula;
		this.rg = rg;
		this.nome = nome;
		this.funcao = funcao;
		this.senha = senha;
	}

	public double darDesconto(double totalCompra) {
		if (this.funcao.equalsIgnoreCase("gerente")) {
			double desconto = (totalCompra *15)/100;
			return totalCompra -= desconto;
		}
		return totalCompra;
	}
}

