package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
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
	JButton buttonSair;

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

		buttonSair = new JButton("Sair");
		buttonSair.setBorder(null);
		menuBar.add(buttonSair);
		
		buttonSair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == buttonSair) {
					System.exit(0);
				}
			}
		});

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
		menuBar.add(menuTitle);

	}

}
