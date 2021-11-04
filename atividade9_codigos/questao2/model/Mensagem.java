package model;

import javax.swing.JOptionPane;

public class Mensagem {
	
	public static String exibirMensagem(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
		return mensagem;
		
	}

}