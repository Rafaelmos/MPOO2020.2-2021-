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
import view.AberturaFrame;
import view.BuscarProdutoPanel;
import view.CadastrarProdutoPanel;
import view.GerenciamentoFrame;
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
	private ProdutoController produtoController;
	private String unidadeM;

	public Controller() {

		this.aberturaFrame = new AberturaFrame();
		this.gerenciamentoFrame = new GerenciamentoFrame();
		this.cadastrarProdutoPanel = new CadastrarProdutoPanel();
		this.buscarProdutoPanel = new BuscarProdutoPanel();
		this.removerProdutoPanel = new RemoverProdutoPanel();
		this.aberturaController = new AberturaController();
		this.gerenciamentoController = new GerenciamentoController();
		this.produtoController = new ProdutoController();

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
		aberturaFrame.addMouseListener(aberturaController.mouseHandler);
		aberturaFrame.addKeyListener(aberturaController.keyHandler);
		
		produtoController.control();


	}

	private class GerenciamentoController implements ActionListener {

		public GerenciamentoController() {
			ocultarOuPanes();
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == gerenciamentoFrame.getCadastrarProdutoItem()) {
				cadastrarProdutoPanel.setBounds(-10, 15, 0, 0);
				cadastrarProdutoPanel.setSize(350, 300);
				ocultarOuPanes();
				gerenciamentoFrame.setContentPane(cadastrarProdutoPanel);
				cadastrarProdutoPanel.setVisible(true);
				//produto = new Produto("", 0, "01/01/2021", 0, "", 0, "");
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
				//
				//
				//
			}

			if (e.getSource() == gerenciamentoFrame.getVerificadorControleItem()) {
				//
				//
				//
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

	private class ProdutoController {
		ButtonHandler buttonHandler;
		KeyHandler keyHandler;
		FieldHandler fieldHandler;
		RadioButtonHandler radioButtonHandler;

		public ProdutoController() {
			this.buttonHandler = new ButtonHandler();
			this.keyHandler = new KeyHandler();
			this.fieldHandler = new FieldHandler();
			this.radioButtonHandler = new RadioButtonHandler();

		}
		
		private void control() {
			cadastrarProdutoPanel.getValidadeProdutoField().addFocusListener(produtoController.fieldHandler);
			cadastrarProdutoPanel.getPrecoProdutoField().addFocusListener(produtoController.fieldHandler);
			cadastrarProdutoPanel.getPesoProdutoField().addFocusListener(produtoController.fieldHandler);
			cadastrarProdutoPanel.getlButton().addItemListener(produtoController.radioButtonHandler);
			cadastrarProdutoPanel.getKgButton().addItemListener(produtoController.radioButtonHandler);
			cadastrarProdutoPanel.getmButton().addItemListener(produtoController.radioButtonHandler);
			cadastrarProdutoPanel.getUnidButton().addItemListener(produtoController.radioButtonHandler);
			cadastrarProdutoPanel.getSalvarButton().addActionListener(produtoController.buttonHandler);
			removerProdutoPanel.getRemoverButton().addActionListener(produtoController.buttonHandler);
		}

		private class ButtonHandler implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == cadastrarProdutoPanel.getSalvarButton()) {
					if (produto == null) {
						produto = new Produto("", 0, "01/01/2021", 0, "", 0, "");
					}
					produto.setNome(cadastrarProdutoPanel.getNomeProdutoField().getText());
					String stringTemp = cadastrarProdutoPanel.getPrecoProdutoField().getText();
					String[] resu = stringTemp.split(" ");
					produto.setPreco(Double.parseDouble(resu[1]));
					produto.setValidade(cadastrarProdutoPanel.getValidadeProdutoField().getText());
					produto.setCodBarras(cadastrarProdutoPanel.getCodBarrasProdutoField().getText());
					produto.setQuantidade(
							Integer.parseInt(cadastrarProdutoPanel.getQuantidadeProdutoField().getText()));
					produto.setUnidadeDeMedida(cadastrarProdutoPanel.getCodBarrasProdutoField().getText());
					produto.setPeso(Double.parseDouble(cadastrarProdutoPanel.getPesoProdutoField().getText()));
					produto.setUnidadeDeMedida(unidadeM);
					BaseDados.adicionarProduto(produto);
					produto = null;
					BaseDados.listarProdutos();
				}

				if (e.getSource() == removerProdutoPanel.getRemoverButton()) {
						String v1 = "";
						String v2 = "";
					for (Produto produto : BaseDados.getProdutos()) {
						v1 = produto.getCodBarras();
						v2 = removerProdutoPanel.getCodBarrasProdutoField().getText();
						if (v1.equals(v2)) {
							
						}
					}

				}
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
							|| comp.equals("Unid")) {
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
				// TODO Auto-generated method stub

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
			MaskFormatter maskData = new MaskFormatter("R$ ####.##");
			maskData.setOverwriteMode(true);
			maskData.setValidCharacters("0123456789");
			maskData.setPlaceholderCharacter('0');
			maskData.install(textfield);
			return maskData;
		}

		private MaskFormatter maskPeso(JFormattedTextField textfield) throws ParseException {
			MaskFormatter maskData = new MaskFormatter("####.##");
			maskData.setOverwriteMode(true);
			maskData.setValidCharacters("0123456789");
			maskData.setPlaceholderCharacter('0');
			maskData.install(textfield);
			return maskData;
		}
	}

	private class AberturaController {
		private MouseHandler mouseHandler;
		private KeyHandler keyHandler;

		public AberturaController() {
			this.mouseHandler = new MouseHandler();
			this.keyHandler = new KeyHandler();

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
