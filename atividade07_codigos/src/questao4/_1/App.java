package questao4._1;

public class App {
	private Funcionario funcionario;
	private Caixa caixa;
	private Gerente gerente;

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Roberto", 1);
		Caixa caixa = new Funcionario("Patricia", 2);
		Gerente gerente = new Funcionario("Claudio", 3);

		funcionario.darDesconto();
		funcionario.vender();

		caixa.vender();

		gerente.darDesconto();
		gerente.vender();

		System.out.println(funcionario);
		System.out.println(caixa);
		System.out.println(gerente);

		/** Questão 4.4
		 * Mesmo um gerente não iria conseguir acessar sem downcasting, pois
		 * o Fincaneiro só recebe o parametro do Objeto Funcionario
		 */
		Financeiro.verGrana((Funcionario) gerente);

		/** Questão 4.4
		 * Na teoria era para ser assim, dar um downcasting no caixa de
		 * depois um upcasting para gerente
		 */
		// Financeiro.verGrana((Gerente) ((Funcionario) caixa));
		Financeiro.verGrana((Funcionario) caixa);

	}

}
