package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import model.PacienteModel;
import view.EsperaView;
import view.FilaPanel;
import view.MedicoView;
import view.RecepcionistView;

public class Controller {
	private ArrayList<EsperaView> esperaViews;
	private MedicoView medicoView;
	private RecepcionistView recepcionistView;
	private ActionListener buttonHandler;
	private PacienteModel pacienteModel;
	private int numero;

	public Controller(ArrayList<EsperaView> esperaViews, MedicoView medicoView, RecepcionistView recepcionistView, int numero) {
		FilaPanel.getNomeLabel().setText(""+numero);
		this.esperaViews = esperaViews;
		this.medicoView = medicoView;
		this.recepcionistView = recepcionistView;
		this.numero = numero;
		control();

	}

	private void control() {
		pacienteModel = new PacienteModel(numero);
		
		for (EsperaView esperaView : esperaViews) {
			esperaView.setVisible(true);
		}
		medicoView.setVisible(true);
		recepcionistView.setVisible(true);

		buttonHandler = new ButtonHandler();
		medicoView.getCasdastrarItem().addActionListener(buttonHandler);
		recepcionistView.getCasdastrarItem().addActionListener(buttonHandler);

		medicoView.getRemoverItem().addActionListener(buttonHandler);
		recepcionistView.getRemoverItem().addActionListener(buttonHandler);

		medicoView.getAtualizarItem().addActionListener(buttonHandler);
		recepcionistView.getAtualizarItem().addActionListener(buttonHandler);

		medicoView.getBuscarItem().addActionListener(buttonHandler);
		recepcionistView.getBuscarItem().addActionListener(buttonHandler);

		medicoView.getPacienteConsultaItem().addActionListener(buttonHandler);
		medicoView.getFilaItem().addActionListener(buttonHandler);
		recepcionistView.getFilaItem().addActionListener(buttonHandler);

		medicoView.getFilaPanel().getProxButton().addActionListener(buttonHandler);
		recepcionistView.getFilaPanel().getProxButton().addActionListener(buttonHandler);
		
		medicoView.getSairItem().addActionListener(buttonHandler);
		recepcionistView.getSairItem().addActionListener(buttonHandler);

	}

	private class ButtonHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == medicoView.getCasdastrarItem()) {
				medicoView.setContentPane(medicoView.getCadastrarPanel());
				medicoView.getCadastrarPanel().setVisible(true);
			}
			if (e.getSource() == recepcionistView.getCasdastrarItem()) {
				recepcionistView.setContentPane(recepcionistView.getCadastrarPanel());
				recepcionistView.getCadastrarPanel().setVisible(true);
			}
			if (e.getSource() == medicoView.getRemoverItem()) {
				System.out.println("MEDICO REMOVER");

			}
			if (e.getSource() == recepcionistView.getRemoverItem()) {
				System.out.println("REP REMOVER");

			}
			if (e.getSource() == medicoView.getAtualizarItem()) {
				System.out.println("MEDICO atualizar");

			}
			if (e.getSource() == recepcionistView.getAtualizarItem()) {
				System.out.println("Rep atualizar");

			}
			if (e.getSource() == medicoView.getBuscarItem()) {
				System.out.println("Medico bscar");

			}
			if (e.getSource() == recepcionistView.getBuscarItem()) {
				System.out.println("Rep buscar");

			}
			if (e.getSource() == medicoView.getPacienteConsultaItem()) {
				System.out.println("Med getPacienteConsultaItem");

			}
			if (e.getSource() == medicoView.getFilaItem()) {
				medicoView.setContentPane(medicoView.getFilaPanel());
				medicoView.getFilaPanel().setVisible(true);

			}
			if (e.getSource() == recepcionistView.getFilaItem()) {
				recepcionistView.setContentPane(recepcionistView.getFilaPanel());
				recepcionistView.getFilaPanel().setVisible(true);
				if (e.getSource() == medicoView.getFilaPanel().getProxButton()
						|| e.getSource() == recepcionistView.getFilaPanel().getProxButton()) {
					recepcionistView.getFilaPanel().getNomeLabel().setText("Teste");
					medicoView.getFilaPanel().getNomeLabel().setText("Teste");
					recepcionistView.getFilaPanel().getNumeroEsperaLabel().setText(""+ (pacienteModel.incrementador(Integer.parseInt(FilaPanel.getNomeLabel().getText()))));
					medicoView.getFilaPanel().getNumeroEsperaLabel().setText(""+ (pacienteModel.incrementador(Integer.parseInt(FilaPanel.getNomeLabel().getText()))));

					
				}

			}
			if (e.getSource() == recepcionistView.getSairItem() || e.getSource() == medicoView.getSairItem()  ) {
				System.exit(0);
			}
		}

	}

}
