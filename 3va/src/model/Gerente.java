package model;

public class Gerente extends Funcionario {
	private String senha;

	public Gerente(String nome, String cpf, String senha) {
		super(nome, cpf);
		this.senha = senha;
	}

	@Override
	public boolean realizarVenda(Item item, Compra compra) {
		try {
			compra.adicionarItem(item);
		} catch (ItemException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean darDesconto(Compra compra) {
		double novovalor = compra.getValor() - (compra.getValor()*Desconto.DESCONTO);
		compra.setValor(novovalor);
		return false;
		
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
