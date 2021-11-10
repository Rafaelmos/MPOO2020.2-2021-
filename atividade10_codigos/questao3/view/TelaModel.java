package view;

import java.awt.Dimension;

import javax.swing.JFrame;

public abstract class TelaModel extends JFrame{

	public TelaModel() {
		setSize(new Dimension(300, 300));
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	
}
