package view;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class BuscarProdutoPanel extends JPanel {
	private JPanel panelTitulo, panelCod, panelBuscar;
	private JLabel buscarProdutoLabel, codBarrasProdutoJLabel;
	private JTextField codBarrasProdutoField;
	private JButton buscarButton;

	public BuscarProdutoPanel() {
		setLayout(new SpringLayout());

		panelTitulo = new JPanel();
		buscarProdutoLabel = new JLabel("Buscar Produto");
		buscarProdutoLabel.setFont(new Font("Buscar Produto", Font.BOLD, 18));
		panelTitulo.add(buscarProdutoLabel);

		panelCod = new JPanel();
		codBarrasProdutoJLabel = new JLabel("Cód. Barras: ");
		codBarrasProdutoField = new JTextField(8);
		panelCod.add(codBarrasProdutoJLabel);
		panelCod.add(codBarrasProdutoField);

		panelBuscar = new JPanel();
		buscarButton = new JButton("Buscar");
		panelBuscar.add(buscarButton);
		
		add(panelTitulo);
		add(panelCod);
		add(panelBuscar);

		SpringUtilities.makeCompactGrid(this, 3, 1, 1, 1, 1, 1);
	}
}
