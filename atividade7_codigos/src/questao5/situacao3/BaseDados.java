package questao5.situacao3;

import java.util.ArrayList;

public class BaseDados {
	private static ArrayList<CaixaInterface> caixas = new ArrayList<CaixaInterface>();
	private static ArrayList<GerenteInterface> gerentes = new ArrayList<GerenteInterface>();
	private static ArrayList<SuperFuncionarioInterface> superFuncionarios = new ArrayList<SuperFuncionarioInterface>();
	private static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

	public static Funcionario buscarFuncionario(Object funcionario) {
		if (isDados(funcionario)) {
			if (isFuncionario(funcionario)) {
				return (Funcionario) funcionario;
			}
			return null;
		}
		return null;
	}

	public static boolean isFuncionario(Object funcionario) {
		if (funcionario instanceof Funcionario) {
			return funcionarios.contains(funcionario);
		}
		return false;
	}

	public static boolean createFuncionario(Object funcionario) {
		if (isFuncionario(funcionario)) {
			return false;
		} else {
			for (Funcionario f : funcionarios) {
				if (f.getCpf().equals(((Funcionario) funcionario).getCpf())) {
					return false;
				}
			}
		}
		if (funcionario instanceof Funcionario) {
			if (funcionario instanceof SuperFuncionario) {
				superFuncionarios.add((SuperFuncionario) funcionario);
				return funcionarios.add((Funcionario) funcionario);
			}
			if (funcionario instanceof Caixa) {
				caixas.add((Caixa) funcionario);
				return funcionarios.add((Funcionario) funcionario);
			}
			if (funcionario instanceof Gerente) {
				gerentes.add((Gerente) funcionario);
				return funcionarios.add((Funcionario) funcionario);

			}
		}
		return false;
	}

	public static boolean deleteFuncionario(Object funcionario) {
		if (isFuncionario(funcionario)) {
			if (funcionario instanceof Funcionario) {
				if (funcionario instanceof SuperFuncionario) {
					gerentes.remove((SuperFuncionario) funcionario);
					return funcionarios.remove((Funcionario) funcionario);
				}
				if (funcionario instanceof Caixa) {
					caixas.remove((Caixa) funcionario);
					return funcionarios.remove((Funcionario) funcionario);
				}
				if (funcionario instanceof Gerente) {
					gerentes.remove((Gerente) funcionario);
					return funcionarios.remove((Funcionario) funcionario);
				}
			}
		}
		return false;
	}

	private static boolean isDados(Object funcionario) {
		if (funcionario instanceof Funcionario) {
			return true;
		}
		return false;
	}

	public static ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public static ArrayList<CaixaInterface> getCaixas() {
		return caixas;
	}

	public static ArrayList<GerenteInterface> getGerentes() {
		return gerentes;
	}

	public static ArrayList<SuperFuncionarioInterface> getSuperFuncionarios() {
		return superFuncionarios;
	}

}
