package questao3;

public class App {

	public static void main(String[] args) {
		Horista horista = new Horista("Roberto", "105.839.137-25", 0, 100, 120);

		horista.calcularPagamento();

		System.out.println(horista);

		Comissionado comissionado = new Comissionado("Patricia", "047.583.668-53", 0, 0, 0.1);

		comissionado.somarVendas(10000);
		comissionado.calcularPagamento();

		System.out.println(comissionado);
	}

}
