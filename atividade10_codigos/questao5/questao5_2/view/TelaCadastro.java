package questao5_2.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.text.MaskFormatter;

public class TelaCadastro extends JFrame {
	
	private JMenuBar menuBar;
	private JMenu menuTitle;
	private JMenuItem menuItem;
	private JButton buttonSair;
	private JFrame telaAdd, telaRemover, telaBuscar, telaVerificar;
	private JButton buttonAdd, buttonRemover, buttonBuscar, buttonVerificar, buttonVoltar;
	private JLabel idLabel, nomeLabel, precoLabel, validadeLabel;
	private JTextField idField, nomeField, precoField;
	private JFormattedTextField validadeField;

	public TelaCadastro() {
		super("Tela Cadastro");
		setSize(200, 200);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		menuBar = new JMenuBar();
		menuTitle = new JMenu("Menu");
		criarMenu();

		telaAdd = new JFrame("Adicionar");
		telaRemover = new JFrame("Remover");
		telaBuscar = new JFrame("Buscar");
		telaVerificar = new JFrame("Verificar Validade");



		telaAdd.setLayout(new FlowLayout());
		telaAdd.setSize(900, 90);
		telaAdd.setDefaultCloseOperation(EXIT_ON_CLOSE);
		telaAdd.setLocationRelativeTo(null);
		telaAdd.add(idLabel = new JLabel("ID: "));
		telaAdd.add(idField = new JTextField(10));
		telaAdd.add(nomeLabel = new JLabel("Nome: "));
		telaAdd.add(nomeField = new JTextField(10));
		telaAdd.add(precoLabel = new JLabel("Preço: "));
		telaAdd.add(precoField = new JTextField(10));
		telaAdd.add(validadeLabel = new JLabel("Data: "));
		telaAdd.add(validadeField = new JFormattedTextField());

		
		try {
			maskData(validadeField);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		
		
		telaAdd.add(buttonAdd = new JButton("Adicionar"));
		telaAdd.add(buttonVoltar = new JButton("Voltar"));

		
		
		
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
			} catch (ClassNotFoundException | InstantiationException
			| IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
			}

		setJMenuBar(menuBar);
		setVisible(true);

	}

	private void criarMenu() {
		menuItem = new JMenuItem("Adicionar");
		menuTitle.add(menuItem);
		menuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				telaAdd.setVisible(true);
			}
		});
		menuItem = new JMenuItem("Remover");
		menuTitle.add(menuItem);
		menuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		menuItem = new JMenuItem("Buscar");
		menuTitle.add(menuItem);
		menuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		menuItem = new JMenuItem("Verificar");
		menuTitle.add(menuItem);
		menuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		menuBar.add(menuTitle);

	}

	private MaskFormatter maskData(JFormattedTextField textfield) throws ParseException {
		MaskFormatter mask = null;
		mask = new MaskFormatter("##/##/####");
		mask.setOverwriteMode(true);
		mask.setValidCharacters("0123456789");
		mask.install(textfield);
		return mask;
	}



//	JButton addbutton, removerbutton, buscarbutton, verificarbutton, adicionartela1, voltartela1, removertela2,
//			voltartela2, buscartela3, voltartela3, verificartela4, voltartela4;
//	JLabel idlabel, nomelabel, precolabel, datelabel;
//	JTextField idfield, idRemoverField, idBuscarField, idVerificarField, nomefield, precofield, datefield;
//
//	public TelaCadastro() {
//		super("TELA CADASTRO");
//		setSize(200, 200);
//		setLocationRelativeTo(null);
//		setLayout(new FlowLayout());
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//
//		telaadd = new JFrame("TELA PARA ADICIONAR");
//		telaremover = new JFrame("TELA PARA REMOVER");
//		telabuscar = new JFrame("TELA PARA BUSCAR");
//		telaverificar = new JFrame("TELA PARA VERIFICAR");
//
//		telaadd.setLayout(new FlowLayout());
//		telaadd.setSize(200, 200);
//		telaadd.setDefaultCloseOperation(EXIT_ON_CLOSE);
//		telaadd.setLocationRelativeTo(null);
//		telaadd.add(idlabel = new JLabel("ID: "));
//		telaadd.add(idfield = new JTextField(10));
//		telaadd.add(nomelabel = new JLabel("Nome: "));
//		telaadd.add(nomefield = new JTextField(10));
//		telaadd.add(precolabel = new JLabel("Preço: "));
//		telaadd.add(precofield = new JTextField(10));
//		telaadd.add(datelabel = new JLabel("Date: "));
//		telaadd.add(datefield = new JTextField(10));
//		telaadd.add(adicionartela1 = new JButton("Adicionar"));
//
//		telaadd.add(voltartela1 = new JButton("Voltar"));
//
//		telaremover.setLayout(new FlowLayout());
//		telaremover.setSize(200, 200);
//		telaremover.setDefaultCloseOperation(EXIT_ON_CLOSE);
//		telaremover.setLocationRelativeTo(null);
//		telaremover.add(idlabel = new JLabel("ID: "));
//		telaremover.add(idRemoverField = new JTextField(10));
//		telaremover.add(removertela2 = new JButton("Remover"));
//		telaremover.add(voltartela2 = new JButton("Voltar"));
//
//		telabuscar.setLayout(new FlowLayout());
//		telabuscar.setSize(200, 200);
//		telabuscar.setDefaultCloseOperation(EXIT_ON_CLOSE);
//		telabuscar.setLocationRelativeTo(null);
//		telabuscar.add(idlabel = new JLabel("ID: "));
//		telabuscar.add(idBuscarField = new JTextField(10));
//		telabuscar.add(buscartela3 = new JButton("Buscar"));
//		telabuscar.add(voltartela3 = new JButton("Voltar"));
//
//		telaverificar.setLayout(new FlowLayout());
//		telaverificar.setSize(200, 200);
//		telaverificar.setDefaultCloseOperation(EXIT_ON_CLOSE);
//		telaverificar.setLocationRelativeTo(null);
//		telaverificar.add(idlabel = new JLabel("ID: "));
//		telaverificar.add(idVerificarField = new JTextField(10));
//		telaverificar.add(verificartela4 = new JButton("Verificar"));
//		telaverificar.add(voltartela4 = new JButton("Voltar"));
//
//		addbutton = new JButton("Adicionar Produto");
//		removerbutton = new JButton("Remover Produto");
//		buscarbutton = new JButton("Buscar Produto");
//		verificarbutton = new JButton("Verificar Produto");
//
//		add(addbutton);
//		add(removerbutton);
//		add(buscarbutton);
//		add(verificarbutton);
//
//		setVisible(true);
//
//		control();
//
//	}
//
//	public void control() {
//		addbutton.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				telaadd.setVisible(true);
//				setVisible(false);
//			}
//		});
//		adicionartela1.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//				Date data;
//				try {
//					data = dateFormat.parse(datefield.getText());
//					Produto produto = new Produto(Integer.parseInt(idfield.getText()), nomefield.getText(),
//							Double.parseDouble(precofield.getText()), data);
//					BaseDados.adicionarProduto(produto);
//					System.out.println("foi");
//				} catch (Exception e1) {
//					// TODO: handle exception
//				}
//
//			}
//
//		});
//
//		removerbutton.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				telaremover.setVisible(true);
//				setVisible(false);
//
//			}
//		});
//
//		buscarbutton.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				telabuscar.setVisible(true);
//				setVisible(false);
//
//			}
//		});
//
//		removertela2.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				Produto p = new Produto(Integer.parseInt(idRemoverField.getText()));
//				BaseDados.removerProduto(p);
//
//			}
//		});
//		idBuscarField.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				Produto p = new Produto(Integer.parseInt(idBuscarField.getText()));
//				BaseDados.buscarProduto(p);
//
//			}
//		});
//
//		verificartela4.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				Produto p = new Produto(Integer.parseInt(idVerificarField.getText()));
//				BaseDados.verificarPrazoValidade(p);
//
//			}
//		});
//		
//		verificarbutton.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				telaverificar.setVisible(true);
//				setVisible(false);
//
//			}
//		});
//		voltartela1.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				setVisible(true);
//				telaadd.setVisible(false);
//
//			}
//		});
//		voltartela2.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				setVisible(true);
//				removertela2.setVisible(false);
//
//			}
//		});
//		voltartela3.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				setVisible(true);
//				buscartela3.setVisible(false);
//
//			}
//		});
//		voltartela4.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				setVisible(true);
//				verificartela4.setVisible(false);
//
//			}
//		});
//
//	}
//
//	public JTextField getIdfield() {
//		return idfield;
//	}
//
//	public JTextField getNomefield() {
//		return nomefield;
//	}
//
//	public JTextField getPrecofield() {
//		return precofield;
//	}
//
//	public JTextField getDatefield() {
//		return datefield;
//	}

}