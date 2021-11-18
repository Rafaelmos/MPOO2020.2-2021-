package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.KeyStroke;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.text.MaskFormatter;
import model.BaseDados;
import model.Produto;
import model.ProdutoExistenteException;
import view.AberturaFrame;
import view.BuscarProdutoPanel;
import view.CadastrarProdutoPanel;
import view.GerenciamentoFrame;
import view.Mensagem;
import view.RemoverProdutoPanel;

public class Controller {

	private Produto produto;
	private AberturaFrame aberturaFrame;
	private AberturaController aberturaController;
	private GerenciamentoController gerenciamentoController;
	private GerenciamentoFrame gerenciamentoFrame;
	private CadastrarProdutoPanel cadastrarProdutoPanel;
	private BuscarProdutoPanel buscarProdutoPanel;
	private RemoverProdutoPanel removerProdutoPanel;
	private CadastrarProdutoController cadastrarProdutoController;
	private String unidadeM;

	public Controller() {

		BaseDados.inicializarBase();

		this.aberturaFrame = new AberturaFrame();
		this.gerenciamentoFrame = new GerenciamentoFrame();
		this.cadastrarProdutoPanel = new CadastrarProdutoPanel();
		this.buscarProdutoPanel = new BuscarProdutoPanel();
		this.removerProdutoPanel = new RemoverProdutoPanel();
		this.aberturaController = new AberturaController();
		this.gerenciamentoController = new GerenciamentoController();
		this.cadastrarProdutoController = new CadastrarProdutoController();

		gerenciamentoController.control();
		aberturaController.control();
		cadastrarProdutoController.control();
	}

	private class GerenciamentoController implements ActionListener {

		public GerenciamentoController() {
			ocultarOuPanes();
		}

		private void control() {

			gerenciamentoFrame.getCadastrarProdutoItem().addActionListener(gerenciamentoController);
			gerenciamentoFrame.getCadastrarProdutoItem()
					.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.ALT_MASK));
			gerenciamentoFrame.getBuscarProdutoItem().addActionListener(gerenciamentoController);
			gerenciamentoFrame.getBuscarProdutoItem()
					.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.ALT_MASK));
			gerenciamentoFrame.getAtualizarProdutoItem().addActionListener(gerenciamentoController);
			gerenciamentoFrame.getAtualizarProdutoItem()
					.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.ALT_MASK));
			gerenciamentoFrame.getRemoverProdutoItem().addActionListener(gerenciamentoController);
			gerenciamentoFrame.getRemoverProdutoItem()
					.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.ALT_MASK));
			gerenciamentoFrame.getDemostrativoControleItem().addActionListener(gerenciamentoController);
			gerenciamentoFrame.getDemostrativoControleItem()
					.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.ALT_MASK));
			gerenciamentoFrame.getVerificadorControleItem().addActionListener(gerenciamentoController);
			gerenciamentoFrame.getVerificadorControleItem()
					.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.ALT_MASK));
			gerenciamentoFrame.getSairItem().addActionListener(gerenciamentoController);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == gerenciamentoFrame.getCadastrarProdutoItem()) {
				cadastrarProdutoPanel.setBounds(-10, 15, 0, 0);
				cadastrarProdutoPanel.setSize(350, 300);
				ocultarOuPanes();
				gerenciamentoFrame.setContentPane(cadastrarProdutoPanel);
				cadastrarProdutoPanel.setVisible(true);
			}
			if (e.getSource() == gerenciamentoFrame.getBuscarProdutoItem()) {
				ocultarOuPanes();
				gerenciamentoFrame.setContentPane(buscarProdutoPanel);
				buscarProdutoPanel.setVisible(true);
			}

			if (e.getSource() == gerenciamentoFrame.getAtualizarProdutoItem()) {
				//
				//
				//

			}

			if (e.getSource() == gerenciamentoFrame.getRemoverProdutoItem()) {
				ocultarOuPanes();
				gerenciamentoFrame.setContentPane(removerProdutoPanel);
				removerProdutoPanel.setVisible(true);
			}
			if (e.getSource() == gerenciamentoFrame.getDemostrativoControleItem()) {
				Mensagem.exibirMensagem("O prejuízo atual é " + BaseDados.getDemostrativo().getValorTotal());
			}

			if (e.getSource() == gerenciamentoFrame.getVerificadorControleItem()) {
				for (int i = 0; i < BaseDados.getProdutos().size(); i++) {
					BaseDados.atualizarEstoque(BaseDados.getProdutos().get(i).getEstoque());
				}
				Mensagem.exibirMensagem("Estoque verificado, caso houve produtos vencidos, os mesmo foram removidos");
			}
			if (e.getSource() == gerenciamentoFrame.getSairItem()) {
				System.exit(0);
			}

		}

		private void ocultarOuPanes() {
			cadastrarProdutoPanel.setVisible(false);
			buscarProdutoPanel.setVisible(false);
			removerProdutoPanel.setVisible(false);
			;
		}

	}

	private class CadastrarProdutoController {
		ButtonHandler buttonHandler;
		KeyHandler keyHandler;
		FieldHandler fieldHandler;
		RadioButtonHandler radioButtonHandler;

		public CadastrarProdutoController() {
			this.buttonHandler = new ButtonHandler();
			this.keyHandler = new KeyHandler();
			this.fieldHandler = new FieldHandler();
			this.radioButtonHandler = new RadioButtonHandler();

		}

		private void control() {
			cadastrarProdutoPanel.getValidadeProdutoField().addFocusListener(fieldHandler);
			cadastrarProdutoPanel.getPrecoProdutoField().addFocusListener(fieldHandler);
			cadastrarProdutoPanel.getPesoProdutoField().addFocusListener(fieldHandler);
			cadastrarProdutoPanel.getlButton().addItemListener(radioButtonHandler);
			cadastrarProdutoPanel.getKgButton().addItemListener(radioButtonHandler);
			cadastrarProdutoPanel.getmButton().addItemListener(radioButtonHandler);
			cadastrarProdutoPanel.getUnidButton().addItemListener(radioButtonHandler);
			cadastrarProdutoPanel.getSalvarButton().addActionListener(buttonHandler);

			cadastrarProdutoPanel.getNomeProdutoField().addCaretListener(fieldHandler);
			cadastrarProdutoPanel.getPrecoProdutoField().addCaretListener(fieldHandler);

			cadastrarProdutoPanel.getCodBarrasProdutoField().addCaretListener(fieldHandler);
			cadastrarProdutoPanel.getValidadeProdutoField().addCaretListener(fieldHandler);

			cadastrarProdutoPanel.getPesoProdutoField().addCaretListener(fieldHandler);
			cadastrarProdutoPanel.getQuantidadeProdutoField().addCaretListener(fieldHandler);
			cadastrarProdutoPanel.getSalvarButton().addKeyListener(keyHandler);
			cadastrarProdutoPanel.getQuantidadeProdutoField().addKeyListener(keyHandler);

			// removerProdutoPanel.getRemoverButton().addActionListener(buttonHandler);

		}

		private class ButtonHandler implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == cadastrarProdutoPanel.getSalvarButton()) {
					
					String stringTemp = cadastrarProdutoPanel.getPrecoProdutoField().getText();
					String[] resu1 = stringTemp.split(" ");

					produto = new Produto(cadastrarProdutoPanel.getNomeProdutoField().getText(),
							Double.parseDouble(resu1[1]), 
							cadastrarProdutoPanel.getValidadeProdutoField().getText(),
							Integer.parseInt(cadastrarProdutoPanel.getQuantidadeProdutoField().getText()),
							cadastrarProdutoPanel.getCodBarrasProdutoField().getText(),
							Double.parseDouble(cadastrarProdutoPanel.getPesoProdutoField().getText()),
							unidadeM);
					try {
						BaseDados.adicionarProduto(produto);
						BaseDados.listarProdutos();

					} catch (ProdutoExistenteException e1) {
						e1.getMessage();
					}

					produto = null;
				}

//				if (e.getSource() == removerProdutoPanel.getRemoverButton()) {
//					String v1 = "";
//					String v2 = "";
//					for (Produto produto : BaseDados.getProdutos()) {
//						v1 = produto.getCodBarras();
//						v2 = removerProdutoPanel.getCodBarrasProdutoField().getText();
//						if (v1.equals(v2)) {
//						
//						}
//					}
//
//				}
			}
		}

		private class RadioButtonHandler implements ItemListener {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (cadastrarProdutoPanel.getKgButton().isSelected()) {
					unidadeM = "Kg";
					ativarFieldPeso();
				}
				if (cadastrarProdutoPanel.getlButton().isSelected()) {
					unidadeM = "L";
					ativarFieldPeso();
				}
				if (cadastrarProdutoPanel.getmButton().isSelected()) {
					unidadeM = "M";
					ativarFieldPeso();
				}
				if (cadastrarProdutoPanel.getUnidButton().isSelected()) {
					unidadeM = "Unid.";
					ativarFieldPeso();
				}

			}

			private void ativarFieldPeso() {
				cadastrarProdutoPanel.getPesoProdutoField().setText("");
				cadastrarProdutoPanel.getPesoProdutoField().setText(unidadeM);
			}

		}

		private class KeyHandler extends KeyAdapter {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getSource() == cadastrarProdutoPanel.getSalvarButton()) {
					if (e.getKeyCode() == KeyEvent.VK_ENTER) {
						cadastrarProdutoPanel.getSalvarButton().doClick();
					}
				}

			}

			@Override
			public void keyTyped(KeyEvent e) {
				if (e.getSource() == cadastrarProdutoPanel.getQuantidadeProdutoField()) {
					if (!(e.getKeyChar() == KeyEvent.VK_0 || e.getKeyChar() == KeyEvent.VK_1
							|| e.getKeyChar() == KeyEvent.VK_2 || e.getKeyChar() == KeyEvent.VK_3
							|| e.getKeyChar() == KeyEvent.VK_4 || e.getKeyChar() == KeyEvent.VK_5
							|| e.getKeyChar() == e.VK_6 || e.getKeyChar() == e.VK_7 || e.getKeyChar() == e.VK_8
							|| e.getKeyChar() == e.VK_9 || e.getKeyChar() == e.VK_BACK_SPACE)) {
						e.consume();
					}

				}

			}

		}

		private class FieldHandler implements CaretListener, FocusListener {

			@Override
			public void focusGained(FocusEvent e) {
				if (e.getSource() == cadastrarProdutoPanel.getValidadeProdutoField()) {
					try {
						maskData(cadastrarProdutoPanel.getValidadeProdutoField());
					} catch (ParseException exception) {
						exception.printStackTrace();
					}
				}
				if (e.getSource() == cadastrarProdutoPanel.getPrecoProdutoField()) {
					cadastrarProdutoPanel.getPrecoProdutoField().setText("");
					cadastrarProdutoPanel.getPrecoProdutoField().setForeground(Color.BLACK);
					try {
						maskPreco(cadastrarProdutoPanel.getPrecoProdutoField());
					} catch (ParseException exception) {
						exception.printStackTrace();
					}
				}
				if (e.getSource() == cadastrarProdutoPanel.getPesoProdutoField()) {
					String comp = cadastrarProdutoPanel.getPesoProdutoField().getText();
					cadastrarProdutoPanel.getPesoProdutoField().setText("");
					cadastrarProdutoPanel.getPesoProdutoField().setForeground(Color.BLACK);
					if (comp.isBlank() || comp.equals("Kg") || comp.equals("L") || comp.equals("M")
							|| comp.equals("Unid.")) {
						try {
							maskPeso(cadastrarProdutoPanel.getPesoProdutoField());
						} catch (ParseException exception) {
							exception.printStackTrace();

						}
					}
				}

			}

			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void caretUpdate(CaretEvent e) {
				if (!cadastrarProdutoPanel.getNomeProdutoField().getText().isBlank()
						&& !cadastrarProdutoPanel.getPrecoProdutoField().getText().isBlank()
						&& !cadastrarProdutoPanel.getCodBarrasProdutoField().getText().isBlank()
						&& !cadastrarProdutoPanel.getPesoProdutoField().getText().isBlank()
						&& !cadastrarProdutoPanel.getQuantidadeProdutoField().getText().isBlank()) {
					cadastrarProdutoPanel.getSalvarButton().setEnabled(true);
				}

			}

		}

		private MaskFormatter maskData(JFormattedTextField textfield) throws ParseException {
			MaskFormatter maskData = new MaskFormatter("##/##/####");
			maskData.setOverwriteMode(true);
			maskData.setValidCharacters("0123456789");
			maskData.install(textfield);
			return maskData;
		}

		private MaskFormatter maskPreco(JFormattedTextField textfield) throws ParseException {
			MaskFormatter maskPreco = new MaskFormatter("R$ ####.##");
			maskPreco.setOverwriteMode(true);
			maskPreco.setValidCharacters("0123456789");
			maskPreco.setPlaceholderCharacter('0');
			maskPreco.install(textfield);
			return maskPreco;
		}

		private MaskFormatter maskPeso(JFormattedTextField textfield) throws ParseException {
			MaskFormatter maskPeso = new MaskFormatter("####.##");
			maskPeso.setOverwriteMode(true);
			maskPeso.setValidCharacters("0123456789");
			maskPeso.setPlaceholderCharacter('0');
			maskPeso.install(textfield);
			return maskPeso;
		}
	}

	private class AberturaController {
		private MouseHandler mouseHandler;
		private KeyHandler keyHandler;

		public AberturaController() {
			this.mouseHandler = new MouseHandler();
			this.keyHandler = new KeyHandler();
		}

		private void control() {
			aberturaFrame.addMouseListener(mouseHandler);
			aberturaFrame.addKeyListener(keyHandler);
		}

		private class MouseHandler extends MouseAdapter {

			@Override
			public void mouseEntered(MouseEvent e) {
				aberturaFrame.setVisible(false);
				gerenciamentoFrame.setVisible(true);
			}
		}

		private class KeyHandler extends KeyAdapter {

			public void keyPressed(KeyEvent e) {
				if (aberturaFrame.isVisible()) {
					if (e.getKeyCode() == KeyEvent.VK_ENTER) {
						aberturaFrame.setVisible(false);
						gerenciamentoFrame.setVisible(true);
					}
					if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
						System.exit(0);
					}
				}

			}
		}

	}

}
