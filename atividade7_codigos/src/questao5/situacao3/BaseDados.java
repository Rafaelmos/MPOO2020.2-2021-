package questao5.situacao3;

import java.util.ArrayList;

public class BaseDados {
	private static ArrayList<Caixa> caixas = new ArrayList<Caixa>();
	private static ArrayList<Gerente> gerentes = new ArrayList<Gerente>();
	private static ArrayList<SuperFuncionario> superFuncionarios = new ArrayList<SuperFuncionario>();
	private static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

	public static Funcionario buscarFuncionario(Funcionario funcionario) {
		if (isDados(funcionario)) {
			if (isFuncionario(funcionario)) {
				return (Funcionario) funcionario;
			}
			return null;
		}
		return null;
	}

	public static boolean isFuncionario(Funcionario funcionario) {
		if (funcionario instanceof Funcionario) {
			return funcionarios.contains(funcionario);
		}
		return false;
	}

	public static boolean createFuncionario(Funcionario funcionario) {
		if (isFuncionario(funcionario)) {
			return false;
		} else {
			for (Funcionario f : funcionarios) {
				if (f.getCpf().equals((funcionario).getCpf())) {
					return false;
				}
			}
		}
		if (funcionario instanceof Funcionario) {
			if (funcionario instanceof SuperFuncionario) {
				superFuncionarios.add((SuperFuncionario) funcionario);
				return funcionarios.add(funcionario);
			}
			if (funcionario instanceof Caixa) {
				caixas.add((Caixa) funcionario);
				return funcionarios.add(funcionario);
			}
			if (funcionario instanceof Gerente) {
				gerentes.add((Gerente) funcionario);
				return funcionarios.add(funcionario);

			}
		}
		return false;
	}

	public static boolean deleteFuncionario(Funcionario funcionario) {
		if (isFuncionario(funcionario)) {
			if (funcionario instanceof Funcionario) {
				if (funcionario instanceof SuperFuncionario) {
					gerentes.remove(funcionario);
					return funcionarios.remove(funcionario);
				}
				if (funcionario instanceof Caixa) {
					caixas.remove((Caixa) funcionario);
					return funcionarios.remove(funcionario);
				}
				if (funcionario instanceof Gerente) {
					gerentes.remove((Gerente) funcionario);
					return funcionarios.remove(funcionario);
				}
			}
		}
		return false;
	}

	private static boolean isDados(Funcionario funcionario) {
		if (funcionario instanceof Funcionario) {
			return true;
		}
		return false;
	}

	public static ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public static ArrayList<Caixa> getCaixas() {
		return caixas;
	}

	public static ArrayList<Gerente> getGerentes() {
		return gerentes;
	}

	public static ArrayList<SuperFuncionario> getSuperFuncionarios() {
		return superFuncionarios;
	}

}
