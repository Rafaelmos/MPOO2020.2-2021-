package view;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.util.Observable;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class MedicoView extends View {
	private JLabel numeroEsperaLabel, nomeLabel, nomeDadosJLabel, dataNascJLabel, cpflJLabel, telefoneJLabel,
			longradouroJLabel, numeroEndJLabel, cepJLabel, bairroJLabel, estadoLabel, cidadeJLabel, apOrCasa;
	private JTextField nomeDadosField, numeroEndField, bairroField, cidadeField, longadouroField;
	private JFormattedTextField dataNascField, cpfField, telefoneField, cepField;
	private JMenuBar menuBar;
	private JMenu menu, pacienteMenu, pacienteDadosMenu;
	private JMenuItem casdastrarItem, buscarItem, removerItem, atualizarItem, pacienteConsultaItem, filaItem, sairItem;
	private JPanel cadastrarPanel, consultaPanel, filaPanel, cadastrarButtonPanel, scrollJPanel, radiobuttonPanel;
	private JButton buscarButton, atualizarButton, cadastrarButton;
	private JScrollPane jScrollPane;
	private JRadioButton apRadioButton, casaRadioButton;
	private ButtonGroup buttonGroup;
	private String[] estados = { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR",
			"PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }; 
	
	
	public MedicoView(String titulo) {
		super(titulo);

		menuBar = new JMenuBar();
		menu = new JMenu("Gerenciar");
		pacienteMenu = new JMenu("Paciente");
		pacienteDadosMenu = new JMenu("Dados do Paciente");
		pacienteConsultaItem = new JMenuItem("Consulta do Paciente");
		filaItem = new JMenuItem("Fila de Espera");
		sairItem = new JMenuItem("Sair");
		
		nomeLabel = new JLabel();
		cadastrarPanel = new JPanel();
		consultaPanel = new JPanel();
		filaPanel = new JPanel();
		buscarButton = new JButton("Buscar");
		atualizarButton = new JButton("Atualizar");
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
		estadoField = new JTextField();
		cidadeField = new JTextField();
		casdastrarItem = new JMenuItem("Cadastrar");
		buscarItem = new JMenuItem("Buscar");
		removerItem = new JMenuItem("Remover");
		atualizarItem = new JMenuItem("Atualizar");
		cadastrarButtonPanel = new JPanel();
		jScrollPane = new JScrollPane();
		cadastrarButton = new JButton("Cadastrar");
		scrollJPanel = new JPanel();
		

		menu.add(pacienteMenu);
		pacienteDadosMenu.add(casdastrarItem);
		pacienteDadosMenu.add(buscarItem);
		pacienteDadosMenu.add(removerItem);
		pacienteDadosMenu.add(atualizarItem);
		pacienteMenu.add(pacienteDadosMenu);
		pacienteMenu.add(pacienteConsultaItem);
		menu.add(filaItem);
		menuBar.add(menu);
		menuBar.add(sairItem);
		setJMenuBar(menuBar);

		
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
		
		// COLOCAR O RADIONBUTTON
		cadastrarPanel.add(numeroEndJLabel);
		cadastrarPanel.add(numeroEndField);
		cadastrarPanel.add(cepJLabel);
		cadastrarPanel.add(cepField);
		cadastrarPanel.add(bairroJLabel);
		cadastrarPanel.add(bairroField);
		cadastrarPanel.add(estadoLabel);
		cadastrarPanel.add(new Button("COLOCAR O COMBOBOX"));
		// COLOCAR O ESTADO COMO COMBOBOX
		cadastrarPanel.add(cidadeJLabel);
		cadastrarPanel.add(cidadeField);
		scrollJPanel.add(cadastrarButtonPanel);
		
		
		jScrollPane.setPreferredSize(new Dimension(330, 240));
		add(jScrollPane);
		jScrollPane.setViewportView(scrollJPanel);
		//jScrollPane.setLayout(new SpringLayout());
		jScrollPane.add(cadastrarButtonPanel);
		cadastrarButtonPanel.add(cadastrarButton);
		scrollJPanel.add(cadastrarButtonPanel);
		


		


		
		
		
		SpringUtilities.makeCompactGrid(scrollJPanel, 2, 1, 1, 1, 1, 3);
		SpringUtilities.makeCompactGrid(cadastrarPanel, 11, 2, 1, 1, 1, 3);
		setVisible(true);
	}

	@Override
	public void update(Observable o, Object arg) {
		nomeLabel.setText("" + arg);
		numeroEsperaLabel.setText("" + arg);
	}

}
