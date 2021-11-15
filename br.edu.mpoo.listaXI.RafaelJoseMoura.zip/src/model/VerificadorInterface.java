package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.chrono.IsoEra;
import java.util.Date;

public interface VerificadorInterface {
	public static boolean verificarValidade(Produto produto) {
		String dataAtualString = "" + LocalDate.now().getDayOfMonth() + "/" + LocalDate.now().getMonthValue() + "/"
				+ LocalDate.now().getYear() + "";
		Date dataAtual = new Date();
		try {
			dataAtual = new SimpleDateFormat("dd/MM/yyyy").parse(dataAtualString);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		if (produto.getValidade().before(dataAtual)) {
			return false;
		}

		return true;
	}
}
