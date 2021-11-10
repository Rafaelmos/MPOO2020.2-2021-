package questao5_2.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import questao5_2.controller.ControllerEventos;

public class TelaVerificar extends TelaModelo {

	private JLabel idLabelVerificar;
	private JTextField idFieldVerificar;
	private JButton buttonVerificar, buttonVoltarVerificar;
	private ControllerEventos controllerEventos;

	public TelaVerificar(ControllerEventos controllerEventos) {
		setTitle("Verificar Validade");

		idLabelVerificar = new JLabel("ID: ");
		idFieldVerificar = new JTextField(10);
		buttonVoltarVerificar = new JButton("Voltar");
		buttonVerificar = new JButton("Verificar");
		this.controllerEventos = controllerEventos;

		add(idLabelVerificar);
		add(idFieldVerificar);
		add(buttonVerificar);
		buttonVerificar.addActionListener(controllerEventos);
		add(buttonVoltarVerificar);
		buttonVoltarVerificar.addActionListener(controllerEventos);

	}

	public JLabel getIdLabelVerificar() {
		return idLabelVerificar;
	}

	public JTextField getIdFieldVerificar() {
		return idFieldVerificar;
	}

	public JButton getButtonVoltarVerificar() {
		return buttonVoltarVerificar;
	}

	public JButton getButtonVerificar() {
		return buttonVerificar;
	}

	public ControllerEventos getControllerEventos() {
		return controllerEventos;
	}

}
