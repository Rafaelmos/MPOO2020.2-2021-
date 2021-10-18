package questao5.situacao1;

public class App {

	public static void main(String[] args) {
		Produto produto = new Produto(5.5, "Arroz");
		Produto produto1 = new Produto(4.5, "Farinha");

		Caixa caixa = new Funcionario("Roberto", "M", "105.839.137-25");
		Gerente gerente = new Funcionario("Patricia", "C", "047.583.668-53");
		SuperFuncionario superFuncionario = new Funcionario("Rafael", "JM", "047.583.668-58");
		Funcionario funcionario = new Funcionario("Martinez", "Martinez", "047.583.668-59");

		// Só é possivel criar Funcionarios de outros tipo se fizer um downcasting.
		BaseDados.createFuncionario(funcionario);
		BaseDados.createFuncionario((Funcionario) gerente);
		BaseDados.createFuncionario((Funcionario) caixa);
		BaseDados.createFuncionario((Funcionario) superFuncionario);

		System.out.println(BaseDados.getFuncionarios());
	}
}