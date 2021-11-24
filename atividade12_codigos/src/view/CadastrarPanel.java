package view;

import java.awt.Dimension;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class CadastrarPanel extends JPanel {

	private JLabel nomeDadosJLabel, dataNascJLabel, cpflJLabel, telefoneJLabel,
			longradouroJLabel, numeroEndJLabel, cepJLabel, bairroJLabel, estadoLabel, cidadeJLabel, apOrCasa;
	private JTextField nomeDadosField, numeroEndField, bairroField, cidadeField, longadouroField;
	private JFormattedTextField dataNascField, cpfField, telefoneField, cepField;
	private JPanel cadastrarPanel, cadastrarButtonPanel, scrollJPanel, radiobuttonPanel;
	private JButton cadastrarButton;
	private JScrollPane jScrollPane;
	private JRadioButton apRadioButton, casaRadioButton;
	private ButtonGroup buttonGroup;
	private String[] estados = { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA",
			"PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" };
	private JComboBox<String> estadosBox;

	public CadastrarPanel() {
		cadastrarPanel = new JPanel();
		nomeDadosJLabel = new JLabel("Nome: ");
		dataNascJLabel = new JLabel("Data Nasc: ");
		cpflJLabel = new JLabel("CPF: ");
		telefoneJLabel = new JLabel("Telefone: ");
		longradouroJLabel = new JLabel("Longadouro:");
		numeroEndJLabel = new JLabel("Número: ");
		cepJLabel = new JLabel("CEP:");
		bairroJLabel = new JLabel("Bairro: ");
		estadoLabel = new JLabel("Estado: ");
		cidadeJLabel = new JLabel("Cidade: ");
		nomeDadosField = new JTextField();
		dataNascField = new JFormattedTextField();
		cpfField = new JFormattedTextField();
		telefoneField = new JFormattedTextField();
		cepField = new JFormattedTextField();
		longadouroField = new JTextField();
		apOrCasa = new JLabel();
		apRadioButton = new JRadioButton("AP");
		casaRadioButton = new JRadioButton("CASA");
		radiobuttonPanel = new JPanel();
		buttonGroup = new ButtonGroup();
		numeroEndField = new JTextField();
		bairroField = new JTextField();
		cidadeField = new JTextField();
		cadastrarButtonPanel = new JPanel();
		jScrollPane = new JScrollPane();
		cadastrarButton = new JButton("Cadastrar");
		scrollJPanel = new JPanel();
		estadosBox = new JComboBox<String>(estados);

		scrollJPanel.add(cadastrarPanel);
		scrollJPanel.setLayout(new SpringLayout());
		cadastrarPanel.setLayout(new SpringLayout());
		cadastrarPanel.add(nomeDadosJLabel);
		cadastrarPanel.add(nomeDadosField);
		cadastrarPanel.add(dataNascJLabel);
		cadastrarPanel.add(dataNascField);
		cadastrarPanel.add(cpflJLabel);
		cadastrarPanel.add(cpfField);
		cadastrarPanel.add(telefoneJLabel);
		cadastrarPanel.add(telefoneField);
		cadastrarPanel.add(longradouroJLabel);
		cadastrarPanel.add(longadouroField);
		cadastrarPanel.add(apOrCasa);
		buttonGroup.add(apRadioButton);
		buttonGroup.add(casaRadioButton);
		radiobuttonPanel.add(apRadioButton);
		radiobuttonPanel.add(casaRadioButton);
		cadastrarPanel.add(radiobuttonPanel);
		cadastrarPanel.add(numeroEndJLabel);
		cadastrarPanel.add(numeroEndField);
		cadastrarPanel.add(cepJLabel);
		cadastrarPanel.add(cepField);
		cadastrarPanel.add(bairroJLabel);
		cadastrarPanel.add(bairroField);
		cadastrarPanel.add(estadoLabel);
		cadastrarPanel.add(estadosBox);
		cadastrarPanel.add(cidadeJLabel);
		cadastrarPanel.add(cidadeField);
		scrollJPanel.add(cadastrarButtonPanel);
		jScrollPane.setPreferredSize(new Dimension(580,180));
		jScrollPane.setViewportView(scrollJPanel);
		jScrollPane.add(cadastrarButtonPanel);
		cadastrarButtonPanel.add(cadastrarButton);
		scrollJPanel.add(cadastrarButtonPanel);
		add(jScrollPane);
		cadastrarPanel.setVisible(true);

		SpringUtilities.makeCompactGrid(scrollJPanel, 2, 1, 1, 1, 1, 1);
		SpringUtilities.makeCompactGrid(cadastrarPanel, 11, 2, 1, 1, 1, 1);
	}

	
}
