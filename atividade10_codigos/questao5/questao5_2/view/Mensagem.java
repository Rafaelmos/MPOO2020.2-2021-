package questao5_2.view;


import javax.swing.JOptionPane;

public class Mensagem {

	private static final int ADICIONAR_ERRO = 0;
	private static final int REMOVER_ERRO = 1;
	private static final int ADICIONAR_SUCESSO = 2;
	private static final int REMOVER_SUCESSO = 3;
	private static final int BUSCAR_SUCESSO = 6;
	private static final int BUSCAR_FALHA = 7;

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
			JOptionPane.showMessageDialog(null,"Não está estragado!");
			break;
		case 6:
			JOptionPane.showMessageDialog(null,"Produto encontrado com sucesso!");
			break;
		case 7:
			JOptionPane.showMessageDialog(null,"Produto não encontrado!");


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

	public static int getBuscarSucesso() {
		return BUSCAR_SUCESSO;
	}

	public static int getBuscarFalha() {
		return BUSCAR_FALHA;
	}

}
