package controller;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.KeyStroke;

import model.BaseDados;
import model.Produto;
import view.AberturaFrame;
import view.BuscarProdutoPanel;
import view.CadastrarProdutoPanel;
import view.GerenciamentoFrame;
import view.RemoverProdutoPanel;

public class Controller {

	private AberturaFrame aberturaFrame;
	private AberturaController aberturaController;
	private GerenciamentoController gerenciamentoController;
	private GerenciamentoFrame gerenciamentoFrame;
	private CadastrarProdutoPanel cadastrarProdutoPanel;
	private BuscarProdutoPanel buscarProdutoPanel;
	private RemoverProdutoPanel removerProdutoPanel;
	private ProdutoController produtoController;

	public Controller() {
		this.aberturaFrame = new AberturaFrame(this);
		this.gerenciamentoFrame = new GerenciamentoFrame(this);
		this.cadastrarProdutoPanel = new CadastrarProdutoPanel();
		this.buscarProdutoPanel = new BuscarProdutoPanel();
		this.removerProdutoPanel = new RemoverProdutoPanel();
		this.aberturaController = new AberturaController(this);
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

		public ProdutoController() {
			this.buttonHandler = new ButtonHandler();
			this.keyHandler = new KeyHandler();
			this.fieldHandler = new FieldHandler();
			removerProdutoPanel.getRemoverButton().addActionListener(buttonHandler);
		}

		private class ButtonHandler implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == removerProdutoPanel.getRemoverButton()) {
					for (Produto produto : BaseDados.getProdutos()) {
						String v1 = produto.getCodBarras();
						String v2 = removerProdutoPanel.getCodBarrasProdutoField().getText();
						if (v1.equals(v2)) {
							System.out.println("FOI");
							//
							//
							//
						}
					}

				}
			}
		}

		private class KeyHandler extends KeyAdapter {

		}

		private class FieldHandler {
		}
	}

	private class AberturaController {
		private Controller controller;
		private MouseHandler mouseHandler;
		private KeyHandler keyHandler;

		public AberturaController(Controller controller) {

			this.controller = controller;

			// controller.setGerenciamentoFrame(controller.gerenciamentoFrame);
			this.mouseHandler = new MouseHandler();
			this.keyHandler = new KeyHandler();

			controller.aberturaFrame.addMouseListener(mouseHandler);
			controller.aberturaFrame.addKeyListener(keyHandler);
		}

		private class MouseHandler extends MouseAdapter {

			@Override
			public void mouseEntered(MouseEvent e) {
				controller.aberturaFrame.setVisible(false);
				controller.gerenciamentoFrame.setVisible(true);
			}
		}

		private class KeyHandler extends KeyAdapter {

			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					controller.aberturaFrame.setVisible(false);
					controller.gerenciamentoFrame.setVisible(true);
				}
				if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
					System.exit(0);
				}
			}
		}

	}

}
