package view;

import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.text.ParseException;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class TelaCliente extends TelaMenu {
	JLabel jLabel;
	JTextField jTextField;
	JRadioButton jRadioButton;
	ButtonGroup buttonGroup;

	JButton jButton;

	public TelaCliente() {
		setLayout(new FlowLayout());
		jLabel = new JLabel("Nome:");
		criarTabela(10);
		jLabel = new JLabel("email:");
		criarTabela(5);
		jButton = new JButton("Setar Endereço");
		add(jButton);

		jLabel = new JLabel("Telefone:");
		try {
			MaskFormatter mask = new MaskFormatter("(##)#####-####");
			JFormattedTextField foneField = new JFormattedTextField(mask);
			add(jLabel);
			add(foneField);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		jRadioButton = new JRadioButton("Feminino", true);
		buttonGroup = new ButtonGroup();
		buttonGroup.add(jRadioButton);
		add(jRadioButton);
		jRadioButton = new JRadioButton("Masculino");
		buttonGroup.add(jRadioButton);
		add(jRadioButton);

		Checkbox checkbox = new Checkbox("Aceitar receber promoção");
		add(checkbox);

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
