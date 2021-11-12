package view;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TelaCampanha extends TelaModel{
	JMenuBar menuBar;
	JMenu menuTitle;
	JMenuItem menuItem;
	
	public TelaCampanha() {
		setTitle("MPOO Market");
		menuBar = new JMenuBar();
		menuTitle = new JMenu("Campanha");
		menuItem = new JMenuItem("Oferecer Produto");
		menuTitle.add(menuItem);
		menuItem = new JMenuItem("Definir Campanha");
		menuTitle.add(menuItem);
		menuBar.add(menuTitle);
		
		
		
		
		
		menuTitle = new JMenu("Sair");
		menuBar.add(menuTitle);
		setJMenuBar(menuBar);
		setVisible(true);
	}
	
}
