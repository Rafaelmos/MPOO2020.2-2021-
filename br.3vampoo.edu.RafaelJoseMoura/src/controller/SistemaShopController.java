package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

import model.BaseDados;
import model.Compra;
import model.Funcionario;
import model.Item;
import view.TelaSistemaShop;

public class SistemaShopController implements ActionListener {
	TelaSistemaShop telaSistemaShop;
	FormularioHandler formularioHandler;
	Compra compra;

	public SistemaShopController() {
		this.telaSistemaShop = new TelaSistemaShop();
		this.formularioHandler = new FormularioHandler();
		this.compra = new Compra(null);
		control();
	}

	private void control() {
		telaSistemaShop.getVenderItem().addActionListener(this);
		telaSistemaShop.getSairItem().addActionListener(this);
		telaSistemaShop.getVendaPanel().getCodBarrasField().addCaretListener(formularioHandler);
		telaSistemaShop.getVendaPanel().getSalvarButton().addActionListener(this);
		telaSistemaShop.getVendaPanel().getAddButton().addActionListener(this);
		telaSistemaShop.getVendaPanel().getCodBarrasField().addFocusListener(formularioHandler);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == telaSistemaShop.getVenderItem()) {
			telaSistemaShop.setContentPane(telaSistemaShop.getVendaPanel());
			telaSistemaShop.getVendaPanel().setVisible(true);
		}
		if (e.getSource() == telaSistemaShop.getSairItem()) {
			System.exit(0);
		}
		if (e.getSource() == telaSistemaShop.getVendaPanel().getSalvarButton()) {
			BaseDados.getCompras().add(compra);
		}
		if (e.getSource() == telaSistemaShop.getVendaPanel().getAddButton()) {
			Item item = new Item(telaSistemaShop.getVendaPanel().getCodBarrasField().getText(),
					telaSistemaShop.getVendaPanel().getNomeField().getText(),
					Double.parseDouble(telaSistemaShop.getVendaPanel().getPrecoField().getText()));
			String nomeFunc = (String) telaSistemaShop.getVendaPanel().getComboBox().getSelectedItem();
			for (Funcionario f : BaseDados.getFuncionarios()) {
				if (f.getNome().equals(nomeFunc)) {
					f.realizarVenda(item, compra);
					item = null;
					return;
				}
			}

		}

	}

	private class FormularioHandler implements FocusListener ,CaretListener {

		@Override
		public void caretUpdate(CaretEvent e) {
			Item item = BaseDados.buscarItem(telaSistemaShop.getVendaPanel().getCodBarrasField().getText());
			if (item != null) {
				telaSistemaShop.getVendaPanel().getNomeField().setText(item.getNome());
				telaSistemaShop.getVendaPanel().getPrecoField().setText(item.getPreco() + "");
				telaSistemaShop.getVendaPanel().getSalvarButton().setEnabled(true);
				telaSistemaShop.getVendaPanel().getAddButton().setEnabled(true);

			} else {
				telaSistemaShop.getVendaPanel().getSalvarButton().setEnabled(false);
				telaSistemaShop.getVendaPanel().getAddButton().setEnabled(false);
			}

		}

		@Override
		public void focusGained(FocusEvent e) {
				if (e.getSource() == telaSistemaShop.getVendaPanel().getCodBarrasField()) {
					telaSistemaShop.getVendaPanel().getCodBarrasField().setForeground(Color.black);
				}
		}

		@Override
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub
			
		}

	}

}
