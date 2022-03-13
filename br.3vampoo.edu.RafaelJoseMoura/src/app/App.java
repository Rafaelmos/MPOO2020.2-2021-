package app;

import controller.AberturaController;
import model.Adminstrador;
import model.BaseDados;
import model.Compra;
import model.Constante;
import model.Funcionario;
import model.FuncionarioException;
import model.Gerente;
import model.Item;
import model.Loja;
import model.Vendedor;
import view.Mensagem;
import view.TelaAberturaShop;
import view.TelaSistemaShop;

public class App {

	public static void main(String[] args) {

		BaseDados.inicializarBase();
		Loja loja = new Loja("Loja Mpoo", "00.000.000/00000-00");
		Item item1 = new Item("CD001", " Faca Peixeira", 60);
		Item item2 = new Item("CD002", " Tábua de Churrasco", 50);
		Vendedor vendedor1 = new Vendedor("João Santos", "111.111.111-11");
		Vendedor vendedor2 = new Vendedor("José Silva", "222.222.222-22");
		Vendedor vendedor3 = new Vendedor("Maria Linda", "333.333.333-33");
		Gerente gerente = new Gerente("Beto Alves", "444.444.444-44", "beto123");
		Adminstrador adminstrador1 = new Adminstrador("admin001", "abcd");
		Adminstrador adminstrador2 = new Adminstrador("admin002", "123ABC");
		BaseDados base = new BaseDados();
		base.getAdminstradores().add(adminstrador1);
		base.getAdminstradores().add(adminstrador2);

		
		BaseDados.getItens().add(item1);
		BaseDados.getItens().add(item1);
		BaseDados.getItens().add(item2);
		BaseDados.getItens().add(item2);
		BaseDados.getItens().add(item2);
		try {
			BaseDados.adicionarFuncionario(vendedor1);
			BaseDados.adicionarFuncionario(vendedor2);
			BaseDados.adicionarFuncionario(vendedor3);
			BaseDados.adicionarFuncionario(gerente);
		} catch (FuncionarioException e1) {
			Mensagem.exibirMensagem(Constante.FUNCIONARIO_EXISTE);
		}

		
		Compra compra1 = new Compra(vendedor1);
		vendedor1.realizarVenda(item1, compra1);
		vendedor1.realizarVenda(item2, compra1);
		BaseDados.getCompras().add(compra1);

		Compra compra2 = new Compra(gerente);
		gerente.realizarVenda(item1, compra2);
		gerente.realizarVenda(item2, compra2);
		gerente.darDesconto(compra2);
		BaseDados.getCompras().add(compra2);


		
		
		new AberturaController();

		try {
			loja.sleep(1000);
			for (Compra compra : BaseDados.getCompras()) {
				loja.calcularComissaoVendedor(compra);
				System.out.println(compra.getValor());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		

	}
}
