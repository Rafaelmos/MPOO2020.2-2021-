package questao5_2.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConversorData {

	public static Date formatarData(String validade) {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date data;
		try {
			data = format.parse(validade);
			return data;
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	};
}
