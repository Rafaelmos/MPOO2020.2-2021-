package questao3_1;

import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		funcionarios.add(new Gerente("222.222.222-22", "Ana Souza"));
		funcionarios.add(new Vendedor("111.111.111-11", "João Silva"));
		
		GerenciarVendas.calcularComissao((Vendedor)funcionarios.get(1), 30000); //downcast
		
		for (Funcionario funcionarioCurrente:funcionarios)
			System.out.println(funcionarioCurrente.toString());//vinculação dinâmica 
		/*
		 * Questionamento: Por que as saídas são diferentes uma vez que são exibidos os dados de Funcionario? 
		 * Resposta: Como resultado da vinculação dinâmica, o Java decide qual método toString da classe é 
		 *           chamado em tempo de execução, em vez de em tempo de compilação. 
		 *           Ou seja: 
		 *           - Gerente utiliza toString() herdado de Funcionário
		 *           - Vendedor utiliza toString() reescrito (@Override)
		 */
	}
}