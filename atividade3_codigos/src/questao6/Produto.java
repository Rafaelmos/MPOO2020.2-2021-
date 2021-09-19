package questao6;

public class Produto {
	private int id;
	private String lote;
	private String nome;
	private double valor;
	private boolean aptoParaDevolucao;
	
	public Produto(int id, String lote, String nome, double valor) {
		super();
		this.id = id;
		this.lote = lote;
		this.nome = nome;
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public boolean isAptoParaDevolucao() {
		return aptoParaDevolucao;
	}

	public void setAptoParaDevolucao(boolean aptoParaDevolucao) {
		this.aptoParaDevolucao = aptoParaDevolucao;
	}
	
	
	
}
