package view;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PromocoesPanel extends JPanel {

	private JTextArea infoArea;

	public PromocoesPanel() {
		infoArea = new JTextArea("Produtos em Promoção:", 15, 27);
		infoArea.setEditable(false);
		JScrollPane scroll = new JScrollPane(infoArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		add(scroll, BorderLayout.CENTER);
	}
}
