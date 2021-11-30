package view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class CadastrarMoedaPanel extends JPanel{
	private JLabel tipoJLabel, valorJLabel, anoLancamentoJLabel, paisJLabel, estadoJLabel;
	private JTextField tipoField, valorField, anoLancamentoField, paisField, estadoField;
	
	public CadastrarMoedaPanel() {
		setLayout(new SpringLayout());
		tipoJLabel = new JLabel("Tipo: ");
		valorJLabel = new JLabel("Valor: ");
		anoLancamentoJLabel = new JLabel("Ano de Lançamento: ");
		paisJLabel = new JLabel("País: ");
		estadoJLabel = new JLabel("Estado: ");		
		tipoField  = new  JTextField(10);
		valorField  = new  JTextField(10);
		anoLancamentoField  = new  JTextField(10);
		paisField = new JTextField(10);
		estadoField = new JTextField(10);
		
		add(tipoJLabel);
		add(tipoField);
		
		add(valorJLabel);
		add(valorField);
		
		add(anoLancamentoJLabel);
		add(anoLancamentoField);
		
		add(paisJLabel);
		add(paisField);
		
		add(estadoJLabel);
		add(estadoField);
		
		SpringUtilities.makeCompactGrid(this, 5, 2, 1, 1, 1, 1);
		
	}

	public JTextField getTipoField() {
		return tipoField;
	}

	public JTextField getValorField() {
		return valorField;
	}

	public JTextField getAnoLancamentoField() {
		return anoLancamentoField;
	}

	public JTextField getPaisField() {
		return paisField;
	}

	public JTextField getEstadoField() {
		return estadoField;
	}
	
	

}
