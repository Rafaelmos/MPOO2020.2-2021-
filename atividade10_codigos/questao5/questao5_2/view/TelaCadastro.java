package questao5_2.view;

import javax.swing.JButton;
import questao5_2.controller.ControllerEventos;

public class TelaCadastro extends TelaModelo {

	private JButton adicionar, remover, buscar, verificar;
	private ControllerEventos controllerEventos;

	public TelaCadastro(ControllerEventos controllerEventos) {
		setTitle("Tela Cadastro");
		setSize(250, 120);

		
		adicionar = new JButton("Adicionar");
		remover = new JButton("Remover");
		buscar = new JButton("Buscar");
		verificar = new JButton("Verificar");
		this.controllerEventos = controllerEventos;
		adicionar.addActionListener(controllerEventos);
		remover.addActionListener(controllerEventos);
		buscar.addActionListener(controllerEventos);
		verificar.addActionListener(controllerEventos);

		add(adicionar);
		add(remover);
		add(buscar);
		add(verificar);

		setVisible(true);
	}

	public JButton getAdicionar() {
		return adicionar;
	}

	public JButton getRemover() {
		return remover;
	}

	public JButton getBuscar() {
		return buscar;
	}

	public JButton getVerificar() {
		return verificar;
	}

}
