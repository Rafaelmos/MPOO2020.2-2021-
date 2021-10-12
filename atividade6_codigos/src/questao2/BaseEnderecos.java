package questao2;

public class BaseEnderecos {
	
	public static Endereco buscarEndereco(Cliente cliente, String longradouro, int numero) {
		for (Endereco endereco : cliente.getEnderecos()) {
			if (endereco.getNumero() == numero && endereco.getLongradouro().equalsIgnoreCase(longradouro)) {
				return endereco;
			}
		}
		return null;
	}

	public static boolean isEndereco(String longradouro, int numero, String bairro, String cidade, String estado,
			String cep, Cliente cliente) {
		for (Endereco end : cliente.getEnderecos()) {
			if (end.getLongradouro().equalsIgnoreCase(longradouro) && end.getNumero() == numero
					&& end.getBairro().equalsIgnoreCase(bairro) && end.getCidade().equalsIgnoreCase(cidade)
					&& end.getEstado().equalsIgnoreCase(estado) && end.getCep().equalsIgnoreCase(cep)) {
				return true;
			}
		}
		return false;
	}

	public static boolean adicionarEndereco(Cliente cliente, Endereco endereco) {
		if (!isEndereco(endereco.getLongradouro(), endereco.getNumero(), endereco.getBairro(), endereco.getCidade(),
				endereco.getEstado(), endereco.getCep(), cliente)) {
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
