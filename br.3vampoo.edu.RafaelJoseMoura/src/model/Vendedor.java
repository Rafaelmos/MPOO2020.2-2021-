package model;

public class Vendedor extends Funcionario {
	public double comissao;

	public Vendedor(String nome, String cpf) {
		super(nome, cpf);
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

}
