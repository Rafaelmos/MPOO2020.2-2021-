package questao5_2.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import questao5_2.model.BaseDados;
import questao5_2.model.Produto;
import questao5_2.view.Mensagem;
import questao5_2.view.TelaAdicionar;
import questao5_2.view.TelaBuscar;
import questao5_2.view.TelaCadastro;
import questao5_2.view.TelaRemover;
import questao5_2.view.TelaVerificar;

public class ControllerEventos implements ActionListener {
	private TelaCadastro telaCadastro;
	private TelaAdicionar telaAdicionar;
	private TelaRemover telaRemover;
	private TelaBuscar telaBuscar;
	private TelaVerificar telaVerificar;

	public ControllerEventos() {
		telaCadastro = new TelaCadastro(this);
		telaAdicionar = new TelaAdicionar(this);
		telaRemover = new TelaRemover(this);
		telaBuscar = new TelaBuscar(this);
		telaVerificar = new TelaVerificar(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == telaCadastro.getAdicionar()) {
			telaAdicionar.setVisible(true);
		}
		if (e.getSource() == telaCadastro.getRemover()) {
			telaRemover.setVisible(true);
		}
		if (e.getSource() == telaCadastro.getBuscar()) {
			telaBuscar.setVisible(true);
		}
		if (e.getSource() == telaCadastro.getVerificar()) {
			telaVerificar.setVisible(true);
		}
		if (e.getSource() == telaAdicionar.getButtonAdd()) {
			Produto produto = new Produto(Integer.parseInt(telaAdicionar.getIdFieldAdicionar().getText()),
					telaAdicionar.getNomeFieldAdicionar().getText(),
					Double.parseDouble(telaAdicionar.getPrecoFieldAdicionar().getText()),
					telaAdicionar.getValidadeFieldAdicionar().getText());

			if (BaseDados.adicionarProduto(produto)) {
				Mensagem.exibirMensagem(2);
			} else {
				Mensagem.exibirMensagem(0);
			}
			telaAdicionar.getIdFieldAdicionar().setText("");
			telaAdicionar.getNomeFieldAdicionar().setText("");
			telaAdicionar.getPrecoFieldAdicionar().setText("");
			telaAdicionar.getValidadeFieldAdicionar().setText("");
		}
		if (e.getSource() == telaAdicionar.getButtonVoltarAdicionar()) {
			telaAdicionar.setVisible(false);
		}

		if (e.getSource() == telaRemover.getButtonRemover()) {
			if (BaseDados.removerProduto(
					BaseDados.buscarProduto(Integer.parseInt(telaRemover.getIdFieldRemover().getText())))) {
				Mensagem.exibirMensagem(3);
			} else {
				Mensagem.exibirMensagem(1);
			}
			telaRemover.getIdFieldRemover().setText("");
		}
		if (e.getSource() == telaRemover.getButtonVoltarRemover()) {
			telaRemover.setVisible(false);
		}
		if (e.getSource() == telaBuscar.getButtonBuscar()) {
			if (BaseDados.buscarProduto(Integer.parseInt(telaBuscar.getIdFieldBuscar().getText())) != null) {
				Mensagem.exibirMensagem(6);
			} else {
				Mensagem.exibirMensagem(7);
			}
			telaBuscar.getIdFieldBuscar().setText("");
		}
		if (e.getSource() == telaBuscar.getButtonVoltarBuscar()) {
			telaBuscar.setVisible(false);
		}

		if (e.getSource() == telaVerificar.getButtonVerificar()) {
			if (BaseDados.buscarProduto(Integer.parseInt(telaVerificar.getIdFieldVerificar().getText())) == null) {
				Mensagem.exibirMensagem(7);
			} else if (BaseDados.verificarPrazoValidade(
					BaseDados.buscarProduto(Integer.parseInt(telaVerificar.getIdFieldVerificar().getText())))) {
				Mensagem.exibirMensagem(5);
			} else {
				Mensagem.exibirMensagem(4);
			}
			telaVerificar.getIdFieldVerificar().setText("");
		}

		if (e.getSource() == telaVerificar.getButtonVoltarVerificar()) {

			telaVerificar.setVisible(false);
		}

	}

}
