package questao4._5;

public interface GerenteInterface extends Venda {

	public void darDesconto();

	public default void verGrana(Funcionario funcionario) {
		Financeiro.verGrana(funcionario);
	}

	public class Financeiro {
		private static double FINANCEIRO;

		public static double verGrana(Funcionario funcionario) {
			if (funcionario instanceof Gerente)
				return FINANCEIRO;
			return 0.0;
		}

		public static void setFINANCEIRO(double financeiro) {
			FINANCEIRO = financeiro;
		}

	}
}
