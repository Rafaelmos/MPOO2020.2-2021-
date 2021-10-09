package questao2;

public class BaseEnderecos {

	public static Endereco buscarEndereco(Cliente cliente, Endereco endereco) {
		if (!cliente.getEnderecos().contains(endereco) && (BaseDados.buscarCliente(cliente.getCpf()) != null)) {
			return endereco;
		} else {
		}
		return null;
	}

	public static boolean adicionarEndereco(Cliente cliente, Endereco endereco) {
		if (buscarEndereco(cliente, endereco) != null && (BaseDados.buscarCliente(cliente.getCpf()) != null)) {
			return cliente.getEnderecos().add(endereco);
		}
		return false;
	}

	public static boolean removerEndereco(Cliente cliente, Endereco endereco) {
		if (cliente.getEnderecos().contains(endereco) && (BaseDados.buscarCliente(cliente.getCpf()) != null)) {
			return cliente.getEnderecos().remove(endereco);
		}
		return false;

	}

	public static boolean atualizarEndereco(Cliente cliente, Endereco enderecoOld, Endereco enderecoNew) {
		if (BaseDados.buscarCliente(cliente.getCpf()) != null) {

			for (Endereco endereco : cliente.getEnderecos()) {
				if (endereco.equals(enderecoOld)) {
					cliente.getEnderecos().remove(endereco);
					return adicionarEndereco(cliente, enderecoNew);
				}

			}

		}
		return false;

	}

}
