package view;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public abstract class TelaModelo extends JFrame {

	public TelaModelo() {
		setSize(new Dimension(350, 300));
		setResizable(false);
		setLocationRelativeTo(null);
		//setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
