package view;


import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class TelaInicial extends TelaModel {
	JLabel label;
	TelaMenu telaMenu;

	public TelaInicial() {
		label = new JLabel(new ImageIcon(getClass().getResource("/resource/inicial.png")));
		add(label);
		setUndecorated(true);
		setVisible(true);
		
		try {
			Thread.sleep(3000);
			setVisible(false);
			telaMenu = new TelaMenu();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		}
		
		
	}

	public TelaMenu getTelaMenu() {
		return telaMenu;
	}

}
