package questao2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class TelaInicial extends TelaBase {
	TelaMenu telaMenu;
	JButton botaoInicial;

	public TelaInicial() {
		setTitle("Como fechar um Jframe");
		botaoInicial = new JButton("Abrir outro JFrame");
		botaoInicial.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (telaMenu == null) {
					telaMenu = new TelaMenu();
				} else {
					telaMenu.setVisible(true);
				}

			}
		});
		add(botaoInicial);
		setVisible(true);
	}

}