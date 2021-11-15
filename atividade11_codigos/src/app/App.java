package app;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import controller.Controller;

public class App {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		///Controller controller = new Controller();
		//new TelaProduto();
		//new TelaMenu();,
		new Controller();
	}
}