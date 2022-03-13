package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ComissoesPanel extends JFrame {

	private JTextArea infoArea;

	public ComissoesPanel() {
		super("Comiss�es de Venda");
		infoArea = new JTextArea("Produtos em Promo��o:", 15, 27);
		infoArea.setEditable(false);
		JScrollPane scroll = new JScrollPane(infoArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		add(scroll, BorderLayout.CENTER);
	}

}
