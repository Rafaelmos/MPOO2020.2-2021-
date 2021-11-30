package view;

import java.awt.Dimension;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class TelaAbertura  extends JFrame{
	public TelaAbertura() {
		setSize(new Dimension(350, 260));
		setUndecorated(true);
		setLocationRelativeTo(null);
		add(new JLabel(new ImageIcon(getClass().getResource("/res/logo.png"))));
		
		
		setVisible(true);

		
		
	}

}
