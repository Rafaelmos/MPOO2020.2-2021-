package view;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import controller.Controller;

public class GerenciamentoFrame extends TelaModelo {
	private JMenuBar menuBar;
	private JMenu menuTitle, menuTitleProduto;
	private JMenuItem cadastrarProdutoItem, buscarProdutoItem, atualizarProdutoItem, removerProdutoItem,
			demostrativoControleItem, verificadorControleItem, sairItem;

	public GerenciamentoFrame(Controller controller) {
		setTitle("MPOO Market");
		menuBar = new JMenuBar();
		menuTitle = new JMenu("Gerenciar");
		menuTitleProduto = new JMenu("Produto");
		cadastrarProdutoItem = new JMenuItem("Cadastrar");
		buscarProdutoItem = new JMenuItem("Buscar");
		atualizarProdutoItem = new JMenuItem("Atualizar");
		removerProdutoItem = new JMenuItem("Remover");
		menuTitle.add(menuTitleProduto);
		menuTitleProduto.add(cadastrarProdutoItem);
		menuTitleProduto.add(buscarProdutoItem);
		menuTitleProduto.add(atualizarProdutoItem);
		menuTitleProduto.add(removerProdutoItem);
		menuBar.add(menuTitle);

		menuTitle = new JMenu("Controle");
		demostrativoControleItem = new JMenuItem("Demostrativo");
		verificadorControleItem = new JMenuItem("Verificador");
		menuTitle.add(demostrativoControleItem);

		menuTitle.add(verificadorControleItem);
		menuBar.add(menuTitle);
		sairItem = new JMenuItem("Sair");
		menuBar.add(sairItem);

		setJMenuBar(menuBar);
	}

	public JMenuItem getCadastrarProdutoItem() {
		return cadastrarProdutoItem;
	}

	public JMenuItem getBuscarProdutoItem() {
		return buscarProdutoItem;
	}

	public JMenuItem getAtualizarProdutoItem() {
		return atualizarProdutoItem;
	}

	public JMenuItem getRemoverProdutoItem() {
		return removerProdutoItem;
	}

	public JMenuItem getDemostrativoControleItem() {
		return demostrativoControleItem;
	}

	public JMenuItem getVerificadorControleItem() {
		return verificadorControleItem;
	}

	public JMenuItem getSairItem() {
		return sairItem;
	}

}
