package questao2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TratamentoPorClasseExterna implements ActionListener {
	TelaMenu telaMenu;

	public TratamentoPorClasseExterna(TelaMenu telaMenu) {
		this.telaMenu = telaMenu;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
			telaMenu.setVisible(false);
	}
	
	
	
}
