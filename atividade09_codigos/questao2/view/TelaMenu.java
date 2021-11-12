package view;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TelaMenu extends TelaModel {
	JMenuBar menuBar;
	JMenu menuTitle;
	JMenuItem menuItem;

	public TelaMenu() {
		setTitle("MPOO Market");

		menuBar = new JMenuBar();
		menuTitle = new JMenu("Cadastrar");
		criarMenu();
		menuTitle = new JMenu("Buscar");
		criarMenu();
		menuTitle = new JMenu("Remover");
		criarMenu();
		menuTitle = new JMenu("Atualizar");
		criarMenu();

		menuTitle = new JMenu("Sair");
		menuBar.add(menuTitle);

		setJMenuBar(menuBar);
		setVisible(true);

	}

	private void criarMenu() {
		menuItem = new JMenuItem("Cliente");
		menuTitle.add(menuItem);
		menuItem = new JMenuItem("Produto");
		menuTitle.add(menuItem);
		menuTitle.addSeparator();
		menuItem = new JMenuItem("Exit");
		menuTitle.add(menuItem);
		menuBar.add(menuTitle);

	}

}
