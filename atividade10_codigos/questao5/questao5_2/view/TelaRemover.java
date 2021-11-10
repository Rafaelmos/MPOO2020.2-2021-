package questao5_2.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import questao5_2.controller.ControllerEventos;

public class TelaRemover extends TelaModelo {

	private JLabel idLabelRemover;
	private JTextField idFieldRemover;
	private JButton buttonRemover, buttonVoltarRemover;
	private ControllerEventos controllerEventos;

	public TelaRemover(ControllerEventos controllerEventos) {
		setTitle("Remover");
		
		idLabelRemover = new JLabel("ID: ");
		idFieldRemover = new JTextField(10);
		buttonRemover = new JButton("Remover");
		buttonVoltarRemover = new JButton("Voltar");
		this.controllerEventos = controllerEventos;

		add(idLabelRemover);
		add(idFieldRemover);
		add(buttonRemover);
		buttonRemover.addActionListener(controllerEventos);
		add(buttonVoltarRemover);
		buttonVoltarRemover.addActionListener(controllerEventos);

	}

	public JLabel getIdLabelRemover() {
		return idLabelRemover;
	}

	public JTextField getIdFieldRemover() {
		return idFieldRemover;
	}

	public JButton getButtonRemover() {
		return buttonRemover;
	}

	public JButton getButtonVoltarRemover() {
		return buttonVoltarRemover;
	}

}
