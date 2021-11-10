package questao3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class TelaCampanha extends TelaModelo {
	JMenuBar menuBar;
	JMenu menuTitle;
	JMenuItem menuItem;
	JFrame oferecerProduto, definirCampanha;
	JLabel oferecerProdutoIdLabel, clienteEmailLabel;
	JTextField oferecerProdutoIdField, clienteEmailJTextField;

	public TelaCampanha() {
		setTitle("MPOO Market");

		menuBar = new JMenuBar();
		definirCampanha = new JFrame();
		menuTitle = new JMenu("Campanha");
		menuItem = new JMenuItem("Oferecer Produto");
		menuTitle.add(menuItem);
		menuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {				
				setVisible(false);
				oferecerProduto.setVisible(true);
			}

		});
		menuItem = new JMenuItem("Definir Campanha");
		menuTitle.add(menuItem);
		menuBar.add(menuTitle);
		menuTitle = new JMenu("Sair");
		menuItem = new JMenuItem("Voltar");
		menuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//VOLTAR PARA O MENU PRINCIPAL
			}
		});
		
		
		menuTitle.add(menuItem);

			
	
		menuBar.add(menuTitle);
		setJMenuBar(menuBar);

		setVisible(true);
	}
}
