package questao3;

import java.awt.FlowLayout;

import javax.swing.JLabel;

public class OferecerProduto extends TelaCampanha {

	public OferecerProduto() {
		setSize(300, 300);
		setLayout(new FlowLayout());
		oferecerProdutoIdLabel = new JLabel("Id do produto");
		setResizable(false);
		setLocationRelativeTo(null);
		clienteEmailLabel = new JLabel("Email do cliente");
		add(oferecerProdutoIdLabel);
		add(clienteEmailLabel);	
		
		setVisible(true);
	}
	
	
		
}

