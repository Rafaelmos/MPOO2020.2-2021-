package view;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import controller.AberturaController;

public class AberturaFrame extends TelaModelo {

	public AberturaFrame(AberturaController aberturaController) {
		setUndecorated(true);
		add(new JLabel(new ImageIcon(getClass().getResource("/img/logo.png"))));

		setVisible(true);
		

	}

}
