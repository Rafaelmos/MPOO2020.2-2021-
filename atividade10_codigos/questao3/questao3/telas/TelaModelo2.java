package questao3.telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import questao3.Controller;
import questao3.TelaModelo;

public abstract class TelaModelo2 extends TelaModelo {
	private JMenuBar menuBar;
	private JMenu menuTitle;
	private JMenuItem menuItem;
	private JButton buttonSair;
	public TelaModelo2() {
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

	}

	private void criarMenu() {
		menuItem = new JMenuItem("Cliente");
		menuTitle.add(menuItem);
		menuItem.addActionListener(null);
		menuItem = new JMenuItem("Produto");
		menuItem.addActionListener(null);
		menuTitle.add(menuItem);
		menuBar.add(menuTitle);

	}

}
