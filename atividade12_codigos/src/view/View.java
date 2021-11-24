package view;

import java.awt.Dimension;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SpringLayout;

public abstract class View extends JFrame implements Observer {

	private JMenuBar menuBar;
	private JMenu menu, pacienteMenu, pacienteDadosMenu;
	private JMenuItem pacienteConsultaItem,filaItem, sairItem;
	private JMenuItem casdastrarItem, buscarItem, removerItem, atualizarItem;

	public View(String titulo) {
		super(titulo);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setSize(new Dimension(600,250));

		
		menuBar = new JMenuBar();
		menu = new JMenu("Gerenciar");
		pacienteMenu = new JMenu("Paciente");
		pacienteDadosMenu = new JMenu("Dados do Paciente");
		pacienteConsultaItem = new JMenuItem("Consulta do Paciente");
		filaItem = new JMenuItem("Fila de Espera");
		sairItem = new JMenuItem("Sair");
		casdastrarItem = new JMenuItem("Cadastrar");
		buscarItem = new JMenuItem("Buscar");
		removerItem = new JMenuItem("Remover");
		atualizarItem = new JMenuItem("Atualizar");
		
		
		menu.add(pacienteMenu);
		pacienteDadosMenu.add(casdastrarItem);
		pacienteDadosMenu.add(buscarItem);
		pacienteDadosMenu.add(removerItem);
		pacienteDadosMenu.add(atualizarItem);
		pacienteMenu.add(pacienteDadosMenu);
		pacienteMenu.add(pacienteConsultaItem);
		menu.add(filaItem);
		menuBar.add(menu);
		menuBar.add(sairItem);
		setJMenuBar(menuBar);
		
	}


	public JMenuItem getPacienteConsultaItem() {
		return pacienteConsultaItem;
	}

	public JMenuItem getFilaItem() {
		return filaItem;
	}

	public JMenuItem getSairItem() {
		return sairItem;
	}

	public JMenuItem getCasdastrarItem() {
		return casdastrarItem;
	}

	public JMenuItem getBuscarItem() {
		return buscarItem;
	}

	public JMenuItem getRemoverItem() {
		return removerItem;
	}

	public JMenuItem getAtualizarItem() {
		return atualizarItem;
	}

	
}