package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

import model.BaseDados;
import model.DVD;
import model.Livro;
import model.Moeda;
import model.Produto;
import model.ProdutoExisteException;
import model.ProdutoNullException;
import model.TipoErro;
import view.Mensagem;
import view.TelaAbertura;
import view.TelaGerenciamento;

public class Controller {
	private TelaAbertura telaAbertura;
	private TelaGerenciamento telaGerenciamento;
	private AberturaController aberturaController;
	private GerenciamentoController gerenciamentoController;
	private CadastrarProdutoController cadastrarProdutoController;

	public Controller() {
		telaAbertura = new TelaAbertura();
		telaGerenciamento = new TelaGerenciamento();
		aberturaController = new AberturaController();
		gerenciamentoController = new GerenciamentoController();
		cadastrarProdutoController = new CadastrarProdutoController();
	}

	private class AberturaController {
		private KeyHandler keyHandler;

		public AberturaController() {
			keyHandler = new KeyHandler();
			telaAbertura.addKeyListener(keyHandler);

		}

		private class KeyHandler extends KeyAdapter {

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					telaAbertura.setVisible(false);
					telaGerenciamento.setVisible(true);
				}
				if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
					System.exit(0);
				}
			}

		}
	}

	private class GerenciamentoController implements ActionListener {

		public GerenciamentoController() {
			control();
		}

		private void control() {
			telaGerenciamento.getCadastrarItem().addActionListener(this);
			telaGerenciamento.getCadastrarItem()
					.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.ALT_MASK));
			telaGerenciamento.getAtualizarItem().addActionListener(this);
			telaGerenciamento.getAtualizarItem()
					.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.ALT_MASK));
			telaGerenciamento.getPromocaoItem().addActionListener(this);
			telaGerenciamento.getPromocaoItem()
					.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.ALT_MASK));
			telaGerenciamento.getSairItem().addActionListener(this);

		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == telaGerenciamento.getCadastrarItem()) {
				telaGerenciamento.setContentPane(telaGerenciamento.getCadastrarPanel());
				telaGerenciamento.getCadastrarPanel().setVisible(true);
			}
			if (e.getSource() == telaGerenciamento.getAtualizarItem()) {
				telaGerenciamento.setContentPane(telaGerenciamento.getAtualizarEstoquePanel());
				telaGerenciamento.getAtualizarEstoquePanel().setVisible(true);
			}
			if (e.getSource() == telaGerenciamento.getPromocaoItem()) {
				telaGerenciamento.setContentPane(telaGerenciamento.getPromocoesPanel());
				telaGerenciamento.getPromocoesPanel().setVisible(true);
			}
			if (e.getSource() == telaGerenciamento.getSairItem()) {
				int op = JOptionPane.showConfirmDialog(null, "Deseja encerrar o Sistema? ");
				if (op == JOptionPane.YES_OPTION) {
					System.exit(0);
				}

			}
		}

	}

	private class CadastrarProdutoController implements CaretListener, ActionListener, ItemListener {

		public CadastrarProdutoController() {
			control();
		}

		private void control() {
			telaGerenciamento.getCadastrarPanel().getDvdButton().addItemListener(this);
			telaGerenciamento.getCadastrarPanel().getLivroButton().addItemListener(this);
			telaGerenciamento.getCadastrarPanel().getMoedaButton().addItemListener(this);
			telaGerenciamento.getCadastrarPanel().getCadastrarButton().addActionListener(this);

		}

		@Override
		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == telaGerenciamento.getCadastrarPanel().getCadastrarButton()) {
				Produto produto = null;
				if (telaGerenciamento.getCadastrarPanel().getDvdButton().isSelected()) {
					produto = new DVD(telaGerenciamento.getCadastrarPanel().getCodBarrasField().getText(),
							Double.parseDouble(telaGerenciamento.getCadastrarPanel().getPrecoField().getText()),
							Double.parseDouble(telaGerenciamento.getCadastrarPanel().getPrecoField().getText()),
							Integer.parseInt(telaGerenciamento.getCadastrarPanel().getQuantidaeField().getText()),
							telaGerenciamento.getCadastrarPanel().getCadastrarDVDPanel().getAutorField().getText(),
							telaGerenciamento.getCadastrarPanel().getCadastrarDVDPanel().getGeneroField().getText(),
							Integer.parseInt(telaGerenciamento.getCadastrarPanel().getCadastrarDVDPanel()
									.getNumFaixaField().getText()));

				}
				if (telaGerenciamento.getCadastrarPanel().getLivroButton().isSelected()) {
					produto = new Livro(telaGerenciamento.getCadastrarPanel().getCodBarrasField().getText(),
							Double.parseDouble(telaGerenciamento.getCadastrarPanel().getPrecoField().getText()),
							Double.parseDouble(telaGerenciamento.getCadastrarPanel().getPrecoField().getText()),
							Integer.parseInt(telaGerenciamento.getCadastrarPanel().getQuantidaeField().getText()),
							telaGerenciamento.getCadastrarPanel().getCadastrarLivroPanel().getIsbnField().getText(),
							telaGerenciamento.getCadastrarPanel().getCadastrarLivroPanel().getTituloField().getText(),
							telaGerenciamento.getCadastrarPanel().getCadastrarLivroPanel().getAutorField().getText(),
							telaGerenciamento.getCadastrarPanel().getCadastrarLivroPanel().getEditoraField().getText(),
							Integer.parseInt(telaGerenciamento.getCadastrarPanel().getCadastrarLivroPanel()
									.getVolumeField().getText()),
							Integer.parseInt(telaGerenciamento.getCadastrarPanel().getCadastrarLivroPanel()
									.getAnoField().getText()));

				}
				if (telaGerenciamento.getCadastrarPanel().getMoedaButton().isSelected()) {
					produto = new Moeda(telaGerenciamento.getCadastrarPanel().getCodBarrasField().getText(),
							Double.parseDouble(telaGerenciamento.getCadastrarPanel().getPrecoField().getText()),
							Double.parseDouble(telaGerenciamento.getCadastrarPanel().getPrecoField().getText()),
							Integer.parseInt(telaGerenciamento.getCadastrarPanel().getQuantidaeField().getText()),
							telaGerenciamento.getCadastrarPanel().getCadastrarMoedaPanel().getTipoField().getText(),
							telaGerenciamento.getCadastrarPanel().getCadastrarMoedaPanel().getPaisField().getText(),
							telaGerenciamento.getCadastrarPanel().getCadastrarMoedaPanel().getEstadoField().getText(),
							Double.parseDouble(telaGerenciamento.getCadastrarPanel().getCadastrarMoedaPanel().getValorField().getText()),
							Integer.parseInt(telaGerenciamento.getCadastrarPanel().getCadastrarMoedaPanel().getAnoLancamentoField().getText()));
				}

				try {
					BaseDados.adicionarProduto(produto);
				} catch (ProdutoExisteException e1) {
					Mensagem.exibirMensagem(TipoErro.EXISTE_PRODUTO);
				} catch (ProdutoNullException e1) {
					Mensagem.exibirMensagem(TipoErro.NULL_PRODUTO);
				}
				produto = null;
			}
		}

		@Override
		public void caretUpdate(CaretEvent e) {

		}

		@Override
		public void itemStateChanged(ItemEvent e) {
			if (telaGerenciamento.getCadastrarPanel().getDvdButton().isSelected()) {
				fecharPanel();
				telaGerenciamento.getCadastrarPanel().getCadastrarDVDPanel().setVisible(true);
			}
			if (telaGerenciamento.getCadastrarPanel().getLivroButton().isSelected()) {
				fecharPanel();
				telaGerenciamento.getCadastrarPanel().getCadastrarLivroPanel().setVisible(true);
			}
			if (telaGerenciamento.getCadastrarPanel().getMoedaButton().isSelected()) {
				fecharPanel();
				telaGerenciamento.getCadastrarPanel().getCadastrarMoedaPanel().setVisible(true);
			}

		}

		private void fecharPanel() {
			telaGerenciamento.getCadastrarPanel().getCadastrarDVDPanel().setVisible(false);
			telaGerenciamento.getCadastrarPanel().getCadastrarLivroPanel().setVisible(false);
			telaGerenciamento.getCadastrarPanel().getCadastrarMoedaPanel().setVisible(false);

		}
	}

}
