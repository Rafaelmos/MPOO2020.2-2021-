package questao2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

public class TelaMenu extends TelaBase implements ActionListener {
	JButton button;
	TratamentoPorClasseExterna tratamentoPorClasseExterna;
	ClasseInterna classeInterna;

	public TelaMenu() {
		setTitle("Quero Fechar essa Tela");
		setSize(525, 150);
		tratamentoPorClasseExterna = new TratamentoPorClasseExterna(this);
		classeInterna = new ClasseInterna();

		button = new JButton("hide()");
		button.addActionListener(this);
		add(button);

		button = new JButton("dispose()");
		button.addActionListener(classeInterna);
		add(button);

		button = new JButton("setVisible(false)");
		button.addActionListener(tratamentoPorClasseExterna);
		add(button);

		button = new JButton("System.exit(0)");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		add(button);

		add(new JLabel("Experimente Fechar com 'ALT + F4' ou 'X' da Barras de Titulos"));
		add(new JLabel("Alguém sabe fechar com mesmo efeito do 'ALT + F4'?"));

		setVisible(true);

	}

	private class ClasseInterna implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		hide();
	}
}
