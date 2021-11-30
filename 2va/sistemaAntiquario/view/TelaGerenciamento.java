package view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class TelaGerenciamento extends JFrame {
	private JMenuBar menu;
	private JMenu gerenciar, produtoMenu, promocao;
	private JMenuItem cadastrarItem, promocaoItem, sairItem, atualizarItem;
	private CadastrarPanel cadastrarPanel;
	private AtualizarEstoquePanel atualizarEstoquePanel;
	private PromocoesPanel promocoesPanel;

	public TelaGerenciamento() {
		super("Antiquarius");
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		setSize(new Dimension(350, 350));
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		menu = new JMenuBar();
		gerenciar = new JMenu("Gerenciar");
		promocao = new JMenu("Promoção");
		produtoMenu = new JMenu("Produto");
		cadastrarItem = new JMenuItem("Cadastrar");
		promocaoItem = new JMenuItem("Promoção");
		sairItem = new JMenuItem("Sair");
		atualizarItem = new JMenuItem("Atualizar Estoque");
		cadastrarPanel = new CadastrarPanel();
		atualizarEstoquePanel = new AtualizarEstoquePanel();
		promocoesPanel = new PromocoesPanel();

		menu.add(produtoMenu);
		menu.add(gerenciar);

		gerenciar.add(produtoMenu);
		produtoMenu.add(cadastrarItem);
		produtoMenu.add(atualizarItem);
		menu.add(promocao);
		promocao.add(promocaoItem);
		menu.add(sairItem);
		setJMenuBar(menu);
		setContentPane(cadastrarPanel);
		cadastrarPanel.setVisible(false);
		setContentPane(atualizarEstoquePanel);
		atualizarEstoquePanel.setVisible(false);
		setContentPane(promocoesPanel);
		promocoesPanel.setVisible(false);

		

	}

	public JMenu getPromocao() {
		return promocao;
	}

	public JMenuItem getCadastrarItem() {
		return cadastrarItem;
	}

	public JMenuItem getPromocaoItem() {
		return promocaoItem;
	}

	public JMenuItem getSairItem() {
		return sairItem;
	}

	public JMenuItem getAtualizarItem() {
		return atualizarItem;
	}

	public CadastrarPanel getCadastrarPanel() {
		return cadastrarPanel;
	}

	public AtualizarEstoquePanel getAtualizarEstoquePanel() {
		return atualizarEstoquePanel;
	}

	public PromocoesPanel getPromocoesPanel() {
		return promocoesPanel;
	}

}
