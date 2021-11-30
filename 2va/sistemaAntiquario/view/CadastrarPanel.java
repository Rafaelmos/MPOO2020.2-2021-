package view;

import java.awt.Dimension;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class CadastrarPanel extends JPanel {
	private ButtonGroup buttonGroup;
	private JRadioButton livroButton, dvdButton, moedaButton;
	private JLabel codBarrasJLabel, quantidadeJLabel, precoJLabel;
	private JTextField codBarrasField, quantidaeField, precoField;
	private JPanel scrollJPanel, produtoJPanel, radioJPanel, buttonPanel, panelPrincial;
	private CadastrarLivroPanel cadastrarLivroPanel;
	private CadastrarDVDPanel cadastrarDVDPanel;
	private CadastrarMoedaPanel cadastrarMoedaPanel;
	private JButton cadastrarButton;
	private JScrollPane jScrollPane;

	public CadastrarPanel() {
		setLayout(new SpringLayout());
		produtoJPanel = new JPanel();
		panelPrincial = new JPanel();
		radioJPanel = new JPanel();
		codBarrasJLabel = new JLabel("Cod. Barras: ");
		quantidadeJLabel = new JLabel("Quantidade: ");
		precoJLabel = new JLabel("Preço: ");
		cadastrarButton = new JButton("Cadastrar");
		codBarrasField = new JTextField(10);
		quantidaeField = new JTextField(10);
		precoField = new JTextField(10);
		scrollJPanel = new JPanel();
		scrollJPanel.setLayout(new SpringLayout());
		cadastrarLivroPanel = new CadastrarLivroPanel();
		cadastrarDVDPanel = new CadastrarDVDPanel();
		cadastrarMoedaPanel = new CadastrarMoedaPanel();
		jScrollPane = new JScrollPane();
		buttonPanel = new JPanel();
		buttonGroup = new ButtonGroup();
		livroButton = new JRadioButton("Livro");
		dvdButton = new JRadioButton("Dvd");
		moedaButton = new JRadioButton("Moeda");
		buttonGroup.add(livroButton);
		buttonGroup.add(dvdButton);
		buttonGroup.add(moedaButton);

		produtoJPanel.setLayout(new SpringLayout());
		produtoJPanel.add(codBarrasJLabel);
		produtoJPanel.add(codBarrasField);

		produtoJPanel.add(quantidadeJLabel);
		produtoJPanel.add(quantidaeField);

		produtoJPanel.add(precoJLabel);
		produtoJPanel.add(precoField);

		radioJPanel.add(livroButton);
		radioJPanel.add(dvdButton);
		radioJPanel.add(moedaButton);

		scrollJPanel.add(produtoJPanel);
		scrollJPanel.add(radioJPanel);

		scrollJPanel.add(cadastrarLivroPanel);
		cadastrarLivroPanel.setVisible(false);
		scrollJPanel.add(cadastrarDVDPanel);
		cadastrarDVDPanel.setVisible(false);
		scrollJPanel.add(cadastrarMoedaPanel);
		cadastrarMoedaPanel.setVisible(false);

		buttonPanel.add(cadastrarButton);

		panelPrincial.add(scrollJPanel);
		panelPrincial.add(buttonPanel);
		panelPrincial.setLayout(new SpringLayout());
		add(panelPrincial);
		
		jScrollPane.setPreferredSize(new Dimension(400, 380));
		jScrollPane.setViewportView(panelPrincial);
		
		add(jScrollPane);
		
		SpringUtilities.makeCompactGrid(produtoJPanel, 3, 2, 1, 1, 1, 1);
		SpringUtilities.makeCompactGrid(scrollJPanel, 5, 1, 1, 1, 1, 1);
		SpringUtilities.makeCompactGrid(panelPrincial, 2, 1, 1, 1, 1, 1);

		SpringUtilities.makeCompactGrid(this, 1, 1, 1, 1, 1, 1);
		setVisible(true);

	}

	public JTextField getCodBarrasField() {
		return codBarrasField;
	}

	public JTextField getQuantidaeField() {
		return quantidaeField;
	}

	public JTextField getPrecoField() {
		return precoField;
	}


	public CadastrarLivroPanel getCadastrarLivroPanel() {
		return cadastrarLivroPanel;
	}

	public CadastrarDVDPanel getCadastrarDVDPanel() {
		return cadastrarDVDPanel;
	}

	public CadastrarMoedaPanel getCadastrarMoedaPanel() {
		return cadastrarMoedaPanel;
	}

	public JButton getCadastrarButton() {
		return cadastrarButton;
	}

	public JRadioButton getLivroButton() {
		return livroButton;
	}

	public JRadioButton getDvdButton() {
		return dvdButton;
	}

	public JRadioButton getMoedaButton() {
		return moedaButton;
	}

}
