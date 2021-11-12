package questao5.situacao2;

import java.util.ArrayList;

public class BaseDados {
	private static ArrayList<Caixa> caixas = new ArrayList<Caixa>();
	private static ArrayList<Gerente> gerentes = new ArrayList<Gerente>();
	private static ArrayList<SuperFuncionario> superFuncionarios = new ArrayList<SuperFuncionario>();
	private static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

	public static Funcionario buscarFuncionario(Funcionario funcionario) {
		if (isFuncionario(funcionario)) {
			return funcionario;
		}
		return null;
	}

	public static boolean isFuncionario(Funcionario funcionario) {
		return funcionarios.contains(funcionario);
	}

	public static boolean createFuncionario(Funcionario funcionario) {
		if (isFuncionario(funcionario)) {
			return false;
		}
		for (Funcionario f : funcionarios) {
			if (f.getCpf().equals(funcionario.getCpf())) {
				return false;
			}
		}
		return funcionarios.add(funcionario);
	}

	public static boolean deleteFuncionario(Funcionario funcionario) {
		if (isFuncionario(funcionario)) {
			return funcionarios.remove(funcionario);
		}
		return false;
	}

	private static boolean isDados(Funcionario funcionario) {
		return isFuncionario(funcionario);
	}

	public static boolean createFuncionario(Caixa caixa) {
		if (isFuncionario((Funcionario) caixa)) {
			return false;
		}
		for (Funcionario f : funcionarios) {
			if ((f.getCpf().equalsIgnoreCase(((Funcionario) caixa).getCpf()))) {
				return false;
			}
		}
		funcionarios.add((Funcionario) caixa);
		return caixas.add(caixa);
	}

	public static boolean deleteFuncionario(Caixa caixa) {
		if (isFuncionario((Funcionario) caixa)) {
			funcionarios.remove((Funcionario) caixa);
			return caixas.remove(caixa);
		}
		return false;
	}

	public static boolean createFuncionario(SuperFuncionario superFuncionario) {
		if (isFuncionario((Funcionario) superFuncionario)) {
			return false;
		}
		for (Funcionario f : funcionarios) {
			if ((f.getCpf().equalsIgnoreCase(((Funcionario) superFuncionario).getCpf()))) {
				return false;
			}
		}
		funcionarios.add((Funcionario) superFuncionario);
		return superFuncionarios.add(superFuncionario);
	}

	public static boolean deleteFuncionario(SuperFuncionario superFuncionario) {
		if (isFuncionario((Funcionario) superFuncionario)) {
			funcionarios.remove((Funcionario) superFuncionario);
			return superFuncionarios.remove(superFuncionario);
		}
		return false;
	}

	public static boolean createFuncionario(Gerente gerente) {
		if (isFuncionario((Funcionario) gerente)) {
			return false;
		}
		for (Funcionario f : funcionarios) {
			if ((f.getCpf().equalsIgnoreCase(((Funcionario) gerente).getCpf()))) {
				return false;
			}
		}
		funcionarios.add((Funcionario) gerente);
		return gerentes.add(gerente);
	}

	public static boolean deleteFuncionario(Gerente gerente) {
		if (isFuncionario((Funcionario) gerente)) {
			funcionarios.remove((Funcionario) gerente);
			return gerentes.remove(gerente);
		}
		return false;
	}

	public static ArrayList<SuperFuncionario> getSuperFuncionarios() {
		return superFuncionarios;
	}

	public static ArrayList<Caixa> getCaixas() {
		return caixas;
	}

	public static ArrayList<Gerente> getGerentes() {
		return gerentes;
	}

	public static ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}

}
