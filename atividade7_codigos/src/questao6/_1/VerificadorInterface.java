package questao6._1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public interface VerificadorInterface {
	public static boolean verificarValidade(Produto produto) {
		int dia = LocalDate.now().getDayOfMonth();
		int mes = LocalDate.now().getMonthValue();
		int ano = LocalDate.now().getYear();
		String formatada = "" + dia + "/" + mes + "/" + ano + "";
		Date dataAtual = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		try {
			dataAtual = dateFormat.parse(formatada);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		if (produto.getValidade().before(dataAtual)) {
			return false;
		}

		return true;
	}
}
