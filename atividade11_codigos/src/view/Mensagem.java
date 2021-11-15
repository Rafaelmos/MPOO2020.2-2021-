package view;

import java.awt.HeadlessException;
import java.io.IOException;
import javax.swing.JOptionPane;
import model.Icone;

public class Mensagem extends JOptionPane {
	public final static String MENSAGEM_FALHA = "Erro ao carregar imagem. O sistema será encerrado!";

	public static void exibirMensagemAniversario(String mensagem, String urlIcone)
			throws HeadlessException, IOException {
		try {
			showMessageDialog(null, mensagem, "Ano de Nascimento", JOptionPane.OK_OPTION,
					new Icone(urlIcone).getIcone());
		} catch (HeadlessException | IOException e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void exibirMensagemFalha(String mensagem) {
		showMessageDialog(null, mensagem, "Erro sistema", JOptionPane.ERROR_MESSAGE);
	}
}
