package questao5_2.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import questao5_2.controller.ControllerEventos;

public class TelaBuscar extends TelaModelo{
	
	private JLabel idLabelBuscar;
	private JTextField idFieldBuscar;
	private JButton buttonBuscar, buttonVoltarBuscar;
	private ControllerEventos controllerEventos;

	public TelaBuscar(ControllerEventos controllerEventos) {
		setTitle("Buscar");
		
		idLabelBuscar = new JLabel("ID: ");
		idFieldBuscar = new JTextField(10);
		buttonBuscar = new JButton("Buscar");
		buttonVoltarBuscar = new JButton("Voltar");
		this.controllerEventos = controllerEventos;

		add(idLabelBuscar);
		add(idFieldBuscar);
		add(buttonBuscar);
		buttonBuscar.addActionListener(controllerEventos);
		add(buttonVoltarBuscar);
		buttonVoltarBuscar.addActionListener(controllerEventos);
	}

	public JLabel getIdLabelBuscar() {
		return idLabelBuscar;
	}

	public JTextField getIdFieldBuscar() {
		return idFieldBuscar;
	}

	public JButton getButtonBuscar() {
		return buttonBuscar;
	}

	public JButton getButtonVoltarBuscar() {
		return buttonVoltarBuscar;
	}

	
}
