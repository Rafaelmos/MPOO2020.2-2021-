package questao2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class TelaInicial extends TelaBase {
	TelaMenu telaMenu;
	JButton botaoInicial;

	public TelaInicial() {

		botaoInicial = new JButton("Abrir outro JFrame");
		botaoInicial.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				telaMenu = new TelaMenu();
			}
		});
		add(botaoInicial);
		setVisible(true);
	}

}