package questao3_1;

public class GerenciarVendas {
	
	private static final double comissao=0.02;
	
	public static void calcularComissao(Vendedor vendedor, double valorVenda){
		vendedor.setTotalVendas(vendedor.getTotalVendas() + (valorVenda*comissao));
	}

	public static double getComissao() {
		return comissao;
	}
}
