package questao3.telas;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import questao3.TelaModelo;

public class TelaBuscarProduto extends TelaModelo2{
	private JLabel idProdutoLabel;
	private JTextField idProdutoJTextField;
	private JButton buscarProdutoButton;
	
	
	public TelaBuscarProduto() {
		
		
		idProdutoLabel = new JLabel("Id do Produto");
		add(idProdutoLabel);
		
		idProdutoJTextField = new JTextField(10);
		add(idProdutoJTextField);
		
		buscarProdutoButton = new JButton("Buscar");
		add(buscarProdutoButton);
		
		setVisible(true);
	}
	
}
