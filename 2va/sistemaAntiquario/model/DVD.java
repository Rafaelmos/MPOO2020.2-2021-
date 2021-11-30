package model;

public class DVD extends Produto {
	private String autor, genero;
	private int numFaixas;

	public DVD(String codBarras, double preco, double precoPromocional, int quantidade, String autor, String genero,
			int numFaixas) {
		super(codBarras, preco, precoPromocional, quantidade);
		this.autor = autor;
		this.genero = genero;
		this.numFaixas = numFaixas;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getNumFaixas() {
		return numFaixas;
	}

	public void setNumFaixas(int numFaixas) {
		this.numFaixas = numFaixas;
	}

	
}
