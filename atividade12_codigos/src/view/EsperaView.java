package view;

import java.awt.Font;
import java.util.Observable;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EsperaView extends View {
	private JLabel numeroEsperaLabel, nomeLabel;
	private JPanel jPanel;
	private String nomePaciente;

	public EsperaView(String nome, String numero) {
		super(nome);

		jPanel = new JPanel();
		nomeLabel = new JLabel(nomePaciente);
		numeroEsperaLabel = new JLabel(numero);

		nomeLabel.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 20));
		numeroEsperaLabel.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 25));

		jPanel.add(nomeLabel);
		jPanel.add(numeroEsperaLabel);
		setContentPane(jPanel);
		setVisible(true);
	}

	@Override
	public void update(Observable o, Object arg) {
		nomeLabel.setText("" + arg);
		numeroEsperaLabel.setText("" + arg);
	}

	public JLabel getNumeroEsperaLabel() {
		return numeroEsperaLabel;
	}

}