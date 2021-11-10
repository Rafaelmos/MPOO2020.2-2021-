package questao5_2.view;

import java.text.ParseException;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import questao5_2.controller.ControllerEventos;

public class TelaAdicionar extends TelaModelo {

	private JLabel idLabelAdicionar, precoLabelAdicionar, validadeLabelAdicionar, nomeLabelAdicionar;
	private JTextField idFieldAdicionar, precoFieldAdicionar, nomeFieldAdicionar;
	private JFormattedTextField validadeFieldAdicionar;
	private JButton buttonAdd, buttonVoltarAdicionar;
	private ControllerEventos controllerEventos;

	public TelaAdicionar(ControllerEventos controllerEventos) {
		setTitle("Adicionar");
		idLabelAdicionar = new JLabel("ID: ");
		idFieldAdicionar = new JTextField(10);
		precoLabelAdicionar = new JLabel("Preço: ");
		precoFieldAdicionar = new JTextField(10);
		nomeLabelAdicionar = new JLabel();
		nomeFieldAdicionar = new JTextField(10);
		validadeLabelAdicionar = new JLabel("Data: ");
		validadeFieldAdicionar = new JFormattedTextField();
		buttonAdd = new JButton("Adicionar");
		buttonVoltarAdicionar = new JButton("Voltar");
		this.controllerEventos = controllerEventos;

		add(idLabelAdicionar);
		add(idFieldAdicionar);
		add(nomeLabelAdicionar);
		add(nomeFieldAdicionar);
		add(precoLabelAdicionar);
		add(precoFieldAdicionar);
		try {
			maskData(validadeFieldAdicionar);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		add(validadeLabelAdicionar);
		add(validadeFieldAdicionar);
		add(buttonAdd);
		buttonAdd.addActionListener(controllerEventos);
		add(buttonVoltarAdicionar);
		buttonVoltarAdicionar.addActionListener(controllerEventos);

	}

	private MaskFormatter maskData(JFormattedTextField textfield) throws ParseException {
		MaskFormatter mask = null;
		mask = new MaskFormatter("##/##/####");
		mask.setOverwriteMode(true);
		mask.setValidCharacters("0123456789");
		mask.install(textfield);
		return mask;
	}

	public JLabel getIdLabelAdicionar() {
		return idLabelAdicionar;
	}

	public JTextField getIdFieldAdicionar() {
		return idFieldAdicionar;
	}

	public JLabel getPrecoLabelAdicionar() {
		return precoLabelAdicionar;
	}

	public JTextField getPrecoFieldAdicionar() {
		return precoFieldAdicionar;
	}

	public JTextField getNomeFieldAdicionar() {
		return nomeFieldAdicionar;
	}

	public JLabel getValidadeLabelAdicionar() {
		return validadeLabelAdicionar;
	}

	public JLabel getNomeLabelAdicionar() {
		return nomeLabelAdicionar;
	}

	public JFormattedTextField getValidadeFieldAdicionar() {
		return validadeFieldAdicionar;
	}

	public JButton getButtonAdd() {
		return buttonAdd;
	}

	public JButton getButtonVoltarAdicionar() {
		return buttonVoltarAdicionar;
	}

	public ControllerEventos getControllerEventos() {
		return controllerEventos;
	}

}
