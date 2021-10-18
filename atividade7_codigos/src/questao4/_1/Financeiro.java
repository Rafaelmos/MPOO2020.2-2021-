package questao4._1;

public class Financeiro {
	private static double FINANCEIRO;

	public static double verGrana(Funcionario funcionario) {
		if (funcionario instanceof Gerente) {
			System.out.println("entrou");
			return FINANCEIRO;
		}
		return 0.0;
	}

	public static void setFINANCEIRO(double financeiro) {
		FINANCEIRO = financeiro;
	}

}
