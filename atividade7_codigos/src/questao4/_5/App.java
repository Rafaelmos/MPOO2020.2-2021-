package questao4._5;

public class App {
	private Funcionario funcionario;
	private CaixaInterface caixa;
	private GerenteInterface gerente;

	public static void main(String[] args) {
		Caixa caixa = new Caixa("Patricia", 1);
		Gerente gerente = new Gerente("Roberto", 2);

		// caixa.verGrana();
		caixa.vender();

		gerente.darDesconto();
		gerente.vender();
		gerente.verGrana(gerente);

		System.out.println(caixa);
		System.out.println(gerente);

	}

}
