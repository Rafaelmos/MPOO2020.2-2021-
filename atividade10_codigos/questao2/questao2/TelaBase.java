package questao2;

import java.awt.FlowLayout;
import javax.swing.JFrame;

public class TelaBase extends JFrame {

	public TelaBase() {
		super();
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		setSize(350, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
