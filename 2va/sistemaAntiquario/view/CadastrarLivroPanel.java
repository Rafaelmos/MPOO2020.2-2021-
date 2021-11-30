package view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class CadastrarLivroPanel extends JPanel{
	private JLabel isbnJLabel, tituloLabel, autorJLabel, editoraJLabel, volumejJLabel, anoJLabel;
	private JTextField isbnField, tituloField, autorField, editoraField, volumeField, anoField;
	
	public CadastrarLivroPanel() {
		setLayout(new SpringLayout());
		isbnJLabel = new JLabel("ISBN: ");
		tituloLabel = new JLabel("Título: ");
		autorJLabel = new JLabel("Autor: ");
		editoraJLabel = new JLabel("Editora: ");
		volumejJLabel = new JLabel("Volume: ");
		anoJLabel = new JLabel("Ano: ");
		isbnField = new  JTextField();
		tituloField  = new  JTextField();
		autorField  = new  JTextField();
		editoraField  = new  JTextField();
		volumeField  = new  JTextField();
		anoField  = new  JTextField();
		
		add(isbnJLabel);
		add(isbnField);
		
		add(tituloLabel);
		add(tituloField);
		
		add(autorJLabel);
		add(autorField);
		
		add(editoraJLabel);
		add(editoraField);
		
		add(volumejJLabel);
		add(volumeField);
		
		add(anoJLabel);
		add(anoField);
		
		SpringUtilities.makeCompactGrid(this, 6, 2, 1, 1, 1, 1);
		
	}

	public JTextField getTituloField() {
		return tituloField;
	}

	public void setTituloField(JTextField tituloField) {
		this.tituloField = tituloField;
	}

	public JTextField getVolumeField() {
		return volumeField;
	}

	public void setVolumeField(JTextField volumeField) {
		this.volumeField = volumeField;
	}

	public JTextField getIsbnField() {
		return isbnField;
	}

	public JTextField getAutorField() {
		return autorField;
	}

	public JTextField getEditoraField() {
		return editoraField;
	}

	public JTextField getAnoField() {
		return anoField;
	}
	
	

}
