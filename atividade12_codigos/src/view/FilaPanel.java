package view;

import java.awt.Font;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Spring;
import javax.swing.SpringLayout;

public class FilaPanel extends Panel {

	private JPanel jPanel;
	private static JLabel nomeLabel;
	private static JLabel numeroEsperaLabel;
	private JButton proxButton;

	public FilaPanel(String nomePaciente, String numero) {
		setLayout(new SpringLayout());
		jPanel = new JPanel();
		jPanel.setLayout(new SpringLayout());
		nomeLabel = new JLabel("");
		numeroEsperaLabel = new JLabel("");
		proxButton = new JButton("Próximo");
		
		
		nomeLabel.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 20));
		numeroEsperaLabel.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 25));

		jPanel.add(nomeLabel);
		jPanel.add(numeroEsperaLabel);
		add(jPanel);
		add(proxButton);
		
		SpringUtilities.makeCompactGrid(jPanel, 2, 1, 1, 1, 1, 1);
		SpringUtilities.makeCompactGrid(this, 2, 1, 240, 1, 1, 1);

	}

	public static JLabel getNomeLabel() {
		return nomeLabel;
	}

	public static JLabel getNumeroEsperaLabel() {
		return numeroEsperaLabel;
	}

	public JButton getProxButton() {
		return proxButton;
	}
	
	
	

}
