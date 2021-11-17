package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

public class CadastrarProdutoPanel extends JPanel {
	private JLabel cadastrarProdutoLabel, nomeProdutoJLabel, precoProdutoJLabel, validadeProdutoJLabel,
			codBarrasProdutoJLabel, unidadeMediaProdutoJLabel, pesoProdutoJLabel, quantidadeProdutoJLabel;
	private JTextField nomeProdutoField, codBarrasProdutoField, quantidadeProdutoField;
	private JFormattedTextField validadeProdutoField, pesoProdutoField, precoProdutoField;
	private ButtonGroup buttonGroup;
	private JRadioButton kgButton, lButton, mButton, unidButton;
	private JButton salvarButton;
	private JScrollPane jScroll;
	private JPanel panelTitulo, panelScroll, panelLabelsAndsFields, panelSalvar, buttons;
	String unidadeM;

	public CadastrarProdutoPanel() {
		setLayout(new FlowLayout());

		panelTitulo = new JPanel();
		cadastrarProdutoLabel = new JLabel("Cadastrar Produto");
		cadastrarProdutoLabel.setFont(new Font("Cadastrar Produto", Font.BOLD, 18));
		panelTitulo.add(cadastrarProdutoLabel);
		cadastrarProdutoLabel = new JLabel(" ");
		panelTitulo.add(cadastrarProdutoLabel);
		panelLabelsAndsFields = new JPanel();
		nomeProdutoJLabel = new JLabel("Nome: ");
		nomeProdutoField = new JTextField(8);
		precoProdutoJLabel = new JLabel("Preço: ");
		precoProdutoField = new JFormattedTextField("R$ ");
		precoProdutoField.setForeground(Color.GRAY);

		validadeProdutoJLabel = new JLabel("Validade: ");
		validadeProdutoField = new JFormattedTextField();

		codBarrasProdutoJLabel = new JLabel("Cód. Barras: ");
		codBarrasProdutoField = new JTextField(8);
		unidadeMediaProdutoJLabel = new JLabel("Unidade de Medida: ");
		pesoProdutoJLabel = new JLabel("Peso: ");
		pesoProdutoField = new JFormattedTextField();
		pesoProdutoField.setForeground(Color.GRAY);
		quantidadeProdutoJLabel = new JLabel("Quantidade: ");
		quantidadeProdutoField = new JTextField(8);

//		try {
//			maskData(validadeProdutoField);
//			maskPreco(precoProdutoField);
//			maskPeso(pesoProdutoField, unidadeM);
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}

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
		panelLabelsAndsFields.add(codBarrasProdutoJLabel);
		panelLabelsAndsFields.add(codBarrasProdutoField);
		panelLabelsAndsFields.add(validadeProdutoJLabel);
		panelLabelsAndsFields.add(validadeProdutoField);
		panelLabelsAndsFields.add(unidadeMediaProdutoJLabel);
		panelLabelsAndsFields.add(buttons);
		panelLabelsAndsFields.add(pesoProdutoJLabel);
		panelLabelsAndsFields.add(pesoProdutoField);
		panelLabelsAndsFields.add(quantidadeProdutoJLabel);
		panelLabelsAndsFields.add(quantidadeProdutoField);

		panelSalvar = new JPanel();
		salvarButton = new JButton("Salvar");
		panelSalvar.add(salvarButton);

		panelScroll = new JPanel();
		panelScroll.setLayout(new SpringLayout());
		panelScroll.add(panelTitulo);
		panelScroll.add(panelLabelsAndsFields);
		panelScroll.add(panelSalvar);
		add(panelScroll);
		
		jScroll = new JScrollPane();
		jScroll.setPreferredSize(new Dimension(330, 240));
		add(jScroll);
		jScroll.setViewportView(panelScroll);
		SpringUtilities.makeCompactGrid(panelLabelsAndsFields, 7, 2, 1, 1, 1, 1);
		SpringUtilities.makeCompactGrid(panelScroll, 3, 1, 1, 1, 1, 1);

	}

	public String getUnidadeM() {
		return unidadeM;
	}

	public void setUnidadeM(String unidadeM) {
		this.unidadeM = unidadeM;
	}

	public JTextField getNomeProdutoField() {
		return nomeProdutoField;
	}

	public JTextField getCodBarrasProdutoField() {
		return codBarrasProdutoField;
	}

	public JTextField getQuantidadeProdutoField() {
		return quantidadeProdutoField;
	}

	public JFormattedTextField getValidadeProdutoField() {
		return validadeProdutoField;
	}

	public JFormattedTextField getPesoProdutoField() {
		return pesoProdutoField;
	}

	public JFormattedTextField getPrecoProdutoField() {
		return precoProdutoField;
	}

	public JRadioButton getKgButton() {
		return kgButton;
	}

	public JRadioButton getlButton() {
		return lButton;
	}

	public JRadioButton getmButton() {
		return mButton;
	}

	public JRadioButton getUnidButton() {
		return unidButton;
	}

	public JButton getSalvarButton() {
		return salvarButton;
	}

	public JScrollPane getjScroll() {
		return jScroll;
	}

	public JLabel getPesoProdutoJLabel() {
		return pesoProdutoJLabel;
	}

//	private MaskFormatter maskData(JFormattedTextField textfield) throws ParseException {
//		MaskFormatter maskData = new MaskFormatter("##/##/####");
//		maskData.setOverwriteMode(true);
//		maskData.setValidCharacters("0123456789");
//		maskData.install(textfield);
//		return maskData;
//	}
//	
//	private MaskFormatter maskPreco(JFormattedTextField textfield) throws ParseException {
//		MaskFormatter maskData = new MaskFormatter("R$ ####.##");
//		maskData.setOverwriteMode(true);
//		maskData.setValidCharacters("0123456789");
//		maskData.setPlaceholderCharacter('0');
//		maskData.install(textfield);
//		return maskData;
//	}
	
//	private MaskFormatter maskPeso(JFormattedTextField textfield, String unidadeM) throws ParseException {
//		MaskFormatter maskData = new MaskFormatter(unidadeM+ " ####.##");
//		maskData.setOverwriteMode(true);
//		maskData.setValidCharacters("0123456789");
//		maskData.setPlaceholderCharacter('0');
//		maskData.install(textfield);
//		return maskData;
//	}

//	public JLabel getPrecoProdutoJLabel() {
//		return precoProdutoJLabel;
//	}
//
//	public void setPrecoProdutoJLabel(JLabel precoProdutoJLabel) {
//		this.precoProdutoJLabel = precoProdutoJLabel;
//	}
//
//	public JTextField getNomeProdutoField() {
//		return nomeProdutoField;
//	}
//
//	public void setNomeProdutoField(JTextField nomeProdutoField) {
//		this.nomeProdutoField = nomeProdutoField;
//	}
//
//	public JTextField getCodBarrasProdutoField() {
//		return codBarrasProdutoField;
//	}
//
//	public void setCodBarrasProdutoField(JTextField codBarrasProdutoField) {
//		this.codBarrasProdutoField = codBarrasProdutoField;
//	}
//
//	public JTextField getPrecoProdutoField() {
//		return precoProdutoField;
//	}
//
//	public void setPrecoProdutoField(JFormattedTextField precoProdutoField) {
//		this.precoProdutoField = precoProdutoField;
//	}
//
//	public JTextField getQuantidadeProdutoField() {
//		return quantidadeProdutoField;
//	}
//
//	public void setQuantidadeProdutoField(JTextField quantidadeProdutoField) {
//		this.quantidadeProdutoField = quantidadeProdutoField;
//	}
//
//	public JFormattedTextField getValidadeProdutoField() {
//		return validadeProdutoField;
//	}
//
//	public void setValidadeProdutoField(JFormattedTextField validadeProdutoField) {
//		this.validadeProdutoField = validadeProdutoField;
//	}
//
//	public JFormattedTextField getPesoProdutoField() {
//		return pesoProdutoField;
//	}
//
//	public void setPesoProdutoField(JFormattedTextField pesoProdutoField) {
//		this.pesoProdutoField = pesoProdutoField;
//	}
//
//	public JScrollPane getjScroll() {
//		return jScroll;
//	}
//
//	public JRadioButton getKgButton() {
//		return kgButton;
//	}
//
//	public JRadioButton getlButton() {
//		return lButton;
//	}
//
//	public JRadioButton getmButton() {
//		return mButton;
//	}
//
//	public JButton getSalvarButton() {
//		return salvarButton;
//	}
//
//	public void setUnidadeM(String unidadeM) {
//		this.unidadeM = unidadeM;
//	}
//	
//	public String getUnidadeM() {
//		return unidadeM;
//	}

	
	
}
