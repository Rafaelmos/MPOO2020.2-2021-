package model;

import java.util.ArrayList;

public abstract class Funcionario extends Pessoa {
	public Funcionario(String nome, String cpf) {
		super(nome, cpf);
	}

	public abstract boolean realizarVenda(Item item, Compra compra);

	public static String[] tranformarArray() {
		ArrayList<String> arrayList = new ArrayList<>();
		for (Funcionario funcionario : BaseDados.getFuncionarios()) {
			arrayList.add(funcionario.nome);
		}
		String[] array = new String[arrayList.size()];
		for (int i = 0; i < array.length; i++) {
			array[i] = arrayList.get(i);
		}

		return array;

	}

	
}
