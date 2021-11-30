package model;

public class Moeda extends Produto{
	private String tipo, pais, estado;
	private double valor;
	private int anoLancamento;
	public Moeda(String codBarras, double preco, double precoPromocional, int quantidade, String tipo, String pais,
			String estado, double valor, int anoLancamento) {
		super(codBarras, preco, precoPromocional, quantidade);
		this.tipo = tipo;
		this.pais = pais;
		this.estado = estado;
		this.valor = valor;
		this.anoLancamento = anoLancamento;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
		
	
	
}
