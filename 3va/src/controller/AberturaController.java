package controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import view.TelaAberturaShop;
import view.TelaSistemaShop;

public class AberturaController {
	TelaAberturaShop telaAberturaShop;
	MouseHandler mouseHandler;

	public AberturaController() {
		telaAberturaShop = new TelaAberturaShop();
		mouseHandler = new MouseHandler();
		control();
	}

	private void control() {
		telaAberturaShop.addMouseListener(mouseHandler);
	}
	
	private class MouseHandler extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			telaAberturaShop.setVisible(false);
			new SistemaShopController();
		}
	}
}
