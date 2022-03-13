package questao3_1;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		funcionarios.add(new Gerente("222.222.222-22", "Ana Souza"));
		funcionarios.add(new Vendedor("111.111.111-11", "João Silva"));
		
		GerenciarVendas.calcularComissao((Vendedor)funcionarios.get(1), 30000); 
		
		for (Funcionario funcionarioCurrent:funcionarios)
			System.out.println(funcionarioCurrent.toString());
	}
}