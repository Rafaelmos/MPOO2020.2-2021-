package model;

import java.util.Date;

public class Loja extends Thread implements Venda {
	public String nome;
	public String cnpj;
	public static Date ultimoBalanco;
	public static final double COMISSAO = 0.02;

	public Loja(String nome, String cnpj) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
	}

	@Override
	public boolean calcularComissaoVendedor(Compra compra) {
		for (Funcionario vendedor : BaseDados.getFuncionarios()) {
			if (compra.getFuncionarioResponsavel() instanceof Vendedor
					&& compra.getFuncionarioResponsavel().equals(vendedor)) {
				Vendedor vendTemp = (Vendedor) vendedor;
				vendTemp.comissao = compra.getValor() * COMISSAO;
				BaseDados.getFuncionarios().set(BaseDados.getFuncionarios().indexOf(vendedor), vendTemp);
			}
		}
		return true;
	}
}
