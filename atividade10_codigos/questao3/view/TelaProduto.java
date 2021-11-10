package view;

import java.awt.FlowLayout;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class TelaProduto extends TelaMenu {
	JLabel jLabel;
	JTextField jTextField;
	JButton jButton;
	TelaMenu telaMenu;
	int num;

	public TelaProduto(TelaMenu telaMenu) {
		this.telaMenu = telaMenu;
		setLayout(new FlowLayout());
		jLabel = new JLabel("Produto:");
		criarTabela(10);
		jLabel = new JLabel("Preço:");
		criarTabela(5);
		jLabel = new JLabel("Preço Promocional:");
		criarTabela(10);
		jLabel = new JLabel("Validade:");
		try {
			MaskFormatter mask = new MaskFormatter("##/##/####");
			JFormattedTextField foneField = new JFormattedTextField(mask);
			add(jLabel);
			add(foneField);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		jLabel = new JLabel("Cod Barras:");
		criarTabela(8);
		jLabel = new JLabel("Quantidade:");
		criarTabela(5);

		jButton = new JButton("OK");
		add(jButton);
		setVisible(true);
	}

	private void criarTabela(int num) {
		jTextField = new JTextField(num);
		add(jLabel);
		add(jTextField);
	}

}
