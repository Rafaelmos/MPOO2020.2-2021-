package view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class TelaSistemaShop extends JFrame {
	private JMenuBar menu;
	private JMenu gerenciar, balanco;
	private JMenuItem venderItem, comissaoItem, sairItem;
	private VendaPanel vendaPanel;

	public TelaSistemaShop() {
		super("Shop");
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		setLocationRelativeTo(null);
		setSize(new Dimension(325, 325));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		menu = new JMenuBar();
		gerenciar = new JMenu("Gerenciar");
		balanco = new JMenu("Balanço");
		sairItem = new JMenuItem("Sair");
		venderItem = new JMenuItem("Vender");
		venderItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.ALT_MASK));
		comissaoItem = new JMenuItem("Comissão");
		comissaoItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.ALT_MASK));
		vendaPanel = new VendaPanel();


		menu.add(gerenciar);
		menu.add(balanco);
		menu.add(sairItem);
		gerenciar.add(venderItem);
		balanco.add(comissaoItem);

		setJMenuBar(menu);

		setContentPane(vendaPanel);
		vendaPanel.setVisible(false);
		setVisible(true);

	}

	public JMenuItem getVenderItem() {
		return venderItem;
	}

	public JMenuItem getComissaoItem() {
		return comissaoItem;
	}

	public JMenuItem getSairItem() {
		return sairItem;
	}

	public VendaPanel getVendaPanel() {
		return vendaPanel;
	}
	

}
