package view;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaAberturaShop extends JFrame {
	public TelaAberturaShop() {
		setUndecorated(true);
		setSize(new Dimension(225, 225));
		setLocationRelativeTo(null);
		add(new JLabel(new ImageIcon(getClass().getResource("/img/logo.png"))));
		setVisible(true);

	}

}