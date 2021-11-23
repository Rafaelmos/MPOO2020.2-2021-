package model;

import java.util.Date;

public class PacienteModel extends Model {

	private String nome, cpf, telofone, dadosConsulta;
	private Date dataNascimento;
	private EnderecoModel enderecoModel;
	private FichaAtendimentoModel atendimentoModel;

	public PacienteModel(String nome, String cpf, String telofone, String dadosConsulta, Date dataNascimento,
			EnderecoModel enderecoModel, FichaAtendimentoModel atendimentoModel) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telofone = telofone;
		this.dadosConsulta = dadosConsulta;
		this.dataNascimento = dataNascimento;
		this.enderecoModel = enderecoModel;
		this.atendimentoModel = atendimentoModel;
	}

	public PacienteModel consultar(String texto) {
		return this;
	}

	public int incrementador(int numero) {
		numero = Integer.parseInt(atendimentoModel.getNumero());
		numero++;
		setChanged();
		notifyObservers(numero);
		return numero;
	}
	
	public String mudarString(String nome) {
		setChanged();
		notifyObservers(nome);
		return nome;
	}

	public FichaAtendimentoModel getAtendimentoModel() {
		return atendimentoModel;
	}
}
