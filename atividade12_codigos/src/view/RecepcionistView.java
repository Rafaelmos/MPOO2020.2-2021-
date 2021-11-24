package view;

import java.util.Observable;

public class RecepcionistView extends View {

	private CadastrarPanel cadastrarPanel;
	private FilaPanel filaPanel;
	private String numero;

	public RecepcionistView(String titulo, String numero) {
		super(titulo);
		this.getPacienteConsultaItem().setEnabled(false);

		cadastrarPanel = new CadastrarPanel();
		setContentPane(cadastrarPanel);
		cadastrarPanel.setVisible(false);
		this.numero = numero;
		filaPanel = new FilaPanel("", FilaPanel.getNumeroEsperaLabel().getText());
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

	public String getNumero() {
		return numero;
	}

}
