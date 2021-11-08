package questao1;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

public class CalculadoraTela extends JFrame {
	CalculadoraController calculadoraController;
	private JButton n0, n1, n2, n3, n4, n5, n6, n7, n8, n9, virgula;
	private JButton adicao, subtracao, multiplicao, divisao, igual;
	private JButton umSobreX, xAoCubo, xAoQuadrado, raizQuadrada, maisOuMenos, c, delete;
	private JFormattedTextField visor;
	int h = 35;
	int w = 45;
	int y = 30;
	int x = 45;
	float resultado = 0;
	Color color1 = new Color(176, 196, 222);
	Color color2 = new Color(220, 220, 220);

	public CalculadoraTela() {
		super("Calculadora");
		setSize(260, 255);
		setResizable(false);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calculadoraController = new CalculadoraController(this);
		visor = new JFormattedTextField(0);
		
		visor.setHorizontalAlignment(SwingConstants.RIGHT);
		visor.setBackground(Color.white);
		visor.setEditable(false);

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
		delete = new JButton(" ←");
		c = new JButton("c");
		maisOuMenos = new JButton("±");
		raizQuadrada = new JButton("√");
		xAoQuadrado = new JButton("X²");

		visor.setBounds(0, 5, 243, 25);
		visor.setBorder(null);
		add(visor);

		delete.setBounds(0, y + 5, w, h);
		delete.setBorder(null);
		delete.setBackground(color1);
		delete.addActionListener(calculadoraController);
		add(delete);
		

		c.setBounds(x + 1, y + 5, w, h);
		c.setBorder(null);
		c.setBackground(color1);
		c.addActionListener(calculadoraController);
		add(c);

		maisOuMenos.setBounds(2 * x + 2, y + 5, w, h);
		maisOuMenos.setBorder(null);
		maisOuMenos.setBackground(color1);
		maisOuMenos.addActionListener(calculadoraController);
		add(maisOuMenos);

		raizQuadrada.setBounds(3 * x + 3, y + 5, w, h);
		raizQuadrada.setBorder(null);
		raizQuadrada.setBackground(color1);
		raizQuadrada.addActionListener(calculadoraController);
		add(raizQuadrada);

		xAoQuadrado.setBounds(4 * x + 4, y + 5, w + 12, h);
		xAoQuadrado.setBorder(null);
		xAoQuadrado.setBackground(color1);
		xAoQuadrado.addActionListener(calculadoraController);
		add(xAoQuadrado);

		n7.setBounds(0, y + h + 6, w, h);
		n7.setBorder(null);
		n7.setBackground(color2);
		n7.addActionListener(calculadoraController);
		add(n7);

		n8.setBounds(x + 1, y + h + 6 , w, h);
		n8.setBorder(null);
		n8.setBackground(color2);
		n8.addActionListener(calculadoraController);
		add(n8);

		n9.setBounds(2 * x + 2, y + h + 6, w, h);
		n9.setBorder(null);
		n9.setBackground(color2);
		n9.addActionListener(calculadoraController);
		add(n9);

		divisao.setBounds(3 * x + 3, y + h + 6, w, h);
		divisao.setBorder(null);
		divisao.setBackground(color1);
		divisao.addActionListener(calculadoraController);
		add(divisao);

		xAoCubo.setBounds(4 * x + 4, y + h + 6, w + 12, h);
		xAoCubo.setBorder(null);
		xAoCubo.setBackground(color1);
		xAoCubo.addActionListener(calculadoraController);
		add(xAoCubo);

		n4.setBounds(0, y + y + h + 12, w, h);
		n4.setBorder(null);
		n4.setBackground(color2);
		n4.addActionListener(calculadoraController);
		add(n4);

		n5.setBounds(x + 1, y + y + h + 12, w, h);
		n5.setBorder(null);
		n5.setBackground(color2);
		n5.addActionListener(calculadoraController);
		add(n5);

		n6.setBounds(2 * x + 2, y + y + h + 12, w, h);
		n6.setBorder(null);
		n6.setBackground(color2);
		n6.addActionListener(calculadoraController);
		add(n6);

		multiplicao.setBounds(3 * x + 3, y + y + h + 12, w, h);
		multiplicao.setBorder(null);
		multiplicao.setBackground(color1);
		multiplicao.addActionListener(calculadoraController);
		add(multiplicao);

		umSobreX.setBounds(4 * x + 4, y + y + h + 12, w + 12, h);
		umSobreX.setBorder(null);
		umSobreX.setBackground(color1);
		umSobreX.addActionListener(calculadoraController);
		add(umSobreX);

		n1.setBounds(0, y + y + 2 * h + 13, w, h);
		n1.setBorder(null);
		n1.setBackground(color2);
		n1.addActionListener(calculadoraController);
		add(n1);

		n2.setBounds(x + 1, y + y + 2 * h + 13, w, h);
		n2.setBorder(null);
		n2.setBackground(color2);
		n2.addActionListener(calculadoraController);
		add(n2);

		n3.setBounds(2 * x + 2, y + y + 2 * h + 13, w, h);
		n3.setBorder(null);
		n3.setBackground(color2);
		n3.addActionListener(calculadoraController);
		add(n3);

		subtracao.setBounds(3 * x + 3, y + y + 2 * h + 13, w, h);
		subtracao.setBorder(null);
		subtracao.setBackground(color1);
		subtracao.addActionListener(calculadoraController);
		add(subtracao);

		igual.setBounds(4 * x + 4, y + y + 2 * h + 13, w + 12, 2 * h + 1);
		igual.setBorder(null);
		igual.setBackground(color1);
		igual.addActionListener(calculadoraController);
		add(igual);

		n0.setBounds(0, y + y + 3 * h + 14, 2 * w + 1, h);
		n0.setBorder(null);
		n0.setBackground(color2);
		n0.addActionListener(calculadoraController);
		add(n0);

		virgula.setBounds(2 * x + 2, y + y + 3 * h + 14, w, h);
		virgula.setBorder(null);
		virgula.setBackground(color2);
		virgula.addActionListener(calculadoraController);
		add(virgula);

		adicao.setBounds(3 * x + 3, y + y + 3 * h + 14, w, h);
		adicao.setBorder(null);
		adicao.setBackground(color1);
		adicao.addActionListener(calculadoraController);
		add(adicao);
		setVisible(true);

	}

	public JButton getN0() {
		return n0;
	}

	public JButton getN1() {
		return n1;
	}

	public JButton getN2() {
		return n2;
	}

	public JButton getN3() {
		return n3;
	}

	public JButton getN4() {
		return n4;
	}

	public JButton getN5() {
		return n5;
	}

	public JButton getN6() {
		return n6;
	}

	public JButton getN7() {
		return n7;
	}

	public JButton getN8() {
		return n8;
	}

	public JButton getN9() {
		return n9;
	}

	public JButton getVirgula() {
		return virgula;
	}

	public JButton getAdicao() {
		return adicao;
	}

	public JButton getSubtracao() {
		return subtracao;
	}

	public JButton getMultiplicao() {
		return multiplicao;
	}

	public JButton getDivisao() {
		return divisao;
	}

	public JButton getIgual() {
		return igual;
	}

	public JButton getUmSobreX() {
		return umSobreX;
	}

	public JButton getxAoCubo() {
		return xAoCubo;
	}

	public JButton getxAoQuadrado() {
		return xAoQuadrado;
	}

	public JButton getRaizQuadrada() {
		return raizQuadrada;
	}

	public JButton getMaisOuMenos() {
		return maisOuMenos;
	}

	public JButton getC() {
		return c;
	}

	public JButton getDelete() {
		return delete;
	}

	public JFormattedTextField getVisor() {
		return visor;
	}

	
}
