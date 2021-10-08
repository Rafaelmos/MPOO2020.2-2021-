package questao2;

public class BaseEnderecos {

	public static Endereco buscarEndereco(Cliente cliente, Endereco endereco) {
		if (!cliente.getEnderecos().contains(endereco)) {
			return endereco;
		} else {
		}
		return null;
	}

	public static boolean adicionarEndereco(Cliente cliente, Endereco endereco) {
		if (buscarEndereco(cliente, endereco) != null) {
			return cliente.getEnderecos().add(endereco);
		}
		return false;
	}

	public static boolean removerEndereco(Cliente cliente, Endereco endereco) {
		if (cliente.getEnderecos().contains(endereco)) {
			return cliente.getEnderecos().remove(endereco);
		}
		return false;

	}

	public static boolean atualizarEndereco(Cliente cliente, Endereco enderecoOld, Endereco enderecoNew) {
		for (Endereco endereco : cliente.getEnderecos()) {
			if (endereco.equals(enderecoOld)) {
				cliente.getEnderecos().remove(enderecoOld);
				return adicionarEndereco(cliente, enderecoNew);
			}
		}
		return false;

	}

}
