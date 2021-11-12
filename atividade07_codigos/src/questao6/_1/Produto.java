package questao6._1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Produto {
	private String nome;
	private double preco;
	private Date validade;
	private String codBarras;
	private int quantidade;
	private Estoque estoque;

	public Produto(String nome, double preco, String validade, int quantidade, String codBarras) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.validade = formatarData(validade);
		this.codBarras = codBarras;
		verificarEstoque(quantidade);
		this.estoque = new Estoque(this);
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", validade=" + validade + ", codBarras=" + codBarras
				+ ", " + estoque + "]";
	}

	private Date formatarData(String validade) {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date data;
		try {
			data = format.parse(validade);
			return data;
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	};

	private void verificarEstoque(int quantidade) {
		if (estoque == null) {
			this.quantidade = quantidade;
		} else {
			this.quantidade = this.estoque.getQuantidade();
		}
	};

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

	public String getCodBarras() {
		return codBarras;
	}

	public void setCodBarras(String codBarras) {
		this.codBarras = codBarras;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Estoque getEstoque() {
		return estoque;
	}

	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}

}
