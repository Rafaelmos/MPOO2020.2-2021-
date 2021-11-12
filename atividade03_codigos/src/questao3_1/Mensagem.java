package questao3_1;

import javax.swing.JOptionPane;

public class Mensagem {
	
	public static final String MENSAGEM_FALHA = "Falha no sistema";
	protected static final String MENSAGEM_SUCESSO = "Operação realziada com sucesso";
	private static final String MENSAGEM_ERRO = "O sistema será finalizado";
	static final String MENSAGEM = "Bem vindo ao sistema";
	
	public static void exibirMensagemBemVindo() {
		JOptionPane.showMessageDialog(null, MENSAGEM);
	}
	
	public static void exibirMensagemErro() {
		JOptionPane.showMessageDialog(null, MENSAGEM_ERRO);
	}
	
	public static String exibirMensagemFalha() {
		JOptionPane.showMessageDialog(null, MENSAGEM_FALHA);
		return null;
	}
	
	public static void exibirMensagem(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}
	


}
