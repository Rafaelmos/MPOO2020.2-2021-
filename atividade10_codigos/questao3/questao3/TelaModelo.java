package questao3;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public abstract class TelaModelo extends JFrame{

	public TelaModelo() {
		setSize(300, 300);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	
}
