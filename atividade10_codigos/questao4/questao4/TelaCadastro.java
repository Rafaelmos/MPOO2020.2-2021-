package questao4;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.text.MaskFormatter;

public class TelaCadastro extends JFrame {

	private JFrame telaAdd, telaRemover, telaBuscar, telaVerificar;
	private JButton adicionar, remover, buscar, verificar, buttonAdd, buttonRemover, buttonBuscar, buttonVerificar,
			buttonVoltarAdicionar, buttonVoltarRemover, buttonVoltarBuscar, buttonVoltarVerificar;
	private JLabel nomeLabelAdicionar, precoLabelAdicionar, validadeLabelAdicionar, idLabelAdicionar, idLabelRemover,
			idLabelBuscar, idLabelVerificar;
	private JTextField nomeFieldAdicionar, precoFieldAdicionar, idFieldAdicionar, idFieldRemover, idFieldBuscar,
			idFieldVerificar;
	private JFormattedTextField validadeField;
	private VerificarEvento verificarEvento;

	public TelaCadastro() {
		super("Tela Cadastro");
		setSize(250, 120);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

		verificarEvento = new VerificarEvento();
		adicionar = new JButton("Adicionar");
		remover = new JButton("Remover");
		buscar = new JButton("Buscar");
		verificar = new JButton("Verificar");
		telaAdd = new JFrame("Adicionar");
		telaRemover = new JFrame("Remover");
		telaBuscar = new JFrame("Buscar");
		telaVerificar = new JFrame("Verificar Validade");

		idLabelAdicionar = new JLabel("ID: ");
		idLabelRemover = new JLabel("ID: ");
		idLabelBuscar = new JLabel("ID: ");
		idLabelVerificar = new JLabel("ID: ");
		idFieldAdicionar = new JTextField(10);
		idFieldRemover = new JTextField(10);
		idFieldBuscar = new JTextField(10);
		idFieldVerificar = new JTextField(10);

		nomeLabelAdicionar = new JLabel("Nome: ");
		nomeFieldAdicionar = new JTextField(10);
		precoLabelAdicionar = new JLabel("Preço: ");
		precoFieldAdicionar = new JTextField(10);
		validadeLabelAdicionar = new JLabel("Data: ");
		validadeField = new JFormattedTextField();
		buttonAdd = new JButton("Adicionar");
		buttonVoltarAdicionar = new JButton("Voltar");
		buttonRemover = new JButton("Remover");
		buttonVoltarRemover = new JButton("Voltar");
		buttonBuscar = new JButton("Buscar");
		buttonVoltarBuscar = new JButton("Voltar");
		buttonBuscar = new JButton("Buscar");
		buttonVoltarVerificar = new JButton("Voltar");
		buttonVerificar = new JButton("Verificar");

		adicionar.addActionListener(verificarEvento);
		remover.addActionListener(verificarEvento);
		buscar.addActionListener(verificarEvento);
		verificar.addActionListener(verificarEvento);

		add(adicionar);
		add(remover);
		add(buscar);
		add(verificar);

		telaAdd.setLayout(new FlowLayout());
		telaAdd.setSize(900, 90);
		telaAdd.setDefaultCloseOperation(EXIT_ON_CLOSE);
		telaAdd.setLocationRelativeTo(null);
		telaAdd.setResizable(false);
		telaAdd.add(idLabelAdicionar);
		telaAdd.add(idFieldAdicionar);
		telaAdd.add(nomeLabelAdicionar);
		telaAdd.add(nomeFieldAdicionar);
		telaAdd.add(precoLabelAdicionar);
		telaAdd.add(precoFieldAdicionar);
		try {
			maskData(validadeField);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		telaAdd.add(validadeLabelAdicionar);
		telaAdd.add(validadeField);
		telaAdd.add(buttonAdd);
		buttonAdd.addActionListener(verificarEvento);
		telaAdd.add(buttonVoltarAdicionar);
		buttonVoltarAdicionar.addActionListener(verificarEvento);

		telaRemover.setLayout(new FlowLayout());
		telaRemover.setSize(900, 90);
		telaRemover.setDefaultCloseOperation(EXIT_ON_CLOSE);
		telaRemover.setLocationRelativeTo(null);
		telaRemover.setResizable(false);
		telaRemover.add(idLabelRemover);
		telaRemover.add(idFieldRemover);
		telaRemover.add(buttonRemover);
		buttonRemover.addActionListener(verificarEvento);
		telaRemover.add(buttonVoltarRemover);
		buttonVoltarRemover.addActionListener(verificarEvento);

		telaBuscar.setLayout(new FlowLayout());
		telaBuscar.setSize(900, 90);
		telaBuscar.setDefaultCloseOperation(EXIT_ON_CLOSE);
		telaBuscar.setLocationRelativeTo(null);
		telaBuscar.setResizable(false);
		telaBuscar.add(idLabelBuscar);
		telaBuscar.add(idFieldBuscar);
		telaBuscar.add(buttonBuscar);
		buttonBuscar.addActionListener(verificarEvento);
		telaBuscar.add(buttonVoltarBuscar);
		buttonVoltarBuscar.addActionListener(verificarEvento);

		telaVerificar.setLayout(new FlowLayout());
		telaVerificar.setSize(900, 90);
		telaVerificar.setDefaultCloseOperation(EXIT_ON_CLOSE);
		telaVerificar.setLocationRelativeTo(null);
		telaVerificar.setResizable(false);
		telaVerificar.add(idLabelVerificar);
		telaVerificar.add(idFieldVerificar);
		telaVerificar.add(buttonVerificar);
		buttonVerificar.addActionListener(verificarEvento);
		telaVerificar.add(buttonVoltarVerificar);
		buttonVoltarVerificar.addActionListener(verificarEvento);

		setVisible(true);
	}

	private MaskFormatter maskData(JFormattedTextField textfield) throws ParseException {
		MaskFormatter mask = null;
		mask = new MaskFormatter("##/##/####");
		mask.setOverwriteMode(true);
		mask.setValidCharacters("0123456789");
		mask.install(textfield);
		return mask;
	}

	private class VerificarEvento implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == adicionar) {
				telaAdd.setVisible(true);
			}
			if (e.getSource() == remover) {
				telaRemover.setVisible(true);
			}
			if (e.getSource() == buscar) {
				telaBuscar.setVisible(true);
			}
			if (e.getSource() == verificar) {
				telaVerificar.setVisible(true);
			}
			if (e.getSource() == buttonAdd) {
				Produto produto = new Produto(Integer.parseInt(idFieldAdicionar.getText()),
						nomeFieldAdicionar.getText(), Double.parseDouble(precoFieldAdicionar.getText()),
						validadeField.getText());
				
				BaseDados.adicionarProduto(produto);
			}
			if (e.getSource() == buttonVoltarAdicionar) {
				telaAdd.setVisible(false);
			}
			if (e.getSource() == buttonRemover) {
				BaseDados.removerProduto(BaseDados.buscarProduto(Integer.parseInt(idFieldRemover.getText()), false));
			}
			if (e.getSource() == buttonVoltarRemover) {
				telaRemover.setVisible(false);
			}
			if (e.getSource() == buttonBuscar) {
				BaseDados.buscarProduto(Integer.parseInt(idFieldBuscar.getText()), true);
			}
			if (e.getSource() == buttonVoltarBuscar) {
				telaBuscar.setVisible(false);
			}
			if (e.getSource() == buttonVerificar) {
				BaseDados.verificarPrazoValidade(
						BaseDados.buscarProduto(Integer.parseInt(idFieldVerificar.getText()), false));
			}
			if (e.getSource() == buttonVoltarVerificar) {
				telaVerificar.setVisible(false);
			}

		}

	}
}
