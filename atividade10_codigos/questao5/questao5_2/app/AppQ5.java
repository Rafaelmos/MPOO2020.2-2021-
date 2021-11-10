package questao5_2.app;

import questao5_2.controller.ControllerEventos;
import questao5_2.model.BaseDados;

public class AppQ5 {

	public static void main(String[] args) {
		BaseDados.inicializarBase();
		new ControllerEventos();
	}
}
