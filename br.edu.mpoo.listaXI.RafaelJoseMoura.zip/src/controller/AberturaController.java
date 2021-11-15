package controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import view.AberturaFrame;
import view.GerenciamentoFrame;

public class AberturaController {
	AberturaFrame aberturaFrame;
	Controller controller;
	MouseHandler mouseHandler;
	KeyHandler keyHandler;

	public AberturaController(Controller controller) {
		this.aberturaFrame = new AberturaFrame(this);
		this.controller = controller;
		this.mouseHandler = new MouseHandler();
		this.keyHandler = new KeyHandler();
		
		aberturaFrame.addMouseListener(mouseHandler);
		aberturaFrame.addKeyListener(keyHandler);
	}

	public AberturaFrame getAberturaFrame() {
		return aberturaFrame;
	}

	private class MouseHandler extends MouseAdapter {

		@Override
		public void mouseClicked(MouseEvent e) {
			aberturaFrame.setVisible(false);
			new GerenciamentoFrame();
		}
	}

	private class KeyHandler extends KeyAdapter {

		public void keyPressed(KeyEvent e) {
	    	if (e.getKeyCode() == KeyEvent.VK_ENTER) {
				aberturaFrame.setVisible(false);
				new GerenciamentoFrame();	
			}
	    }
	}
}
