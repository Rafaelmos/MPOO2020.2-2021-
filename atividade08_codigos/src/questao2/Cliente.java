package questao2;

import java.util.ArrayList;

public class Cliente extends Usuario {
	private ArrayList<Conta> contas;

	
	public Cliente(String cpf, String nome) {
		super(cpf, nome);
		contas = new ArrayList<Conta>();
	}

	@Override
	public String toString() {
		return super.toString() + " contas=" + contas + "]";
	}

	public ArrayList<Conta> getContas() {
		return contas;
	}

}
