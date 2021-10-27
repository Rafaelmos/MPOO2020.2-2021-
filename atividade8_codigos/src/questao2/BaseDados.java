package questao2;

import java.util.ArrayList;

public class BaseDados {
	private static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	private static final String CLIENTE_NULL = "Cliente n�o existe";

	public static boolean addUsuario(Usuario usuario) {
		try {
			validarUsuario(usuario);
		} catch (NullUsuarioException e) {
			e.printStackTrace();
		}
		if ((buscarUsuario(usuario) == null)) {
			Mensagem.exibirMensagem("Usu�rio adicionado na base");
			return usuarios.add(usuario);
		}
		return false;
	}

	public static boolean removerUsuario(Usuario usuario) throws NullUsuarioException {
		try {
			validarUsuario(usuario);
		} catch (NullUsuarioException e) {
			e.printStackTrace();
		}
		if (buscarUsuario(usuario) != null) {
			Mensagem.exibirMensagem("Usu�rio removido da base");
			return usuarios.remove(usuario);
		}
		return false;

	}

	public static boolean existeUsuario(Usuario usuario) {
		try {
			validarUsuario(usuario);
		} catch (NullUsuarioException e) {
			e.printStackTrace();
		}
		return usuarios.contains(usuario);
	}

	public static Usuario buscarUsuario(String cpf) {

		for (Usuario usuario : usuarios) {
			if (usuario.getCpf().equals(cpf)) {
				return usuario;
			}
		}
		return null;

	}

	public static Usuario buscarUsuario(Usuario usuario) {
		try {
			validarUsuario(usuario);
			if (existeUsuario(usuario)) {
				return buscarUsuario(usuario.getCpf());
			} else {
				validarUsuario(new Cliente(null, null));
			}
		} catch (NullUsuarioException e) {
			//e.printStackTrace();
		}
		return null;

	}

	private static void validarUsuario(Usuario usuario) throws NullUsuarioException {
		if (usuario instanceof Cliente && usuario == null || usuario.getNome() == null || usuario.getNome().equals("")
				|| usuario.getCpf() == null || usuario.getCpf().equals("")) {
			// Essa Exce��o � usada quando h� um usuario do tipo Cliente vazio, seja o
			// objeto ou um atributo do mesmo.
			throw new NullUsuarioException(CLIENTE_NULL);
		} else if (usuario == null || usuario.getNome() == null || usuario.getNome().equals("")
				|| usuario.getCpf() == null || usuario.getCpf().equals("")) {
			// A mesma anterior por�m para qualquer tipo de usuario
			throw new NullUsuarioException("Usu�rio n�o existe");
		}
	}

	public static String consultarDadosUsuario(Usuario usuario) {
		try {
			validarUsuario(usuario);
		} catch (NullUsuarioException e) {
			e.printStackTrace();
		}
		return usuario.toString();
	}

	public static ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

}
