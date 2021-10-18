package questao5.situacao1;

import java.util.ArrayList;

public class BaseDados {
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

	public static ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}
}
