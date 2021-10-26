package questao2;

import java.util.ArrayList;

public class BaseDados {
	private static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	private static final String CLIENTE_NULL = "Cliente não existe";

	public static boolean addUsuario(Usuario usuario) {
		try {
			validarUsuario(usuario);
		} catch (NullUsuarioException e) {
			e.printStackTrace();
		}
		if ((buscarUsuario(usuario) == null)) {
			if (buscarUsuario(usuario.getCpf()) == null) {
				return usuarios.add(usuario);
			}
		}
		return false;
	}

	public static boolean removerUsuario(Usuario usuario) {
		try {
			validarUsuario(usuario);
		} catch (NullUsuarioException e) {
			e.printStackTrace();
		}
		if (buscarUsuario(usuario) != null) {
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

	private static void validarUsuario(Usuario usuario) throws NullUsuarioException {
		if (usuario == null || usuario.getNome() == null || usuario.getNome().equals("") || usuario.getCpf() == null
				|| usuario.getCpf().equals("")) {
			throw new NullUsuarioException(CLIENTE_NULL);
		}
	}

	public static Usuario buscarUsuario(Usuario usuario) {
		try {
			validarUsuario(usuario);
		} catch (NullUsuarioException e) {
			e.printStackTrace();
		}

		if (existeUsuario(usuario)) {
			return usuario;
		}

		return null;

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
