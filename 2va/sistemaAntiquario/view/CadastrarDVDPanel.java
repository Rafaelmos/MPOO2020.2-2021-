package view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class CadastrarDVDPanel extends JPanel{
	private JLabel autorJLabel, generoJLabel, numFaixaJLabel;
	private JTextField autorField, generoField, numFaixaField;
	
	public CadastrarDVDPanel() {
		setLayout(new SpringLayout());
		autorJLabel = new JLabel("Autor: ");
		generoJLabel = new JLabel("Gênero: ");
		numFaixaJLabel = new JLabel("num Faixa: ");
		autorField  = new  JTextField(10);
		generoField  = new  JTextField(10);
		numFaixaField  = new  JTextField(10);
		
		add(autorJLabel);
		add(autorField);
		
		add(generoJLabel);
		add(generoField);
		
		add(numFaixaJLabel);
		add(numFaixaField);

		SpringUtilities.makeCompactGrid(this, 3, 2, 1, 1, 1, 1);
		
	}

	public JTextField getAutorField() {
		return autorField;
	}

	public JTextField getGeneroField() {
		return generoField;
	}

	public JTextField getNumFaixaField() {
		return numFaixaField;
	}
	
	

}
