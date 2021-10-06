package questao5;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class BaseDados {
	private static ArrayList<Compra> compras = new ArrayList<Compra>();
	private static ArrayList<Venda> vendas = new ArrayList<Venda>();

	public static Compra buscarCompra(Compra compra) {
		if (compras.contains(compra)) {
			return null;
		}
		return compra;
	}

	public static Compra buscarCompra(int id) {
		for (Compra c : compras) {
			if (c.getId() == id) {
				return c;
			}
		}
		return null;
	}

	public static boolean adicionarCompra(Compra compra) {
		if (buscarCompra(compra) != null) {
			compras.add(compra);
			boolean isAdd = true;
			atualizarVendas(compra, isAdd);
		}
		return false;
	}

	public static boolean removerCompra(Compra compra) {
		if (buscarCompra(compra) != null) {
			compras.remove(compras.indexOf(buscarCompra(compra)));
			boolean isAdd = false;
			atualizarVendas(compra, isAdd);
			return true;
		}
		System.out.println("Compra não encotrada");
		return false;
	}

	public static boolean removerCompra(int id) {
		if (buscarCompra(id) != null) {
			for (Compra c : compras) {
				if (c.getId() == id) {
					compras.remove(c);
					int index = c.getId() - 1;
					atualizarVendas(index);
					System.out.println("Compra removida");
					return true;
				}
			}
		}
		System.out.println("Compra não encotrada");
		return false;
	}

	public static double totalVendas(int mes, int ano) {
		double vendasDoMes = 0;
		int numeroVendas = 1;
		for (int i = 0; i < vendas.size(); i++) {
			if (vendas.get(i).getMes() == mes && vendas.get(i).getAno() == ano) {
				vendasDoMes += vendas.get(i).getValorTotal();
				numeroVendas += i;
			}
		}
		if (numeroVendas == 1) {
			numeroVendas = 0;
		}
		System.out.println("O número de vendas foi " + numeroVendas);
		return vendasDoMes;
	}

	public static boolean atualizarVendas(Compra compra, boolean isAdd) {
		Venda venda = new Venda(0, 0, 0);
		Date d = compra.getDate();
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		int ano = c.get(Calendar.YEAR);
		int mes = c.get(Calendar.MONTH);
		venda.setMes(mes);
		venda.setAno(ano);
		venda.setValorTotal(compra.getValorTotal());
		if (isAdd) {
			return vendas.add(venda);
		} else if (!isAdd) {
			System.out.println("Venda não encontrada");
			return false;
		}
		System.out.println("Nem adicinou nem removeu, pois obj não existe");
		return false;
	}

	public static void atualizarVendas(int index) {
		vendas.remove(index);
	}

	public static ArrayList<Compra> getCompras() {
		for (Compra compra : compras) {
			
		}
		return compras;
	}

	public static ArrayList<Venda> getVendas() {
		return vendas;
	}

}
