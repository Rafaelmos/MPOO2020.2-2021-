package questao11;

public class Compra {
	private int id;
	private Produto produto;
	private double valor;
	private boolean isDesconto;
	private double desconto;
	private double totalCompra;
	
	public Compra(Produto produto, double valor, boolean isDesconto, double desconto) {
		super();
		this.produto = produto;
		this.valor = valor;
		this.isDesconto = isDesconto;
		this.desconto = desconto;
		Compra compra = new Compra(produto, produto.getPreco(), isDesconto, desconto);
		id+=1;
	}	
	
	public void totalCompra() {
		totalCompra = valor - desconto;
	}
	
	@Override
	public String toString() {
		return "Compra [id=" + id + ", produto=" + produto + ", valor= R$ " + valor + ", desconto= R$ " + desconto + 
				"Total Compra= R$ " + totalCompra + "]";
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
	
}
