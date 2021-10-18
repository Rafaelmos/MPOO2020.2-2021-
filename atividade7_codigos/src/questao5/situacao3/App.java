package questao5.situacao3;

public class App {

	public static void main(String[] args) {
		Produto produto = new Produto(5.5, "Arroz");
		Produto produto1 = new Produto(4.5, "Farinha");
		Caixa caixa = new Caixa("Roberto", "M", "105.839.137-25");
		Gerente gerente = new Gerente("Patricia", "C", "047.583.668-53");

		SuperFuncionario superFuncionario = new SuperFuncionario("Rafael", "JM", "047.583.668-58");

		BaseDados.createFuncionario(superFuncionario);

		superFuncionario.contratarFuncionarios(caixa);
		superFuncionario.contratarFuncionarios(gerente);
//		superFuncionario.contratarFuncionarios(gerente);

//		superFuncionario.demitirFuncionario(gerente);

		for (Funcionario f : BaseDados.getFuncionarios()) {
			System.out.println(f);
		}

	}
}