package view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class GerenciamentoFrame extends TelaModelo {
	private JMenuBar menuBar;
	private JMenu menuTitle, menuTitleProduto;
	private JMenuItem cadastrarProdutoItem, buscarProdutoItem, atualizarProdutoItem, removerProdutoItem,
			demostrativoControleItem, verificadorControleItem, sairItem;
	private CadastrarProduto cadastrarProduto;
	private Object atual;

	public GerenciamentoFrame() {
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
		cadastrarProdutoItem.addActionListener(null);
		menuTitleProduto.add(buscarProdutoItem);
		buscarProdutoItem.addActionListener(null);

		menuTitleProduto.add(atualizarProdutoItem);
		atualizarProdutoItem.addActionListener(null);

		menuTitleProduto.add(removerProdutoItem);
		removerProdutoItem.addActionListener(null);

		menuBar.add(menuTitle);

		menuTitle = new JMenu("Controle");
		demostrativoControleItem = new JMenuItem("Demostrativo");
		verificadorControleItem = new JMenuItem("Verificador");
		menuTitle.add(demostrativoControleItem);
		demostrativoControleItem.addActionListener(null);

		menuTitle.add(verificadorControleItem);
		verificadorControleItem.addActionListener(null);

		menuBar.add(menuTitle);

		sairItem = new JMenuItem("Sair");
		menuBar.add(sairItem);
		sairItem.addActionListener(null);

		// cadastrarProduto = new CadastrarProduto(this);
		// setContentPane(cadastrarProduto);

		setJMenuBar(menuBar);

		setVisible(true);
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

	public CadastrarProduto getCadastrarProduto() {
		return cadastrarProduto;
	}

}
