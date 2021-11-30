package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class AtualizarEstoquePanel extends JPanel{
	private JLabel codBarrasJLabel, novaQuantidadeJLabel;
	private JTextField codBarrasField, novaQuantidadeField;
	private JButton atualizarButton;
	private JPanel codbarrasPanel, buttonPanel, principalPanel;
	
	public AtualizarEstoquePanel() {
		codBarrasJLabel = new JLabel("Código Barras: ");
		novaQuantidadeJLabel = new JLabel("Nova quantidade: ");
		codBarrasField = new JTextField(10);
		novaQuantidadeField = new JTextField(10);
		atualizarButton = new JButton("Atualizar");
		codbarrasPanel = new JPanel();
		buttonPanel = new JPanel();
		principalPanel = new JPanel(); 
		principalPanel.setLayout(new SpringLayout());

		codbarrasPanel.setLayout(new SpringLayout());
		codbarrasPanel.add(codBarrasJLabel);
		codbarrasPanel.add(codBarrasField);
		codbarrasPanel.add(novaQuantidadeJLabel);
		codbarrasPanel.add(novaQuantidadeField);
		buttonPanel.add(atualizarButton);
		
		principalPanel.add(codbarrasPanel);
		principalPanel.add(buttonPanel);
		
		add(principalPanel);
		SpringUtilities.makeCompactGrid(codbarrasPanel, 2, 2, 1, 1, 1, 1);
		SpringUtilities.makeCompactGrid(principalPanel, 2, 1, 1, 1, 1, 1);
	}
	
}
