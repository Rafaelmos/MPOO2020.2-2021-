package model;

import java.util.Date;

public interface VerificadorInterface {

	public static boolean verificarValidade(Produto produto) {
		Date dataAtual = new Date(System.currentTimeMillis());
		if (produto.getValidade().before(dataAtual)) {
			return false;
		}
		return true;
	}

}
