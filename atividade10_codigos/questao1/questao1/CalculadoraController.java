package questao1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Optional;

public class CalculadoraController implements ActionListener {
	CalculadoraTela calculadoraTela;
	double operador1, operador2, resultado;
	String[] resu;

	public CalculadoraController(CalculadoraTela calculadoraTela) {
		this.calculadoraTela = calculadoraTela;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == calculadoraTela.getN0()) {
			atualizarVisor("0");
		}
		if (e.getSource() == calculadoraTela.getN1()) {
			atualizarVisor("1");
		}
		if (e.getSource() == calculadoraTela.getN2()) {
			atualizarVisor("2");
		}
		if (e.getSource() == calculadoraTela.getN3()) {
			atualizarVisor("3");
		}
		if (e.getSource() == calculadoraTela.getN4()) {
			atualizarVisor("4");
		}
		if (e.getSource() == calculadoraTela.getN5()) {
			atualizarVisor("5");
		}
		if (e.getSource() == calculadoraTela.getN6()) {
			atualizarVisor("6");
		}
		if (e.getSource() == calculadoraTela.getN7()) {
			atualizarVisor("7");
		}
		if (e.getSource() == calculadoraTela.getN8()) {
			atualizarVisor("8");
		}
		if (e.getSource() == calculadoraTela.getN9()) {
			atualizarVisor("9");
		}
		if (e.getSource() == calculadoraTela.getAdicao()) {
			atualizarVisor(" + ");
		}
		if (e.getSource() == calculadoraTela.getSubtracao()) {
			atualizarVisor(" - ");
		}
		if (e.getSource() == calculadoraTela.getDivisao()) {
			atualizarVisor(" / ");
		}
		if (e.getSource() == calculadoraTela.getMultiplicao()) {
			atualizarVisor(" * ");
		}
		if (e.getSource() == calculadoraTela.getIgual()) {
			String stringTemp = CalculadoraModel.getVisorModel();
			String[] resu = stringTemp.split(" ");
			operador1 = Double.parseDouble(resu[0]);
			operador2 = Double.parseDouble(resu[2]);
			stringTemp = null;
			if (resu[1].equals("+")) {
				resultado = operador1 + operador2;
			}
			if (resu[1].equals("-")) {
				resultado = operador1 - operador2;
			}
			if (resu[1].equals("*")) {
				resultado = operador1 * operador2;
			}
			if (resu[1].equals("/")) {
				resultado = operador1 / operador2;
			}
			if (resu[1].equals("²")) {
				resultado = Math.pow(operador1, 2);
			}
			if (resu[1].equals("³")) {
				resultado = Math.pow(operador1, 3);
			}
			if (resu[1].equals("raizQuadr")) {
				resultado = Math.sqrt(operador1);
			}
			if (resu[1].equals("+-")) {
				resultado = operador1 * (-1);
			}
			if (resu[1].equals("1/")) {
				resultado = 1 / operador1;
			}
			CalculadoraModel.setVisorModel("" + resultado + "");
			calculadoraTela.getVisor().setText(CalculadoraModel.getVisorModel());
		}
		if (e.getSource() == calculadoraTela.getVirgula()) {
			atualizarVisor(".");
		}
		if (e.getSource() == calculadoraTela.getUmSobreX()) {
			calculadoraTela.getVisor().setText("1/" + CalculadoraModel.getVisorModel());
			CalculadoraModel.setVisorModel(CalculadoraModel.getVisorModel() + " 1/ 1");
		}
		if (e.getSource() == calculadoraTela.getDelete()) {
			CalculadoraModel
					.setVisorModel(Optional.ofNullable(CalculadoraModel.getVisorModel()).filter(s -> s.length() != 0)
							.map(s -> s.substring(0, s.length() - 1)).orElse(CalculadoraModel.getVisorModel()));
			calculadoraTela.getVisor().setText(CalculadoraModel.getVisorModel());
		}
		if (e.getSource() == calculadoraTela.getC()) {
			CalculadoraModel.setVisorModel("0");
			calculadoraTela.getVisor().setText(CalculadoraModel.getVisorModel());
		}
		if (e.getSource() == calculadoraTela.getMaisOuMenos()) {
			calculadoraTela.getVisor().setText("+-" + CalculadoraModel.getVisorModel());
			CalculadoraModel.setVisorModel(CalculadoraModel.getVisorModel() + " +- -1");
		}
		if (e.getSource() == calculadoraTela.getRaizQuadrada()) {
			calculadoraTela.getVisor().setText("sqrt(" + CalculadoraModel.getVisorModel() + ")");
			CalculadoraModel.setVisorModel("" + CalculadoraModel.getVisorModel() + " raizQuadr 2");
		}
		if (e.getSource() == calculadoraTela.getxAoQuadrado()) {
			calculadoraTela.getVisor().setText(CalculadoraModel.getVisorModel() + "²");
			CalculadoraModel.setVisorModel(CalculadoraModel.getVisorModel() + " ² 2");
		}
		if (e.getSource() == calculadoraTela.getxAoCubo()) {
			calculadoraTela.getVisor().setText(CalculadoraModel.getVisorModel() + "³");
			CalculadoraModel.setVisorModel(CalculadoraModel.getVisorModel() + " ³ 3");
		}
	}

	private void atualizarVisor(String s) {
		CalculadoraModel.setVisorModel(CalculadoraModel.getVisorModel() + s);
		calculadoraTela.getVisor().setText(CalculadoraModel.getVisorModel());
	}
}
