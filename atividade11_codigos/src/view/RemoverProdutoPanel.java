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

public class RemoverProdutoPanel extends JPanel {
	private JPanel panelTitulo, panelCod, panelSelecionarRemocao, panelButtonRem;
	private JLabel removerProdutoLabel, codBarrasProdutoLabel;
	private JTextField codBarrasProdutoField;
	private JButton removerButton, removerButton2;
	private JPanel buttons;
	private JRadioButton jRadioButton;
	private ButtonGroup buttonGroup, buttonGroup2;
	private JFrame opcoesFrame;

	public RemoverProdutoPanel() {
		panelTitulo = new JPanel();
		setLayout(new SpringLayout());

		removerProdutoLabel = new JLabel("Remover Produto");
		removerProdutoLabel.setFont(new Font("Remover Produto", Font.BOLD, 18));
		codBarrasProdutoField = new JTextField(8);
		panelTitulo.add(removerProdutoLabel);
		add(panelTitulo);
		panelCod = new JPanel();
		codBarrasProdutoLabel = new JLabel("Cod. Barras");
		removerButton = new JButton("Remover/Buscar");
		removerButton2 = new JButton("Remover");

		panelCod.add(codBarrasProdutoLabel);
		panelCod.add(codBarrasProdutoField);
		add(panelCod);

		panelButtonRem = new JPanel();
		panelButtonRem.add(removerButton);
		add(panelButtonRem);

		
		opcoesFrame = new JFrame("Escolha qual objeto você quer remover");
		buttonGroup2 = new ButtonGroup();
		
		panelSelecionarRemocao = new BuscarProdutoPanel();
		buttons = new JPanel();

		SpringUtilities.makeCompactGrid(this, 3, 1, 1, 1, 1, 1);

	}

	public Component criarOpcoes(String nome, Double preco, Date validade, String codBarras) {
		jRadioButton = new JRadioButton(
				nome + "," + "R$ " + preco + ",validade" + validade + ",Cod. Barras" + codBarras);
		return buttons.add(jRadioButton);
	}

	public JButton getRemoverButton() {
		return removerButton;
	}

	public JTextField getCodBarrasProdutoField() {
		return codBarrasProdutoField;
	}

	public JPanel getPanelSelecionarRemocao() {
		return panelSelecionarRemocao;
	}

}
