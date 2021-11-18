package view;

import java.awt.Component;
import java.awt.Font;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class AtualizarProdutoPanel extends JPanel {
	private JPanel panelTitulo, panelCod, panelSelecionarAtualizacao, panelButtonRem;
	private JLabel atualizarProdutoLabel, codBarrasProdutoLabel;
	private JTextField codBarrasProdutoField;
	private JButton atualizarButton, atualizarButton2;
	private JPanel buttons;
	private JRadioButton jRadioButton;
	private ButtonGroup buttonGroup, buttonGroup2;
	private JFrame opcoesFrame;

	public AtualizarProdutoPanel() {
		panelTitulo = new JPanel();
		setLayout(new SpringLayout());

		atualizarProdutoLabel = new JLabel("Atualizar Produto");
		atualizarProdutoLabel.setFont(new Font("Remover Produto", Font.BOLD, 18));
		codBarrasProdutoField = new JTextField(8);
		panelTitulo.add(atualizarProdutoLabel);
		add(panelTitulo);
		panelCod = new JPanel();
		codBarrasProdutoLabel = new JLabel("Cod. Barras");
		atualizarButton = new JButton("Atualizar/Buscar");
		atualizarButton2 = new JButton("Atualizar");

		panelCod.add(codBarrasProdutoLabel);
		panelCod.add(codBarrasProdutoField);
		add(panelCod);

		panelButtonRem = new JPanel();
		panelButtonRem.add(atualizarButton);
		add(panelButtonRem);

		
		opcoesFrame = new JFrame("Escolha qual produto você quer atualizar");
		buttonGroup2 = new ButtonGroup();
		
		panelSelecionarAtualizacao = new BuscarProdutoPanel();
		buttons = new JPanel();

		SpringUtilities.makeCompactGrid(this, 3, 1, 1, 1, 1, 1);

	}

	public Component criarOpcoes(String nome, Double preco, Date validade, String codBarras) {
		jRadioButton = new JRadioButton(
				nome + "," + "R$ " + preco + ",validade" + validade + ",Cod. Barras" + codBarras);
		return buttons.add(jRadioButton);
	}

	public JButton getAtualizarButton() {
		return atualizarButton;
	}

	public JTextField getCodBarrasProdutoField() {
		return codBarrasProdutoField;
	}

	public JPanel getPanelSelecionarAtualizacao() {
		return panelSelecionarAtualizacao;
	}

}
