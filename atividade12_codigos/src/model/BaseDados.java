package model;

import java.util.ArrayList;

public class BaseDados {
	private static ArrayList<PacienteModel> pacientes = new ArrayList<PacienteModel>();

	public static boolean adicionarPaciente(PacienteModel paciente) {
		if (buscarPaciente(paciente) == null) {
			return adicionarPaciente(paciente);
		}
		return false;
	}

	public static boolean isPaciente(PacienteModel paciente) {
		for (PacienteModel paci : pacientes) {
			if (paci.getCpf().equals(paciente.getCpf())) {
				return true;
			}
		}
		return pacientes.contains(paciente);
	}

	public static PacienteModel buscarPaciente(PacienteModel paciente) {
		if (isPaciente(paciente)) {
			return paciente;
		}
		return null;
	}

	public static PacienteModel buscarPaciente(String cpf) {
		for (PacienteModel paciente : pacientes) {
			if (paciente.getCpf().equals(cpf)) {
				return paciente;
			}
		}
		return null;
	}

	public static boolean remover(PacienteModel paciente) {
		if (buscarPaciente(paciente) != null) {
			return pacientes.remove(paciente);
		}
		return false;
	}

	public static boolean atualizar(PacienteModel pacienteNew, PacienteModel pacienteOld) {
		if (buscarPaciente(pacienteOld) != null) {
			pacientes.set(pacientes.indexOf(buscarPaciente(pacienteOld)), pacienteOld);
			return true;
		}
		return false;
	}
}
