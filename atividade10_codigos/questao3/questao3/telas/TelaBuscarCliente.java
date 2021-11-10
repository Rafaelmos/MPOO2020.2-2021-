package questao3.telas;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import questao3.Controller;
import questao3.TelaModelo;

public class TelaBuscarCliente extends TelaModelo2{
	JLabel emailJLabel;
	JTextField emailJTextField;
	JButton buscarClienteButton;
	
	public TelaBuscarCliente(Controller controller) {
		
		emailJLabel = new JLabel("Email do Cliente");
		add(emailJLabel);
		
		emailJTextField = new JTextField(10);
		add(emailJTextField);
		
		buscarClienteButton = new JButton("Buscar");
		add(buscarClienteButton);
		
		setVisible(true);
	}
	
}
