package app;

import controller.Controller;
import model.BaseDados;
import model.ProdutoNullException;

public class App {
	public static void main(String[] args) throws ProdutoNullException {

		new Controller();
		BaseDados.listarProdutos();

	}
}