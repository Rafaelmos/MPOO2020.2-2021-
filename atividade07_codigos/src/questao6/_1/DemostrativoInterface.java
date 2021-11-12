package questao6._1;

public interface DemostrativoInterface {

	public static void calcularDesmotrativo(double valor) {
		BaseDados.getDemostrativo().setValorTotal(BaseDados.getDemostrativo().getValorTotal() - valor);

	}
}
