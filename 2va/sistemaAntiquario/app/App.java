package app;

import controller.Controller;
import model.BaseDados;
import model.Estoque;
import model.Livro;
import model.Moeda;
import model.Produto;
import model.ProdutoExisteException;
import model.ProdutoNullException;
import view.TelaAbertura;
import view.TelaGerenciamento;

public class App {

	public static void main(String[] args) {
		BaseDados.iniciarBase();
//		Livro produto = null;
//		
//		try {
//			BaseDados.buscarProduto(produto);
//		} catch (ProdutoNullException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		new Controller();
		//new TelaAbertura();
	}
	
}
