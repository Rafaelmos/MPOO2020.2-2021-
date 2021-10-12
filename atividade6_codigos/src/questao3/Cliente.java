package questao3;

import java.util.ArrayList;

public class Cliente extends Usuario {
	ArrayList<Conta> contas;

	public Cliente(String cpf, String nome, String telefone, String email) {
		super(cpf, nome, telefone, email);
		this.contas = new ArrayList<Conta>();
	}

	@Override
	public String toString() {
		return super.toString();
	}

	public ArrayList<Conta> getContas() {
		return contas;
	}

}
