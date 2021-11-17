package app;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import controller.Controller;
import model.BaseDados;
import model.Produto;

public class App {
	public static void main(String[] args) {
//		try {
//			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
//		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
//				| UnsupportedLookAndFeelException e) {
//			e.printStackTrace();
//		}
		
		BaseDados.inicializarBase();
		BaseDados.adicionarProduto(new Produto("Batata", 2.50, "25/05/2021", 20, "A23", 2, "Kg"));
		BaseDados.adicionarProduto(new Produto("Batata", 5.0, "15/05/2022", 20, "A23", 2, "Kg"));
		BaseDados.adicionarProduto(new Produto("Batata", 5.0, "15/05/2022", 20, "A23", 2, "Kg"));
		BaseDados.adicionarProduto(new Produto("Batata", 5.0, "15/05/2022", 20, "A23", 2, "Kg"));

		System.out.println(BaseDados.buscarProduto("A23").getEstoque());
		System.out.println(BaseDados.getProdutos());
//	public Produto(String nome, double preco, String validade, int quantidade, String codBarras, double peso,
//		String unidadeDeMedida) {
		new Controller();
	}
}