package view;

import java.awt.Dimension;
import java.awt.Font;
import java.util.Observable;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EsperaView extends View {
	//private JLabel numeroEsperaLabel, nomeLabel;
	private JPanel jPanel;
	private FilaPanel filaPanel;
	private String nome, numero;
	

	public EsperaView(String titulo) {
		super(titulo);

		this.getJMenuBar().setVisible(false);
		setSize(new Dimension(300,100));
		filaPanel = new FilaPanel(nome, FilaPanel.getNumeroEsperaLabel().getText());

		filaPanel.getProxButton().setVisible(false);
		setContentPane(filaPanel);
		setVisible(true);
	}

	@Override
	public void update(Observable o, Object arg) {
		FilaPanel.getNomeLabel().setText("" + arg);
		FilaPanel.getNumeroEsperaLabel().setText("" + arg);
	}
}