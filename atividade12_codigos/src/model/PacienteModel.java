package model;

import java.util.Date;

import view.FilaPanel;

public class PacienteModel extends Model {

	private String nome, cpf, telofone, dadosConsulta;
	private Date dataNascimento;
	private EnderecoModel enderecoModel;
	private FichaAtendimentoModel atendimentoModel;


	public PacienteModel(int numero) {
		incrementador(numero);
	}
	
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
		numero = Integer.parseInt(FilaPanel.getNomeLabel().getText());
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelofone() {
		return telofone;
	}

	public void setTelofone(String telofone) {
		this.telofone = telofone;
	}

	public String getDadosConsulta() {
		return dadosConsulta;
	}

	public void setDadosConsulta(String dadosConsulta) {
		this.dadosConsulta = dadosConsulta;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public EnderecoModel getEnderecoModel() {
		return enderecoModel;
	}

	public void setEnderecoModel(EnderecoModel enderecoModel) {
		this.enderecoModel = enderecoModel;
	}

	public void setAtendimentoModel(FichaAtendimentoModel atendimentoModel) {
		this.atendimentoModel = atendimentoModel;
	}
	
	
}
