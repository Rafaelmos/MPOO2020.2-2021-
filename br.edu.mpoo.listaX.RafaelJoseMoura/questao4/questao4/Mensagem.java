package questao4;



import javax.swing.JOptionPane;

public class Mensagem {

	private static final int ADICIONAR_ERRO = 0;
	private static final int REMOVER_ERRO = 1;
	private static final int ADICIONAR_SUCESSO = 2;
	private static final int REMOVER_SUCESSO = 3;

	public static void exibirMensagem(int tipo){
		switch (tipo) {
		case 0:
			JOptionPane.showMessageDialog(null, "Erro ao adicionar!");
			break;

		case 1:
			JOptionPane.showMessageDialog(null, "Erro ao remover!");
			break;
			
		case 2:
			JOptionPane.showMessageDialog(null, "Adicionado com sucesso!");
			break;
		
		case 3:
			JOptionPane.showMessageDialog(null, "Removido com sucesso!");
			break;
		
		case 4:
			JOptionPane.showMessageDialog(null, "Estragado!");
			break;
		
		case 5:
			JOptionPane.showMessageDialog(null,"Não está estragado!");break;

		}}

	public static int getAdicionarErro() {
		return ADICIONAR_ERRO;
	}

	public static int getRemoverErro() {
		return REMOVER_ERRO;
	}

	public static int getAdicionarSucesso() {
		return ADICIONAR_SUCESSO;
	}

	public static int getRemoverSucesso() {
		return REMOVER_SUCESSO;
	}
}
