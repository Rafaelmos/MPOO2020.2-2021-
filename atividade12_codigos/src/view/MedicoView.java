package view;

import java.awt.Dimension;
import java.util.Observable;

public class MedicoView extends View {
	CadastrarPanel  cadastrarPanel;
	FilaPanel filaPanel;
	
	public MedicoView(String titulo) {
		super(titulo);

		cadastrarPanel = new CadastrarPanel();
		setContentPane(cadastrarPanel);
		cadastrarPanel.setVisible(false);
		filaPanel = new FilaPanel(null, FilaPanel.getNumeroEsperaLabel().getText());
		setContentPane(filaPanel);
		filaPanel.setVisible(false);
		
	}

	@Override
	public void update(Observable o, Object arg) {
		FilaPanel.getNomeLabel().setText("" + arg);
		FilaPanel.getNumeroEsperaLabel().setText("" + arg);
	}

	public CadastrarPanel getCadastrarPanel() {
		return cadastrarPanel;
	}

	public FilaPanel getFilaPanel() {
		return filaPanel;
	}

	
	
	
}
