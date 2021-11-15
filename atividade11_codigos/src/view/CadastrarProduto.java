package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.border.EmptyBorder;

public class CadastrarProduto extends JPanel {
	private JScrollPane jScroll;
	private JLabel cadastrarProdutoLabel, nomeProdutoJLabel, precoProdutoJLabel, validadeProdutoJLabel,
			codBarrasProdutoJLabel, unidadeMediaProdutoJLabel, quantidadeProdutoJLabel;
	private JTextField nomeProdutoField, precoProdutoField, validadeProdutoField, codBarrasProdutoField,
			quantidadeProdutoField;
	private JPanel buttons;
	private ButtonGroup buttonGroup;
	private JRadioButton kgButton, lButton, mButton, unidButton;
	private JButton salvarButton;
	private JPanel panelTitulo, panelScroll, panelLabelsAndsFields, panelSalvar;

	public CadastrarProduto(GerenciamentoFrame gerenciamentoFrame) {
		setSize(new Dimension(300, 200));
		setLayout(new FlowLayout());
		setBorder(new EmptyBorder(5, 5, 5, 5));

		panelTitulo = new JPanel();
		cadastrarProdutoLabel = new JLabel("Cadastrar Produto");
		cadastrarProdutoLabel.setFont(new Font("Cadastrar Produto", Font.BOLD, 18));
		panelTitulo.add(cadastrarProdutoLabel);

		panelLabelsAndsFields = new JPanel();
		nomeProdutoJLabel = new JLabel("Nome: ");
		nomeProdutoField = new JTextField(10);
		precoProdutoJLabel = new JLabel("Preço: ");
		precoProdutoField = new JTextField(10);
		validadeProdutoJLabel = new JLabel("Validade: ");
		validadeProdutoField = new JTextField(10);
		codBarrasProdutoJLabel = new JLabel("Cód. Barras: ");
		codBarrasProdutoField = new JTextField(10);
		unidadeMediaProdutoJLabel = new JLabel("Unidade de Medida: ");
		quantidadeProdutoJLabel = new JLabel("Quantidade: ");
		quantidadeProdutoField = new JTextField(10);
		buttons = new JPanel();
		buttonGroup = new ButtonGroup();
		kgButton = new JRadioButton("Kg");
		lButton = new JRadioButton("L");
		mButton = new JRadioButton("M");
		unidButton = new JRadioButton("Unid.");
		buttonGroup.add(kgButton);
		buttonGroup.add(lButton);
		buttonGroup.add(mButton);
		buttonGroup.add(unidButton);
		buttons.add(kgButton);
		buttons.add(lButton);
		buttons.add(mButton);
		buttons.add(unidButton);
		panelLabelsAndsFields.setLayout(new SpringLayout());
		panelLabelsAndsFields.add(nomeProdutoJLabel);
		panelLabelsAndsFields.add(nomeProdutoField);
		panelLabelsAndsFields.add(precoProdutoJLabel);
		panelLabelsAndsFields.add(precoProdutoField);
		panelLabelsAndsFields.add(validadeProdutoJLabel);
		panelLabelsAndsFields.add(validadeProdutoField);
		panelLabelsAndsFields.add(codBarrasProdutoJLabel);
		panelLabelsAndsFields.add(codBarrasProdutoField);
		panelLabelsAndsFields.add(unidadeMediaProdutoJLabel);
		panelLabelsAndsFields.add(buttons);
		panelLabelsAndsFields.add(quantidadeProdutoJLabel);
		panelLabelsAndsFields.add(quantidadeProdutoField);

		panelSalvar = new JPanel();
		salvarButton = new JButton("Salvar");
		panelSalvar.add(salvarButton);

		panelScroll = new JPanel();
		panelScroll.setLayout(new SpringLayout());
		panelScroll.add(panelTitulo);
		panelScroll.add(panelLabelsAndsFields);
		panelScroll.add(salvarButton);
		add(panelScroll);
		jScroll = new JScrollPane();
		jScroll.setPreferredSize(new Dimension(340, 230));
		add(jScroll);
		jScroll.setViewportView(panelScroll);

		SpringUtilities.makeCompactGrid(panelLabelsAndsFields, 6, 2, 1, 1, 1, 1);
		SpringUtilities.makeCompactGrid(panelScroll, 3, 1, 1, 1, 1, 1);

	}
	
	

}
