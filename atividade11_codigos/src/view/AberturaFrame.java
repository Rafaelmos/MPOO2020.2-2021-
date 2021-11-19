package view;

import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import model.Icone;

public class AberturaFrame extends TelaModelo {
	public AberturaFrame() {
		setUndecorated(true);
		add(new JLabel(new ImageIcon(getClass().getResource("/img/logo.png"))));
		setVisible(true);

		try {
			Icone icone = new Icone(Icone.URL_ICONE);
			setIconImage(icone.getIcone().getImage());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
