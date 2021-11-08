package questao3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TelaMenu extends TelaModel {
	JMenuBar menuBar;
	JMenu menuTitle;
	JMenuItem menuItem;
	TelaCliente telaCliente;
	TelaProduto telaProduto;
	TelaMenu telaMenu;

	public TelaMenu() {
		telaMenu = this;
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
		menuTitle.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});
		menuBar.add(menuTitle);

		setJMenuBar(menuBar);
		setVisible(true);

	}

	private void criarMenu() {
		menuItem = new JMenuItem("Cliente");
		menuTitle.add(menuItem);
		menuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				telaCliente = new TelaCliente(telaMenu);
			}
		});
		menuItem = new JMenuItem("Produto");
		menuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				telaProduto = new TelaProduto(telaMenu);
			}
		});
		menuTitle.add(menuItem);
		menuTitle.addSeparator();
		menuItem = new JMenuItem("Exit");
		menuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		menuTitle.add(menuItem);
		menuBar.add(menuTitle);

	}

}
