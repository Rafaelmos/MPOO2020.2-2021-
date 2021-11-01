package View;


import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;

public class CalculadoraTela {
	JButton n0, n1, n2, n3, n4, n5, n6, n7, n8, n9, virgula;
	JButton adicao, subtracao, multiplicao, divisao, igual;
	JButton umSobreX, xAoCubo, xAoQuadrado, raizQuadrada, maisOuMenos, c, delete;
	JFormattedTextField visor;
	int h = 35;
	int w = 45;
	int y = 25;
	int x = 45;
	float resultado = 0;

	public CalculadoraTela() {
		JFrame calculadora = new JFrame("Calculadora");
		calculadora.setSize(260, 255);
		calculadora.setResizable(false);
		calculadora.setLayout(null);
		calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		visor = new JFormattedTextField(0);
		n0 = new JButton("0");
		n1 = new JButton("1");
		n2 = new JButton("2");
		n3 = new JButton("3");
		n4 = new JButton("4");
		n5 = new JButton("5");
		n6 = new JButton("6");
		n7 = new JButton("7");
		n8 = new JButton("8");
		n9 = new JButton("9");
		virgula = new JButton(",");
		adicao = new JButton("+");
		subtracao = new JButton("-");
		multiplicao = new JButton("*");
		divisao = new JButton("/");
		igual = new JButton("=");
		umSobreX = new JButton("1/X");
		xAoCubo = new JButton("X³");
		delete = new JButton("←");
		c = new JButton("c");
		maisOuMenos = new JButton("±");
		raizQuadrada = new JButton("√");
		xAoQuadrado = new JButton("X²");

		visor.setBounds(0, 0, 250, 25);
		visor.setBorder(null);
		calculadora.add(visor);

		delete.setBounds(0, y, w, h);
		delete.setBorder(null);
		calculadora.add(delete);

		c.setBounds(x+1, y, w, h);
		c.setBorder(null);
		calculadora.add(c);

		maisOuMenos.setBounds(2*x+2, y, w, h);
		maisOuMenos.setBorder(null);
		calculadora.add(maisOuMenos);

		raizQuadrada.setBounds(3*x+3, y, w, h);
		raizQuadrada.setBorder(null);
		calculadora.add(raizQuadrada);

		xAoQuadrado.setBounds(4*x+4, y, w + 10, h);
		xAoQuadrado.setBorder(null);

		calculadora.add(xAoQuadrado);

		n7.setBounds(0, y+h+1, w, h);
		n7.setBorder(null);
		calculadora.add(n7);

		n8.setBounds(x+1, y+h+1, w, h);
		n8.setBorder(null);
		calculadora.add(n8);

		n9.setBounds(2*x+2, y+h+1, w, h);
		n9.setBorder(null);
		calculadora.add(n9);

		divisao.setBounds(3*x+3, y+h+1, w, h);
		divisao.setBorder(null);
		calculadora.add(divisao);

		xAoCubo.setBounds(4*x+4, y+h+1, w + 10, h);
		xAoCubo.setBorder(null);
		calculadora.add(xAoCubo);

		n4.setBounds(0, y + y+h+12, w, h);
		n4.setBorder(null);
		calculadora.add(n4);

		n5.setBounds(x+1, y + y+h+12, w, h);
		n5.setBorder(null);
		calculadora.add(n5);

		n6.setBounds(2*x+2, y + y+h+12, w, h);
		n6.setBorder(null);
		calculadora.add(n6);

		multiplicao.setBounds(3*x+3, y + y+h+12, w, h);
		multiplicao.setBorder(null);
		calculadora.add(multiplicao);

		umSobreX.setBounds(4*x+4, y + y+h+12, w + 10, h);
		umSobreX.setBorder(null);
		calculadora.add(umSobreX);

		n1.setBounds(0, y + y+2*h+13, w, h);
		n1.setBorder(null);
		calculadora.add(n1);

		n2.setBounds(x+1, y + y+2*h+13, w, h);
		n2.setBorder(null);
		calculadora.add(n2);

		n3.setBounds(2*x+2, y + y+2*h+13, w, h);
		n3.setBorder(null);
		calculadora.add(n3);

		subtracao.setBounds(3*x+3, y + y+2*h+13, w, h);
		subtracao.setBorder(null);
		calculadora.add(subtracao);

		igual.setBounds(4*x+4, y + y+2*h+13, w + 10, 2*h+1);
		igual.setBorder(null);
		calculadora.add(igual);

		n0.setBounds(0, y + y+3*h+14, 2 * w+1, h);
		n0.setBorder(null);
		calculadora.add(n0);

		virgula.setBounds(2*x+2, y + y+3*h+14, w, h);
		virgula.setBorder(null);
		calculadora.add(virgula);

		adicao.setBounds(3*x+3, y + y+3*h+14, w, h);
		adicao.setBorder(null);
		calculadora.add(adicao);
		calculadora.setVisible(true);

	}

}
