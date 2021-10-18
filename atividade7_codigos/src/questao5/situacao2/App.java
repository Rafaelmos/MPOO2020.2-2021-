package questao5.situacao2;

public class App {

	public static void main(String[] args) {
		Produto produto = new Produto(5.5, "Arroz");
		Produto produto1 = new Produto(4.5, "Farinha");
		Caixa caixa = new Funcionario("Roberto", "M", "105.839.137-25");
		Gerente gerente = new Funcionario("Patricia", "C", "047.583.668-53");
		SuperFuncionario superFuncionario = new Funcionario("Rafael", "JM", "047.583.668-58");
		Funcionario funcionario = new Funcionario("Martinez", "Martinez", "047.583.668-59");

		// Esses dois métodos não funcionam direito nem com casting, pois quando se contrata um
		// funcionário de qualquer tipo dando casting, ele só será adicionado na array de funcionario
		superFuncionario.contratarFuncionarios((Funcionario) gerente);
//		superFuncionario.contratarFuncionarios(gerente);
//		superFuncionario.contratarFuncionarios(gerente);
//		superFuncionario.demitirFuncionario(gerente);
		System.out.println(BaseDados.getGerentes());
		System.out.println(BaseDados.getFuncionarios());

//		BaseDados.createFuncionario(caixa);
//		BaseDados.createFuncionario(gerente);
//		BaseDados.createFuncionario(superFuncionario);
//		BaseDados.createFuncionario(funcionario);
//		BaseDados.deleteFuncionario(caixa);



	}
}