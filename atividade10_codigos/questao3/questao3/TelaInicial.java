package questao3;


import javax.swing.ImageIcon;
import javax.swing.JLabel;

import questao3.telas.TelaModelo2;

public class TelaInicial extends TelaModelo {
	JLabel label;
	TelaModelo2 telaMenu;

	public TelaInicial() {
		label = new JLabel(new ImageIcon(getClass().getResource("/resource/inicial.png")));
		add(label);
		setUndecorated(true);
		setVisible(true);
		
		try {
			Thread.sleep(3000);
			setVisible(false);
			//telaMenu = new TelaMenu();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		}
		
		
	}

	public TelaModelo2 getTelaMenu() {
		return telaMenu;
	}

}
