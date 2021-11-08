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

			CalculadoraModel.setVisorModel(CalculadoraModel.getVisorModel() + "0");
			calculadoraTela.getVisor().setText(CalculadoraModel.getVisorModel());
		}
		if (e.getSource() == calculadoraTela.getN1()) {
			CalculadoraModel.setVisorModel(CalculadoraModel.getVisorModel() + "1");
			calculadoraTela.getVisor().setText(CalculadoraModel.getVisorModel());
		}
		if (e.getSource() == calculadoraTela.getN2()) {
			CalculadoraModel.setVisorModel(CalculadoraModel.getVisorModel() + "2");
			calculadoraTela.getVisor().setText(CalculadoraModel.getVisorModel());
		}
		if (e.getSource() == calculadoraTela.getN3()) {
			CalculadoraModel.setVisorModel(CalculadoraModel.getVisorModel() + "3");
			calculadoraTela.getVisor().setText(CalculadoraModel.getVisorModel());
		}
		if (e.getSource() == calculadoraTela.getN4()) {
			CalculadoraModel.setVisorModel(CalculadoraModel.getVisorModel() + "4");
			calculadoraTela.getVisor().setText(CalculadoraModel.getVisorModel());
		}

		if (e.getSource() == calculadoraTela.getN5()) {
			CalculadoraModel.setVisorModel(CalculadoraModel.getVisorModel() + "5");
			calculadoraTela.getVisor().setText(CalculadoraModel.getVisorModel());
		}

		if (e.getSource() == calculadoraTela.getN6()) {
			CalculadoraModel.setVisorModel(CalculadoraModel.getVisorModel() + "6");
			calculadoraTela.getVisor().setText(CalculadoraModel.getVisorModel());
		}

		if (e.getSource() == calculadoraTela.getN7()) {
			CalculadoraModel.setVisorModel(CalculadoraModel.getVisorModel() + "7");
			calculadoraTela.getVisor().setText(CalculadoraModel.getVisorModel());
		}

		if (e.getSource() == calculadoraTela.getN8()) {
			CalculadoraModel.setVisorModel(CalculadoraModel.getVisorModel() + "8");
			calculadoraTela.getVisor().setText(CalculadoraModel.getVisorModel());
		}
		if (e.getSource() == calculadoraTela.getN9()) {
			CalculadoraModel.setVisorModel(CalculadoraModel.getVisorModel() + "9");
			calculadoraTela.getVisor().setText(CalculadoraModel.getVisorModel());
		}

		if (e.getSource() == calculadoraTela.getAdicao()) {
			CalculadoraModel.setVisorModel(CalculadoraModel.getVisorModel() + " + ");
			calculadoraTela.getVisor().setText(CalculadoraModel.getVisorModel());

		}

		if (e.getSource() == calculadoraTela.getSubtracao()) {
			CalculadoraModel.setVisorModel(CalculadoraModel.getVisorModel() + " - ");
			calculadoraTela.getVisor().setText(CalculadoraModel.getVisorModel());
		}

		if (e.getSource() == calculadoraTela.getDivisao()) {
			CalculadoraModel.setVisorModel(CalculadoraModel.getVisorModel() + " / ");
			calculadoraTela.getVisor().setText(CalculadoraModel.getVisorModel());
		}

		if (e.getSource() == calculadoraTela.getMultiplicao()) {
			CalculadoraModel.setVisorModel(CalculadoraModel.getVisorModel() + " * ");
			calculadoraTela.getVisor().setText(CalculadoraModel.getVisorModel());
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

			CalculadoraModel.setVisorModel("" + resultado + "");
			calculadoraTela.getVisor().setText(CalculadoraModel.getVisorModel());

		}

		if (e.getSource() == calculadoraTela.getVirgula()) {
			CalculadoraModel.setVisorModel(CalculadoraModel.getVisorModel() + ".");
			calculadoraTela.getVisor().setText(CalculadoraModel.getVisorModel());
		}

		if (e.getSource() == calculadoraTela.getUmSobreX()) {
			CalculadoraModel.setVisorModel(CalculadoraModel.getVisorModel() + " 1/ ");
			calculadoraTela.getVisor().setText(CalculadoraModel.getVisorModel());
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
			CalculadoraModel.setVisorModel(CalculadoraModel.getVisorModel() + " +- -1");
			calculadoraTela.getVisor().setText(CalculadoraModel.getVisorModel());
		}

		if (e.getSource() == calculadoraTela.getRaizQuadrada()) {
			CalculadoraModel.setVisorModel("" + CalculadoraModel.getVisorModel() + " raizQuadr 2");
			calculadoraTela.getVisor().setText(CalculadoraModel.getVisorModel());
		}

		if (e.getSource() == calculadoraTela.getxAoQuadrado()) {
			CalculadoraModel.setVisorModel(CalculadoraModel.getVisorModel() + " ² 2");
			calculadoraTela.getVisor().setText(CalculadoraModel.getVisorModel());
		}

		if (e.getSource() == calculadoraTela.getxAoCubo()) {
			CalculadoraModel.setVisorModel(CalculadoraModel.getVisorModel() + " ³ 3");
			calculadoraTela.getVisor().setText(CalculadoraModel.getVisorModel());

		}
	}

}
