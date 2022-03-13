package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import model.Funcionario;

public class VendaPanel extends JPanel{
	private JLabel tituloLabel, numeroCompraLabel ,fucionarioLabel, codBarrasLabel;
	private final String numeroCompra = "Compra Nº ";
	private static int numeroCompraInt = 0;
	private JTextField codBarrasField;
	private String[] array = Funcionario.tranformarArray();
	private JComboBox<String> comboBox;
	private JButton salvarButton, addButton;
	private JLabel nomeLabel, precoLabel;
	private JTextField nomeField, precoField;
	
	public VendaPanel() {
		setLayout(new SpringLayout());
		
		tituloLabel = new JLabel("Dados Venda");
		tituloLabel.setFont(new Font("Dados Venda", Font.BOLD, 18));
		tituloLabel.setForeground(Color.DARK_GRAY);
		numeroCompraLabel = new JLabel(numeroCompra + numeroCompraInt);
		numeroCompraLabel.setForeground(Color.BLUE);
		fucionarioLabel = new JLabel("Funcionário:");
		codBarrasLabel = new JLabel("Cód Barras:");
		codBarrasField = new JTextField("CD001");
		codBarrasField.setForeground(Color.GRAY);
		comboBox = new JComboBox<String> (array);
		salvarButton = new JButton("Salvar");
		addButton = new JButton("Adicionar");
		nomeLabel = new JLabel("Nome:");
		precoLabel = new JLabel("Preço (R$):");
		nomeField = new  JTextField(1);
		precoField = new JTextField(1);
		
		JPanel tituloPanel = new JPanel();
		JPanel numeroCompraPanel = new JPanel();
		JPanel funcionarioPanel = new JPanel();
		JPanel codBarrasPanel = new JPanel();
		JPanel nomePrecoPanel = new JPanel();
		JPanel buttonPanel = new JPanel();
		
		
		nomePrecoPanel.setLayout(new SpringLayout());
		
		
		tituloPanel.add(tituloLabel);
		numeroCompraPanel.add(numeroCompraLabel);
		numeroCompraLabel.setVisible(false);
		funcionarioPanel.add(fucionarioLabel);
		funcionarioPanel.add(comboBox);
		codBarrasPanel.add(codBarrasLabel);
		codBarrasPanel.add(codBarrasField);
		buttonPanel.add(salvarButton);
		salvarButton.setEnabled(false);
		buttonPanel.add(addButton);
		addButton.setEnabled(false);
		nomePrecoPanel.add(nomeLabel);
		nomePrecoPanel.add(nomeField);
		nomeField.setEditable(false);
		nomePrecoPanel.add(precoLabel);
		nomePrecoPanel.add(precoField);
		precoField.setEditable(false);


		
		add(tituloPanel);
		add(numeroCompraPanel);
		add(funcionarioPanel);
		add(codBarrasPanel);
		add(nomePrecoPanel);
		add(buttonPanel);


		SpringUtilities.makeCompactGrid(nomePrecoPanel, 2, 2, 0, 0, 0, 0);
		SpringUtilities.makeCompactGrid(this, 6, 1, 0, 0, 0, 0);
		

	}

	public static int getNumeroCompraInt() {
		return numeroCompraInt;
	}

	public static void setNumeroCompraInt(int numeroCompraInt) {
		VendaPanel.numeroCompraInt = numeroCompraInt;
	}

	public JLabel getNumeroCompraLabel() {
		return numeroCompraLabel;
	}

	public JTextField getCodBarrasField() {
		return codBarrasField;
	}

	public JComboBox<String> getComboBox() {
		return comboBox;
	}

	public JButton getSalvarButton() {
		return salvarButton;
	}

	public JButton getAddButton() {
		return addButton;
	}

	public JTextField getNomeField() {
		return nomeField;
	}

	public JTextField getPrecoField() {
		return precoField;
	}
	
	
	
}
