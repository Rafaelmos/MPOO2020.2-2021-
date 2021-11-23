package view;

import java.awt.Dimension;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.SpringLayout;

public abstract class View extends JFrame implements Observer {

	public View(String titulo) {
		super(titulo);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setSize(new Dimension(500,250));

	}

}