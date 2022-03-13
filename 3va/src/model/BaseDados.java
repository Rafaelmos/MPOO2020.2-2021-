package model;

import java.util.ArrayList;

public class BaseDados {
	private ArrayList<Adminstrador> adminstradores;
	private static ArrayList<Item> itens;
	private static ArrayList<Compra> compras;
	private static ArrayList<Funcionario> funcionarios;

	public BaseDados() {
		adminstradores = new ArrayList<Adminstrador>();
	}

	public static void inicializarBase() {
		itens = new ArrayList<Item>();
		compras = new ArrayList<Compra>();
		funcionarios = new ArrayList<Funcionario>();
	}

	public static boolean adicionarFuncionario(Funcionario funcionario) throws FuncionarioException {
		if (funcionario == null || funcionario.getCpf().isEmpty() || funcionario.nome.isEmpty()) {
			throw new FuncionarioException(Constante.FUNCIONARIO_NULL);
		}
		if (funcionarios.contains(funcionario)) {
			throw new FuncionarioException(Constante.FUNCIONARIO_EXISTE);
		}
		return funcionarios.add(funcionario);
	}

	public static Item buscarItem(String codBarras) {
		for (Item item : itens) {
			if (item.getCodBarras().equals(codBarras)) {
				return item;
			}
		}
		return null;
	}

	public ArrayList<Adminstrador> getAdminstradores() {
		return adminstradores;
	}

	public static ArrayList<Item> getItens() {
		return itens;
	}

	public static ArrayList<Compra> getCompras() {
		return compras;
	}

	public static ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}

}
