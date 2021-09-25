package questao11;

public class Compra {
	private int id;
	private static int contadorId =0;
	private Produto produto;
	private double valor;
	private boolean isDesconto;
	private double desconto;
	private double totalCompra;
	
	public Compra(int id, Produto produto, double valor, boolean isDesconto, double desconto) {
		super();
		this.id = id;
		this.produto = produto;
		this.valor = valor;
		this.isDesconto = isDesconto;
		this.desconto = desconto;
	}	
	
	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public double totalCompra() {
		totalCompra = produto.getPreco()-this.desconto;
		return totalCompra;
	}
	
	@Override
	public String toString() {
		totalCompra();
		return "Compra [id=" + id + ", produto=" + produto.getNome() + ", valor= R$ " + produto.getPreco() + ", desconto= R$ " + desconto + 
				"Total Compra= R$ " + this.totalCompra + "]";
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public boolean isDesconto() {
		return isDesconto;
	}

	public static int getContadorId() {
		return contadorId;
	}

	public static void setContadorId(int contadorId) {
		Compra.contadorId = contadorId;
	}
	
}
