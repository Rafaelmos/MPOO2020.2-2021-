package questao3;

import java.awt.FlowLayout;

import javax.swing.JLabel;

public class OferecerProduto extends TelaCampanha {

	public OferecerProduto() {
		oferecerProduto.setSize(300, 300);
		oferecerProduto.setLayout(new FlowLayout());
		oferecerProdutoIdLabel = new JLabel("Id do produto");
		oferecerProduto.setResizable(false);
		oferecerProduto.setLocationRelativeTo(null);
		clienteEmailLabel = new JLabel("Email do cliente");
		oferecerProduto.add(oferecerProdutoIdLabel);
		oferecerProduto.add(clienteEmailLabel);	}
	
}

